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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JSchemaGenerator extends AbstractGenerator {
	
	  @Inject extension IQualifiedNameProvider
	  ArrayList<PrimitiveObject> primitiveObjectList;
	  ArrayList<MainObject>	mainObjectList;
	  ArrayList<ObjectClass> compiledMainObjects;
	  ArrayList<PrimitiveObjectClass> compiledPrimitiveObjects;
	  FileController fileController;
	  JsonFormatter jsonFormatter;
	  
	  //Edit for writing file to custom directory
	  val filePath = "C:/Users/danie/Desktop/testFile.json"

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			primitiveObjectList = new ArrayList<PrimitiveObject>()
			mainObjectList = new ArrayList<MainObject>()
			compiledPrimitiveObjects = new ArrayList<PrimitiveObjectClass>();
			compiledMainObjects = new ArrayList<ObjectClass>();
			val abstractObjects = resource.allContents.filter(Model).next
			jsonFormatter = new JsonFormatter();
			fileController = new FileController(filePath)
			
			System.out.println("Amount of primitive objects found: " + primitiveObjectList.size())
			
			for (primObj : resource.allContents.toIterable.filter(PrimitiveObject)){
				//compile all primitive objects
				compiledPrimitiveObjects.add(compilePrimitiveObject(primObj));
			}
			
			for (obj : resource.allContents.toIterable.filter(MainObject)){
				var bool = "false"
				var rootBool = "false"
				if(checkIfObjectContainsOtherObjects(obj) == true){
					bool = "true"
				}
				if(obj.root != null){
					rootBool = "true"
				}
				System.out.println("Contains other objects: " + bool + "  " +
				obj.objectName.toString() + " PropertyListSize= " + getProperties(obj).size() + " isRoot: " + rootBool)
				//Compile all main objects
				compiledMainObjects.add(compileMainObject(obj));
				
			}
			
			for (ObjectClass compiledObject : compiledMainObjects){
			if(compiledObject.isRoot == true){
				var StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("{\n")
				stringBuilder.append(compiledObject.objectJSchemaString);
				stringBuilder.append("\n}")
				val formattedString = jsonFormatter.formatString(stringBuilder.toString())
				fileController.writeFile(formattedString)
				//fsa.generateFile("testFile.json", jsonFormatter.formatString(stringBuilder.toString()))
				}
			}
				
			}
			
	
			
	def ObjectClass compileMainObject(MainObject obj){
		var boolean isRoot = false
		if (obj.root !== null){
			isRoot = true;
		}
		val ObjectClass tempObject = new ObjectClass(obj.objectName, isRoot, obj)
		
		if(checkIfObjectContainsOtherObjects(obj) == true){
			val ArrayList<String> includeNameList = new ArrayList<String>()
			
			if(obj.includeObjects !== null){
				for(String str : obj.includeObjects.objectID){
					includeNameList.add(str)
				}
			}
			for(String includedName : includeNameList){
				for(ObjectClass mainObj : compiledMainObjects){
					if(mainObj.name == includedName){
						tempObject.addMainObject(mainObj);
					}
				}
				for(PrimitiveObjectClass compPrimObj : compiledPrimitiveObjects){
					if(compPrimObj.name != null){
						if(compPrimObj.name == includedName){
							tempObject.addPrimitiveObject(compPrimObj);
						}
					}
				}
			}
		
		for (hasProperties e : getProperties(obj)){
			if(e.properties.propPrim !== null){
				System.out.println("hasProperties = nested Primitive Object");
				tempObject.addHasPrimObj(compilePrimitiveObject(e.properties.propPrim));
			} else if(e.properties.propObj !== null){
				System.out.println("hasProperties = nested Main Object");
				tempObject.addHasMainObj(compileMainObject(e.properties.propObj));
			}
		}
		
		}
		
		
		
	return tempObject
		
		
	}
	
	def PrimitiveObjectClass compilePrimitiveObject(PrimitiveObject obj){
		
		var PrimitiveObjectClass temp;
		if(obj.type.string !== null){
			var ArrayList<PrimitiveProperties> primitiveProperties = new ArrayList<PrimitiveProperties>();
			for(PrimitiveProperties primProp : obj.primitiveProperties){
				primitiveProperties.add(primProp)
				System.out.println(primProp.toString)
			}
			
			temp = new PrimitiveObjectClass(obj.type.string, obj, PrimitiveType.STRING, obj.type.string, primitiveProperties);
		} 
		
		else if(obj.type.array !== null){
			val ArrayList<Object> arrayContent = new ArrayList<Object>();
			var ArrayType arrayType = null;
			if(obj.type.array.arrayType !== null){
				if(ArrayType.DOUBLE.toString == obj.type.array.arrayType){
					arrayType = ArrayType.DOUBLE;
				}else if(ArrayType.FLOAT.toString == obj.type.array.arrayType){
					arrayType = ArrayType.FLOAT;
				}else if(ArrayType.INT.toString == obj.type.array.arrayType){
					arrayType = ArrayType.INT;
				}else if(ArrayType.STRING.toString == obj.type.array.arrayType){
					arrayType = ArrayType.STRING;
				}	
			}
			if(obj.type.array.properties.size() > 0){
				for(Property p : obj.type.array.properties){
					if(p.propObj !== null){
						arrayContent.add(compileMainObject(p.propObj))
					} else if(p.propPrim !== null){
						arrayContent.add(compilePrimitiveObject(p.propPrim));
					}
				}
			}
			temp = new PrimitiveObjectClass(obj.type.array.arrayName.toString(), obj, PrimitiveType.ARRAY, arrayType, arrayContent);
		} 
		
		else if (obj.type.number !== null){
			var float number;
			var float firstNumber;
			var float decimal;
			var String numberString;
		if(obj.type.number.decimal <= 0){
			number = obj.type.number.number
			numberString = "" + number
			}else{
				firstNumber = (obj.type.number.number as float)
				decimal = (obj.type.number.decimal as float)
				numberString = firstNumber + "." + decimal
			}
			temp = new PrimitiveObjectClass("number", obj, PrimitiveType.NUMBER, numberString);
		}
		return temp;
	}
	
	def checkIfObjectContainsOtherObjects(MainObject obj){
		if(obj.includeObjects !== null || obj.properties !== null){
			return true
		}else{
			return false
		}
		
	}
	
	def ArrayList<hasProperties> getProperties(MainObject obj){
		val ArrayList<hasProperties> propertyList = new ArrayList<hasProperties>();
		for(hasProperties e : obj.properties){
			propertyList.add(e);
		}
		return propertyList
	}
	
	

			
	
}