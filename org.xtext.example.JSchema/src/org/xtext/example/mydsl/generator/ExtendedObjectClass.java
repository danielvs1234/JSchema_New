package org.xtext.example.mydsl.generator;

import java.util.ArrayList;

import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.Property;
import org.xtext.example.mydsl.jSchema.hasProperties;

public class ExtendedObjectClass {
	String name;
	ObjectClass superObject;
	ArrayList<ObjectClass> includedMainObjects;
	ArrayList<PrimitiveObjectClass> includedPrimitiveObjects;
	ArrayList<ObjectClass> hasMainObjectPropertiesList;
	ArrayList<PrimitiveObjectClass> hasPrimtiveObjectPropertiesList;
	
	ArrayList<hasProperties> overridenProperties;
	
	public ExtendedObjectClass(ExtendedObject obj, ObjectClass superObject) {
		this.name = obj.getObjectName();
		this.superObject = superObject;

	}
	
	public void addMainObject(ObjectClass obj) {
		includedMainObjects.add(obj);
	}
	
	public void addPrimitiveObject(PrimitiveObjectClass primObj) {
		includedPrimitiveObjects.add(primObj);
	}
	
	public void addHasPrimObj(PrimitiveObjectClass primObj) {
		hasPrimtiveObjectPropertiesList.add(primObj);
	}
	
	public void addHasMainObj(ObjectClass mainObj) {
		hasMainObjectPropertiesList.add(mainObj);
	}
	
	public void setOveriddenObjectsList(ArrayList<hasProperties> overriddenObjects) {
		this.overridenProperties = overriddenObjects;
	}

	
	public void overrideObjects() {
		
	}
}
