package org.xtext.example.mydsl.generator;

import java.util.ArrayList;

import org.xtext.example.mydsl.jSchema.ExtendedObject;
import org.xtext.example.mydsl.jSchema.hasProperties;

public class ExtendedObjectClass {
	String name;
	ObjectClass superObject;
	ArrayList<ObjectClass> includedMainObjects;
	ArrayList<PrimitiveObjectClass> includedPrimitiveObjects;
	ArrayList<ObjectClass> hasMainObjectPropertiesList;
	ArrayList<PrimitiveObjectClass> hasPrimtiveObjectPropertiesList;
	
	ArrayList<hasProperties> overridenProperties;
	
	public ExtendedObjectClass() {
		includedPrimitiveObjects = new ArrayList<PrimitiveObjectClass>();
		includedMainObjects = new ArrayList<ObjectClass>();
		hasPrimtiveObjectPropertiesList = new ArrayList<PrimitiveObjectClass>();
		hasMainObjectPropertiesList = new ArrayList<ObjectClass>();
	}
	public ExtendedObjectClass(ExtendedObject obj, ObjectClass superObject) {
		this.name = obj.getExObjectName();
		this.superObject = superObject;
		
		includedPrimitiveObjects = new ArrayList<PrimitiveObjectClass>();
		includedMainObjects = new ArrayList<ObjectClass>();
		hasPrimtiveObjectPropertiesList = new ArrayList<PrimitiveObjectClass>();
		hasMainObjectPropertiesList = new ArrayList<ObjectClass>();

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
	
	public ArrayList<PrimitiveObjectClass> getAllPrimitiveObjects(){
		ArrayList<PrimitiveObjectClass> temp = new ArrayList<PrimitiveObjectClass>();
		temp.addAll(hasPrimtiveObjectPropertiesList);
		temp.addAll(includedPrimitiveObjects);
		return temp;
	}

	
	public String getObjectJSchemaString() {
		StringBuilder string = new StringBuilder();
			string.append("\"" + this.name + "\":{\n");
			string.append("\"$id\":\"" + this.name + "\",\n");
		
		if(hasMainObjectPropertiesList.size() == 0 &&
				hasPrimtiveObjectPropertiesList.size() == 0 &&
				includedPrimitiveObjects.size() == 0 &&
				includedMainObjects.size() == 0
				) {
			string.append( "\"type\":\"object\"");
		} else {
			string.append( "\"type\":\"object\",\n");
		}
		
		
		if(hasMainObjectPropertiesList.size() > 0) {
			string.append("\"properties\":{\n");
			
			for(int i=0 ; i < hasMainObjectPropertiesList.size() ; i++) {
				ObjectClass mainObj = hasMainObjectPropertiesList.get(i);
				string.append(mainObj.getObjectJSchemaString());
				if(i+1 < hasMainObjectPropertiesList.size()) {
					string.append(",\n");
				} else {
					if(hasPrimtiveObjectPropertiesList.size() > 0) {
					continue;	
					} else {
						string.append("\n}");
					}
				}

			}
			
			if(hasPrimtiveObjectPropertiesList.size() > 0 || includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
				string.append(",\n");
			}
				
		}
	
		
		if (hasPrimtiveObjectPropertiesList.size () > 0) {
			if(hasMainObjectPropertiesList.size() == 0) {
			string.append("\"properties\":{\n");
			}
			for(int i=0 ; i < hasPrimtiveObjectPropertiesList.size() ; i++) {
				PrimitiveObjectClass primObj = hasPrimtiveObjectPropertiesList.get(i);
				string.append(primObj.getPrimitiveObjectString());
				if(i+1 < hasPrimtiveObjectPropertiesList.size()) {
					string.append(",\n");
				} else {
					string.append("\n}");
				}
			}
			if(includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
				string.append(",\n");
				
			}
		}
		
		
		
		if(hasPrimtiveObjectPropertiesList.size() == 0 && hasMainObjectPropertiesList.size() == 0 && (includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0)) {
			string.append("\"properties\":{\n");
		}
		
		if(includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0) {
			string.append("\"allOf\":[\n");
			
			
		
		if(includedMainObjects.size() > 0) {
			for(int i=0 ; i < includedMainObjects.size() ; i++) {
				ObjectClass mainObj = includedMainObjects.get(i);
				string.append("{\n");
				string.append("\"properties\":{\n");
				string.append(mainObj.getObjectJSchemaString());
				string.append("\n}");
				string.append("\n}");
				
				if(i+1 < includedMainObjects.size()) {
					string.append(",\n");
				}
			}
			if(includedPrimitiveObjects.size() > 0) {
				string.append(",\n");
			}
		}
		if(includedPrimitiveObjects.size() > 0) {
			for(int i=0 ; i < includedPrimitiveObjects.size(); i++) {
				PrimitiveObjectClass primObj = includedPrimitiveObjects.get(i);
				string.append("{\n");
				string.append("\"properties\":{\n");
				string.append(primObj.getPrimitiveObjectString());
				string.append("\n}");
				string.append("\n}");
				if(i+1 < includedPrimitiveObjects.size()) {
					string.append(",\n");
				}
			}
		}
		
		string.append("\n]");
		
		if(hasPrimtiveObjectPropertiesList.size() == 0 && hasMainObjectPropertiesList.size() == 0 && (includedPrimitiveObjects.size() > 0 || includedMainObjects.size() > 0)) {
			string.append("\n}");
		}
		}
		
			string.append("\n}");
		
		
		return string.toString();
	}

}

