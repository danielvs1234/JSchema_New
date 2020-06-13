/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.jSchema.Model
import org.xtext.example.mydsl.jSchema.PrimitiveObject
import org.xtext.example.mydsl.jSchema.MainObject
import org.xtext.example.mydsl.jSchema.Property
import javax.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import java.util.ArrayList
import org.xtext.example.mydsl.jSchema.hasProperties
import org.xtext.example.mydsl.generator.ObjectClass
import org.xtext.example.mydsl.jSchema.PrimitiveProperties
import org.xtext.example.mydsl.jSchema.ExtendedObject
import java.util.Iterator
import org.xtext.example.mydsl.jSchema.ExtendedProperties
import com.google.gson.stream.MalformedJsonException

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JSchemaGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider
	ArrayList<PrimitiveObject> primitiveObjectList;
	ArrayList<MainObject> mainObjectList;
	ArrayList<ObjectClass> compiledMainObjects;
	ArrayList<PrimitiveObjectClass> compiledPrimitiveObjects;
	ArrayList<ExtendedObjectClass> compiledExtendedObjectList;
	FileController fileController;
	JsonFormatter jsonFormatter;

	// Edit for writing file to custom directory
	val filePath = "C:/Users/danie/Desktop/testFile.json"

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		primitiveObjectList = new ArrayList<PrimitiveObject>()
		mainObjectList = new ArrayList<MainObject>()
		compiledPrimitiveObjects = new ArrayList<PrimitiveObjectClass>()
		compiledMainObjects = new ArrayList<ObjectClass>()
		compiledExtendedObjectList = new ArrayList<ExtendedObjectClass>()

		val abstractObjects = resource.allContents.filter(Model).next
		jsonFormatter = new JsonFormatter();
		fileController = new FileController(filePath)

		System.out.println("Amount of primitive objects found: " + primitiveObjectList.size())

		for (primObj : resource.allContents.toIterable.filter(PrimitiveObject)) {
			// compile all primitive objects
			compiledPrimitiveObjects.add(compilePrimitiveObject(primObj));
		}

		for (obj : resource.allContents.toIterable.filter(MainObject)) {
			var bool = "false"
			var rootBool = "false"
			if (checkIfObjectContainsOtherObjects(obj) == true) {
				bool = "true"
			}
			if (obj.root != null) {
				rootBool = "true"
			}
			System.out.println(
				"Contains other objects: " + bool + "  " + obj.objectName.toString() + " PropertyListSize= " +
					getProperties(obj).size() + " isRoot: " + rootBool)
			// Compile all main objects
			compiledMainObjects.add(compileMainObject(obj));

		}
			for (exObj : resource.allContents.toIterable.filter(ExtendedObject)) {
				// compileExtendedObjects
				val ExtendedObjectClass extendedObj = compileExtendedObject(exObj)
				if(extendedObj !== null){
				compiledExtendedObjectList.add(extendedObj)
				}
		}

		for (ObjectClass compiledObject : compiledMainObjects) {
			if (compiledObject.isRoot == true) {
				var StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("{\n")
				stringBuilder.append(compiledObject.objectJSchemaString);
				stringBuilder.append("\n}")
				val formattedString = jsonFormatter.formatString(stringBuilder.toString())
				//System.out.println(stringBuilder.toString)
				
				System.out.println(formattedString)
				fileController.writeFile(formattedString)
			// fsa.generateFile("testFile.json", jsonFormatter.formatString(stringBuilder.toString()))
			}
		}

	

	}

	def ExtendedObjectClass compileExtendedObject(ExtendedObject obj) {
		var doesSuperObjectExist = false;
		var ExtendedObjectClass tempObject;
		var ObjectClass superObject;

		for (ObjectClass mainObj : compiledMainObjects) {
			if (obj.getExtendsID == mainObj.name) {
				doesSuperObjectExist = true;
				superObject = mainObj
			}
		}

		if (doesSuperObjectExist == true) {
			tempObject = new ExtendedObjectClass(obj, superObject);

			// set included Objects from SuperObject
			if (superObject.includedMainObjects.size() != 0) {
				tempObject.includedMainObjects = superObject.includedMainObjects
			}

			if (superObject.includedPrimitiveObjects.size() != 0) {
				tempObject.includedPrimitiveObjects = superObject.includedPrimitiveObjects
			}

			// check if ExtendedObject holds any includes, and if any duplicates are found, remove these before adding to ExtendedObject
			val ArrayList<String> includeNameList = new ArrayList<String>()
			if (obj.includeObjects !== null) {
				for (String str : obj.includeObjects.objectID) {
					includeNameList.add(str)
				}

				val ArrayList<String> namesForDeletion = new ArrayList<String>()
				for (String includedName : includeNameList) {

					for (ObjectClass mainObj : compiledMainObjects) {
						if (mainObj.name == includedName) {
							for (ObjectClass alreadyAddedObject : tempObject.includedMainObjects) {
								if (alreadyAddedObject.name == includedName) {
									namesForDeletion.add(includedName)
								} else {
									// Show error stating that Included MainObject is already inherited
								}
							}
						}
					}

					for (PrimitiveObjectClass compPrimObj : compiledPrimitiveObjects) {
						if (compPrimObj.name == includedName) {
							for (PrimitiveObjectClass alreadyAddedPrimitiveObject : tempObject.
								includedPrimitiveObjects) {
								if (alreadyAddedPrimitiveObject.name == includedName) {
									namesForDeletion.add(includedName)
								} else {
									// Show Error stating that Included PrimObject is already inherited
								}
							}
						}
					}
				}

				if (includeNameList.size() != 0) {

					// Remove objects already included through inheritance
					var Iterator<String> iterator = includeNameList.iterator();
					while (iterator.hasNext()) {
						val String name = iterator.next();
						for (String deletionName : namesForDeletion) {
							if (name == deletionName)
								iterator.remove();
						}
					}

					for (String objectName : includeNameList) {
						for (ObjectClass includedMainObject : compiledMainObjects) {
							if (includedMainObject.name == objectName) {
								tempObject.addMainObject(includedMainObject)
							}
						}
						for (PrimitiveObjectClass includedPrimitiveObject : compiledPrimitiveObjects) {
							if (includedPrimitiveObject.name == objectName) {
								tempObject.addPrimitiveObject(includedPrimitiveObject)
							}
						}
					}
				}
			}

			// Check if extended Object holds any nested properties or overidden properties. And check if nested properties does not exists on super
			// and that overidden properties does in fact exists on super.
			val ArrayList<ObjectClass> superMainObjectProperties = superObject.hasMainObjectPropertiesList
			val ArrayList<PrimitiveObjectClass> superPrimitiveProperties = superObject.hasPrimtiveObjectPropertiesList
			val ArrayList<ExtendedObjectClass> superExtendedObjectProperties = superObject.hasExtendedObjectPropertiesList

			for (ExtendedProperties property : obj.getBody) {

				if (property.override !== null) {
					
					//Check if overridden property is of type Main Object
					if (property.extendedProperties.properties.propObj !== null) {
						val sizeOfsuperMainObjectPropertiesBeforeRemoval = superMainObjectProperties.size()
						val propertyName = property.extendedProperties.properties.propObj.objectName

						// Remove Main Objects from list of inherited objects, if object name, matches overridden object name
						var Iterator<ObjectClass> iterator = superMainObjectProperties.iterator();
						while (iterator.hasNext()) {
							val ObjectClass object = iterator.next();
							if (propertyName == object.getName) {
								iterator.remove();
								tempObject.addHasMainObj(compileMainObject(property.extendedProperties.properties.propObj))
							}
						}
						
						if(sizeOfsuperMainObjectPropertiesBeforeRemoval == superMainObjectProperties.size()){
							//Show error that Overridden property does not exist on SuperObject
							System.out.println("SuperObject does not contain: " + propertyName)
						}
						
					//Else check if overridden property is of type Primitive Object
					}else if(property.extendedProperties.properties.propPrim !== null){
						
						if(property.extendedProperties.properties.propPrim.type.string !== null){
							val primitiveObjectName = property.extendedProperties.properties.propPrim.type.string
							var Iterator<PrimitiveObjectClass> iterator = superPrimitiveProperties.iterator();
							while(iterator.hasNext()){
								val PrimitiveObjectClass object = iterator.next();
								//Check if PrimitiveObject is a String
								if(primitiveObjectName == object.valString){
									var ArrayList<PrimitiveProperties> propertyStringProperties = getPrimProperties(property.extendedProperties.properties.propPrim)
									var ArrayList<PrimitiveProperties> superStringProperties = object.stringProperties
									var ArrayList<PrimitiveProperties> tempObjectProperties = new ArrayList<PrimitiveProperties>
									
									//Check if any String properties match the super String properties, and if so remove them from the list to avoid duplicates
									//By removing any duplicates from the superStringProperties list, the code can add both the String properties from the overriden
									//object, but also from the super object, without duplicates.
									for(PrimitiveProperties pProp : propertyStringProperties){
									
									if(pProp.stringLength !== null){	
										var Iterator<PrimitiveProperties> primIterator = superStringProperties.iterator()
										while(primIterator.hasNext()){
											val PrimitiveProperties current = primIterator.next()
											if(current.stringLength !== null){
												primIterator.remove()
											}
										}
									} else if(pProp.patternString !== null){
										var Iterator<PrimitiveProperties> primIterator = superStringProperties.iterator()
										while(primIterator.hasNext()){
											val PrimitiveProperties current = primIterator.next()
											if(current.patternString !== null){
												primIterator.remove()
											}
										}
									} else if(pProp.stringFormat !== null){
										var Iterator<PrimitiveProperties> primIterator = superStringProperties.iterator()
										while(primIterator.hasNext()){
											val PrimitiveProperties current = primIterator.next()
											if(current.patternString !== null){
												primIterator.remove()
											}
										}
									}
								}
								tempObjectProperties.addAll(superStringProperties)
								tempObjectProperties.addAll(propertyStringProperties)
								
								iterator.remove()
								
								val PrimitiveObjectClass tempPrimObject = compilePrimitiveObject(property.extendedProperties.properties.propPrim)
								tempPrimObject.stringProperties = tempObjectProperties
								tempObject.addHasPrimObj(tempPrimObject)
								}
							}
							
						//Else Check if overridden property is of type array.
						}else if (property.extendedProperties.properties.propPrim.type.array !== null){
							
							var ArrayList<PrimitiveObjectClass> superObjectPrims = superObject.getAllPrimitiveObjects()
							val arrayName = property.extendedProperties.properties.propPrim.type.array.arrayName
							for(PrimitiveObjectClass primObj : superObjectPrims){
								if(primObj.primitiveObject.type.array !== null){
									if(arrayName == primObj.name){
										//If array already exists in the primitive properties of the super object, then compile the new array and at it to tempObject
										tempObject.addHasPrimObj(compilePrimitiveObject(property.extendedProperties.properties.propPrim))
									}
								}
							}
							
						}else if (property.extendedProperties.properties.propPrim.type.number !== null){
							
							var ArrayList<PrimitiveObjectClass> superObjectPrims = superObject.getAllPrimitiveObjects()
							val numberValue = property.extendedProperties.properties.propPrim.type.number.number
							
							for(PrimitiveObjectClass primObj : superObjectPrims){
								if(primObj.primitiveObject.type.number !== null){
									if(numberValue == Integer.parseInt(primObj.valNumber)){
										//If number already exists in super Object, compile new number.
										tempObject.addHasPrimObj(compilePrimitiveObject(property.extendedProperties.properties.propPrim))
									}
								}
							}
						}		
					}
				}else {
					//Compile objects if they are not overriden, but first check if they are actually part of the super Object both nested and included
					if(property.extendedProperties.properties.propObj !== null){
						//check for main objects first
						
						val allegedlyNewMainObjectName = property.extendedProperties.properties.propObj.objectName
						
						var ArrayList<ObjectClass> containedObjectInSuper = new ArrayList<ObjectClass>
						for(ObjectClass superNestedMainObject : superObject.hasMainObjectPropertiesList){
							containedObjectInSuper.add(superNestedMainObject)
						}
						for(ObjectClass superIncludedMainObject : superObject.includedMainObjects){
							containedObjectInSuper.add(superIncludedMainObject)
						}
						
						var doesObjectExists = false
						for(ObjectClass object : containedObjectInSuper){
							if(object.getName == allegedlyNewMainObjectName){
								doesObjectExists = true
								//Show error stating that new nested Main Object is already inherited from super object
								System.out.println("Nested object is already inherited from Super object (nested object name: "+ object.getName)
							}
						}
						if(doesObjectExists == false){
							//Add nested object to the tempObject of type ExtendedObjectClass
							tempObject.addHasMainObj(compileMainObject(property.extendedProperties.properties.propObj))
						}
						
					} else if(property.extendedProperties.properties.propPrim !== null){
						//Check for primitiveObjects
						var allegedlyNewPrimObjectName = ""
						if(property.extendedProperties.properties.propPrim.type.string !== null){
							allegedlyNewPrimObjectName = property.extendedProperties.properties.propPrim.type.string
						}else if(property.extendedProperties.properties.propPrim.type.array !== null){
							allegedlyNewPrimObjectName = property.extendedProperties.properties.propPrim.type.array.arrayName
						}else if(property.extendedProperties.properties.propPrim.type.number !== null){
							allegedlyNewPrimObjectName = ""+property.extendedProperties.properties.propPrim.type.number.number
						}
					
					var ArrayList<PrimitiveObjectClass> containedPrimObjectInSuper = new ArrayList<PrimitiveObjectClass>
					
					for(PrimitiveObjectClass pObjNest : superObject.hasPrimtiveObjectPropertiesList){
						containedPrimObjectInSuper.add(pObjNest)
					}
					for(PrimitiveObjectClass pObjIncl : superObject.includedPrimitiveObjects){
						containedPrimObjectInSuper.add(pObjIncl)
					}
					
					var doesPrimObjectExists = false
					for(PrimitiveObjectClass object : containedPrimObjectInSuper){
							if(object.name == allegedlyNewPrimObjectName){
								doesPrimObjectExists = true
								//Show error stating that new nested Main Object is already inherited from super object, and add the object from super
								System.out.println("Nested Primitive object is already inherited from Super object (nested object name: "+ object.name)
							}
					}
						if(doesPrimObjectExists == false){
							//Add nested object to the tempObject of type ExtendedObjectClass
							tempObject.addHasPrimObj(compilePrimitiveObject(property.extendedProperties.properties.propPrim))
						}
					}
				}
			
			}
			
			//Add all remaining nested objects from the Super Object to the Extended Object.
			var ArrayList<PrimitiveObjectClass> superObjectPrimitiveObjects = superObject.getAllPrimitiveObjects
			var ArrayList<PrimitiveObjectClass> alreadyAddedObjects = tempObject.getAllPrimitiveObjects
			
			var Iterator<PrimitiveObjectClass> primIterator = superObjectPrimitiveObjects.iterator()
				while(primIterator.hasNext()){
					val PrimitiveObjectClass supPrimObj = primIterator.next()
					for(PrimitiveObjectClass exPrimObj : alreadyAddedObjects){
						if(supPrimObj.valNumber === null){
							if(supPrimObj.name == exPrimObj.name){
								primIterator.remove()
							}
						}else{
							if(supPrimObj.valNumber == exPrimObj.valNumber){
								primIterator.remove()
							}
						}
					}	
			}
			
			for(PrimitiveObjectClass superObjectForAddition : superObjectPrimitiveObjects){
				tempObject.addHasPrimObj(superObjectForAddition)
			}
			
			
			
			//Test printer
			System.out.println("Extended Object now has " + (tempObject.hasMainObjectPropertiesList.size + tempObject.includedMainObjects.size) + " main objects")
			for(ObjectClass mainObject : tempObject.hasMainObjectPropertiesList){
				System.out.println("Nested: " + mainObject.getName)
			}
			for(ObjectClass mainObject : tempObject.includedMainObjects){
				System.out.println("Included: " + mainObject.getName)
			}
			System.out.println("Extended Object now has " + (tempObject.hasPrimtiveObjectPropertiesList.size + tempObject.includedPrimitiveObjects.size) + " Primitive objects")	
			for(PrimitiveObjectClass primObj : tempObject.hasPrimtiveObjectPropertiesList){
				System.out.println("Nested: " + primObj.name)
			}
			for(PrimitiveObjectClass primObj : tempObject.includedPrimitiveObjects){
				System.out.println("Included: " + primObj.name)
			} 
			
			
		
		}else {
			System.out.println("SuperObject does not exist!")
			// Show Error that Extended object does not exist
			return null
		}

		return tempObject
	}


	def ObjectClass compileMainObject(MainObject obj) {
		var boolean isRoot = false
		if (obj.root !== null) {
			isRoot = true;
		}
		val ObjectClass tempObject = new ObjectClass(obj.objectName, isRoot, obj)

		if (checkIfObjectContainsOtherObjects(obj) == true) {
			val ArrayList<String> includeNameList = new ArrayList<String>()

			if (obj.includeObjects !== null) {
				for (String str : obj.includeObjects.objectID) {
					includeNameList.add(str)
				}
			}
			for (String includedName : includeNameList) {
				for (ObjectClass mainObj : compiledMainObjects) {
					if (mainObj.name == includedName) {
						tempObject.addMainObject(mainObj);
					}
				}
				for (PrimitiveObjectClass compPrimObj : compiledPrimitiveObjects) {
					if (compPrimObj.name != null) {
						if (compPrimObj.name == includedName) {
							tempObject.addPrimitiveObject(compPrimObj);
						}
					}
				}
				for (ExtendedObjectClass compExtObject : compiledExtendedObjectList) {
					if(compExtObject.name == includedName) {
						tempObject.addExtendedObject(compExtObject);
					}
				}
			}

			for (hasProperties e : getProperties(obj)) {
				if (e.properties.propPrim !== null) {
					System.out.println("hasProperties = nested Primitive Object");
					tempObject.addHasPrimObj(compilePrimitiveObject(e.properties.propPrim));
				} else if (e.properties.propObj !== null) {
					System.out.println("hasProperties = nested Main Object");
					tempObject.addHasMainObj(compileMainObject(e.properties.propObj));
				} else if (e.properties.propExtObj !== null) {
					System.out.println("hasProperties = nested Extended Object");
					tempObject.addHasExtendedObj(compileExtendedObject(e.properties.propExtObj));
				}
			}

		}

		return tempObject

	}

	def PrimitiveObjectClass compilePrimitiveObject(PrimitiveObject obj) {

		var PrimitiveObjectClass temp;
		if (obj.type.string !== null) {
			var ArrayList<PrimitiveProperties> primitiveProperties = new ArrayList<PrimitiveProperties>();
			for (PrimitiveProperties primProp : obj.primitiveProperties) {
				primitiveProperties.add(primProp)
				System.out.println(primProp.toString)
			}

			temp = new PrimitiveObjectClass(obj.type.string, obj, PrimitiveType.STRING, obj.type.string,
				primitiveProperties);
		} else if (obj.type.array !== null) {
			val ArrayList<Object> arrayContent = new ArrayList<Object>();
			var ArrayType arrayType = null;
			if (obj.type.array.arrayType !== null) {
				if (ArrayType.DOUBLE.toString == obj.type.array.arrayType) {
					arrayType = ArrayType.DOUBLE;
				} else if (ArrayType.FLOAT.toString == obj.type.array.arrayType) {
					arrayType = ArrayType.FLOAT;
				} else if (ArrayType.INT.toString == obj.type.array.arrayType) {
					arrayType = ArrayType.INT;
				} else if (ArrayType.STRING.toString == obj.type.array.arrayType) {
					arrayType = ArrayType.STRING;
				}
			}
			if (obj.type.array.properties.size() > 0) {
				for (Property p : obj.type.array.properties) {
					if (p.propObj !== null) {
						arrayContent.add(compileMainObject(p.propObj))
					} else if (p.propPrim !== null) {
						arrayContent.add(compilePrimitiveObject(p.propPrim));
					}
				}
			}
			temp = new PrimitiveObjectClass(obj.type.array.arrayName.toString(), obj, PrimitiveType.ARRAY, arrayType,
				arrayContent);
		} else if (obj.type.number !== null) {
			var float number;
			var float firstNumber;
			var float decimal;
			var String numberString;
			if (obj.type.number.decimal <= 0) {
				number = obj.type.number.number
				numberString = "" + number
			} else {
				firstNumber = (obj.type.number.number as float)
				decimal = (obj.type.number.decimal as float)
				numberString = firstNumber + "." + decimal
			}
			temp = new PrimitiveObjectClass("number", obj, PrimitiveType.NUMBER, numberString);
		}
		return temp;
	}

	def checkIfObjectContainsOtherObjects(MainObject obj) {
		if (obj.includeObjects !== null || obj.properties !== null) {
			return true
		} else {
			return false
		}

	}

	def ArrayList<hasProperties> getProperties(MainObject obj) {
		val ArrayList<hasProperties> propertyList = new ArrayList<hasProperties>();
		for (hasProperties e : obj.properties) {
			propertyList.add(e);
		}
		return propertyList
	}
	
	def ArrayList<PrimitiveProperties> getPrimProperties(PrimitiveObject obj){
		var ArrayList<PrimitiveProperties> tempArrayList = new ArrayList<PrimitiveProperties>
		if(obj.type.string !== null){
			for (PrimitiveProperties e : obj.primitiveProperties){
				tempArrayList.add(e)
			}
		return tempArrayList
		}
	}

}
