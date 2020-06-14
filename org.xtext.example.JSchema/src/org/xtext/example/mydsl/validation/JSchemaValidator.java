/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.XtextPackage.Literals;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.generator.PrimitiveType;
import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.ExtendedProperties;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveTypes;
import org.xtext.example.mydsl.jSchema.hasProperties;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class JSchemaValidator extends AbstractJSchemaValidator {
	
	@Check
	public void checkIfOverridenPropertyDoesNotExistsInSuper(Model model) {
		ArrayList<ExtendedObject> extList = getExtendedObjects(model);
		ArrayList<MainObject> mainList = getMainObjects(model);
		
		for(ExtendedObject extObj : extList) {
			ArrayList<ExtendedProperties> extProps = getExtendedProperties(extObj);
			for(ExtendedProperties extendedProperty : extProps) {
				if(extendedProperty.getOverride() != null) {
					String superObject = extObj.getExtendsID().toString();
					for(MainObject mainobj : mainList) {
						if(mainobj.getObjectName().toString().equals(superObject)) {
							ArrayList<String> mainObjectPropertiesNames = new ArrayList<String>();
							for(hasProperties mainprop : getMainObjectProperties(mainobj)) {
								mainObjectPropertiesNames.add(getPrimitiveObjectName(mainprop, null));
							}
							if(extendedProperty.getExtendedProperties().getProperties().getPropObj() != null) {
								String exMainObjPropName = extendedProperty.getExtendedProperties().getProperties().getPropObj().getObjectName().toString();
								ArrayList<String> nestedMainObjectNames = new ArrayList<String>();
								for(hasProperties mainObjectProperties : getMainObjectProperties(mainobj)) {
									if(mainObjectProperties.getProperties().getPropObj() != null) {
										nestedMainObjectNames.add(mainObjectProperties.getProperties().getPropObj().getObjectName().toString());
									}
								}
								if(!nestedMainObjectNames.contains(exMainObjPropName)) {
									super.error("Overridden MainObject does not exist in SuperObject", extendedProperty, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
									
								}
							}
							PrimitiveTypes exType = extendedProperty.getExtendedProperties().getProperties().getPropPrim().getType();
							if(exType.getArray() != null) {
								
									if(!mainObjectPropertiesNames.contains(exType.getArray().getArrayName().toString())) {
										super.error("Overridden Array does not exist in SuperObject", extendedProperty, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
									}
								
							} else if(exType.getString() != null) {
								if(!mainObjectPropertiesNames.contains(exType.getString().toString())) {
										super.error("Overridden String does not exist in SuperObject", extendedProperty, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
										
							}
								
							} else if(exType.getNumber() != null) {
								if(!mainObjectPropertiesNames.contains(exType.getNumber().toString())){
										super.error("Overridden Number does not exist in SuperObject", extendedProperty, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
										
								}
								
							}
						}
					}
				}
			}
			
		}
	}
	
	
	@Check
	public void checkIfNestedPropertyIsInheritedAlready(Model model) {
		
		ArrayList<ExtendedObject> extList = getExtendedObjects(model);
		ArrayList<MainObject> mainList = getMainObjects(model);
		
		
		for(ExtendedObject extObj : extList) {
			ArrayList<ExtendedProperties> extProps = getExtendedProperties(extObj);
			String superObject = extObj.getExtendsID().toString();
			
			for(MainObject mainobj : mainList) {
				if(mainobj.getObjectName().toString().equals(superObject)) {
					
					ArrayList<hasProperties> superProperties = getMainObjectProperties(mainobj);
					for(ExtendedProperties prop : extProps) {
						if(prop.getExtendedProperties().getProperties().getPropObj() != null && prop.getOverride() == null) {
							String propertyName = prop.getExtendedProperties().getProperties().getPropObj().getObjectName().toString();
							for(hasProperties mainProp : superProperties) {
								if(mainProp.getProperties().getPropObj() != null) {
									String mainPropertyName = mainProp.getProperties().getPropObj().getObjectName().toString();
									if(propertyName.equals(mainPropertyName)) {
										super.error("Nested MainObject already inherited from SuperObject", prop, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
									}
								}
							}
						} else if(prop.getExtendedProperties().getProperties().getPropPrim() != null && prop.getOverride() == null) {
							PrimitiveTypes propType = prop.getExtendedProperties().getProperties().getPropPrim().getType();
							if(propType.getArray() != null) {
								String arrayNameOnExtended = propType.getArray().getArrayName().toString();
								for(hasProperties mainProp : superProperties) {
									if(mainProp.getProperties().getPropPrim().getType().getArray() != null) {
										if(arrayNameOnExtended.equals(mainProp.getProperties().getPropPrim().getType().getArray().getArrayName().toString())) {
											super.error("Nested Array is already inherited from super object", prop, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
											}
									}
								}
							} else if(propType.getNumber() != null) {
								String numberValue = propType.getNumber().toString();
								for(hasProperties mainProp : superProperties) {
									if(mainProp.getProperties().getPropPrim().getType().getNumber() != null) {
										if(numberValue.equals(mainProp.getProperties().getPropPrim().getType().getNumber().toString())) {
											super.error("Nested Number is already inherited from super object", prop, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
											}
									}
								}
								
							} else if(propType.getString() != null) {
								String StringValue = propType.getString().toString();
								for(hasProperties mainProp : superProperties) {
									if(mainProp.getProperties().getPropPrim().getType().getString() != null) {
										if(StringValue.equals(mainProp.getProperties().getPropPrim().getType().getString().toString())) {
											super.error("Nested String is already inherited from super object", prop, JSchemaPackage.Literals.EXTENDED_PROPERTIES__EXTENDED_PROPERTIES);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	
	
	
	@Check
	public void checkIfSuperobjectDoesNotExist(Model model) {
		ArrayList<ExtendedObject> extList = getExtendedObjects(model);
		ArrayList<MainObject> mainList = getMainObjects(model);
		
		Iterator<ExtendedObject> objIterator = extList.iterator();
				while(objIterator.hasNext()){
					ExtendedObject extObj = objIterator.next();
					for(MainObject mainObj : mainList){
						if(mainObj.getObjectName().toString().equals(extObj.getExtendsID())){
							objIterator.remove();
						}
					}
				}
		
		for(ExtendedObject extendedObjectForRedlining : extList) {
			super.error("Super Object does not exist", extendedObjectForRedlining, JSchemaPackage.Literals.EXTENDED_OBJECT__EXTENDS_ID);
		}
	}
	
	//From here on are helper methods for extracting objects from the model.
	
	public ArrayList<hasProperties> getMainObjectProperties(MainObject main){
		ArrayList<hasProperties> hasProp = new ArrayList<hasProperties>();
		
		for(hasProperties e: main.getProperties()) {
			hasProp.add(e);
		}
		
		return hasProp;
	}
	
	
	public ArrayList<ExtendedProperties> getExtendedProperties(ExtendedObject extObj){
		ArrayList<ExtendedProperties> extProp = new ArrayList<ExtendedProperties>();
		
		for(ExtendedProperties extProperty : extObj.getBody()) {
			extProp.add(extProperty);
	}
		return extProp;
			
	}
	
	public ArrayList<MainObject> getMainObjects (Model model){
		ArrayList<MainObject> mainObjects = new ArrayList<MainObject>();
		
		for(AbstractObject abstractObject : model.getAbstractObject()) {
			if(abstractObject.getMainObject() != null) {
				mainObjects.add(abstractObject.getMainObject());
			}
		}
		return mainObjects;
	}
	
	public ArrayList<PrimitiveObject> getPrimitiveObjects(Model model) {
		ArrayList<PrimitiveObject> primObjects = new ArrayList<PrimitiveObject>();
		
		for(AbstractObject absObj : model.getAbstractObject()) {
			if(absObj.getPrimitiveObject() != null) {
				primObjects.add(absObj.getPrimitiveObject());
			}
		}
		return primObjects;
	}
	
	public ArrayList<ExtendedObject> getExtendedObjects(Model model) {
		ArrayList<ExtendedObject> extObj = new ArrayList<ExtendedObject>();
		
		for(AbstractObject absObj : model.getAbstractObject()) {
			if(absObj.getExtendedObject() != null) {
				extObj.add(absObj.getExtendedObject());
			}
		}
		return extObj;
	}
	
	public String getPrimitiveObjectName(hasProperties mainProp, ExtendedProperties extProp) {
		String name = "";
		if(mainProp == null) {
			PrimitiveTypes extPropType = extProp.getExtendedProperties().getProperties().getPropPrim().getType();
			if (extPropType.getArray() != null) {
				name = extPropType.getArray().getArrayName().toString();
			} else if(extPropType.getString() != null) {
				name = extPropType.getString().toString();
			} else if(extPropType.getNumber() != null) {
				name = extPropType.getNumber().toString();
			}
		}else {
			PrimitiveTypes mainPropType = mainProp.getProperties().getPropPrim().getType();
			if(mainPropType.getArray() != null) {
				name = mainPropType.getArray().getArrayName();
			} else if(mainPropType.getString() != null) {
				name = mainPropType.getString().toString();
			} else if(mainPropType.getNumber() != null) {
				name = mainPropType.getNumber().toString();
			}
		}
		
		return name;
	}
	
	
}
