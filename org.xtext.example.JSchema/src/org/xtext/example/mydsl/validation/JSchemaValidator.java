/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.XtextPackage.Literals;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.ExtendedProperties;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class JSchemaValidator extends AbstractJSchemaValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					JSchemaPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	@Check
	public void checkIfNestedPropertyIsInheritedAlready(Model model) {
		
		ArrayList<ExtendedObject> extList = new ArrayList<ExtendedObject>();
		ArrayList<MainObject> mainList = new ArrayList<MainObject>();
		
		
		for (AbstractObject abstractObject : model.getAbstractObject()) {
			if(abstractObject.getMainObject() != null) {
				mainList.add(abstractObject.getMainObject());
			} else if(abstractObject.getExtendedObject() != null) {
				extList.add(abstractObject.getExtendedObject());
			}	
		}
		
		for(ExtendedObject extObj : extList) {
			ArrayList<ExtendedProperties> exProp = (ArrayList<ExtendedProperties>) extObj.getBody()
			for(ExtendedProperties prop : exProp) {
				if(prop.getOverride() == null) {
					
				}
			}
					
		}
	}
	
	
	
	@Check
	public void checkIfSuperobjectDoesNotExist(Model model) {
		ArrayList<ExtendedObject> extList = new ArrayList<ExtendedObject>();
		ArrayList<MainObject> mainList = new ArrayList<MainObject>();
		
		
		for (AbstractObject abstractObject : model.getAbstractObject()) {
			if(abstractObject.getMainObject() != null) {
				mainList.add(abstractObject.getMainObject());
				
			} else if(abstractObject.getExtendedObject() != null) {
				extList.add(abstractObject.getExtendedObject());
			}
		}
		
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
}
