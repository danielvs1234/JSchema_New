package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.jSchema.FormatTypes;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.generator.ObjectClass;


public class PrimitiveObjectClass {

	PrimitiveObject primitiveObject;
	String name;
	PrimitiveType type;
	
	String valNumber;
	String valString;
	ArrayList<PrimitiveProperties> stringProperties;
	
	ArrayType optArrayType;
	ArrayList<Object> arrayContent;
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
	}
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, String optValue) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.NUMBER)) {
			this.valNumber = optValue;
		}
		if(primType.equals(PrimitiveType.STRING)) {
			this.valString = optValue;
		}
			
	}
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, String optValue, ArrayList<PrimitiveProperties> stringProperties) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.STRING)) {
			this.valString = optValue;
			this.stringProperties = stringProperties;
		}
	}
	
	public PrimitiveObjectClass(String name, PrimitiveObject primObj, PrimitiveType primType, ArrayType optArrayType, ArrayList<Object> arrayContent) {
		primitiveObject = primObj;
		this.type = primType;
		this.name = name;
		if(primType.equals(PrimitiveType.ARRAY)) {
			
		}
		if(optArrayType != null) {
			this.optArrayType = optArrayType;
		}
		if(arrayContent.size() > 0) {
			this.arrayContent = arrayContent;
		}
	}
	
	
	
	public String getPrimitiveObjectString() {
		StringBuilder string = new StringBuilder();
		
		if(type.equals(PrimitiveType.STRING)){
			
			string.append("\"" + valString + "\":{\n");
			string.append("\"$id\":\"" + valString + "\",\n");
			if(stringProperties.size() == 0) {
			string.append("\"type\":\"string\"");
			}
			else if(stringProperties.size() > 0) {
				string.append("\"type\":\"string\",\n");
				
				for(int i=0 ; i < stringProperties.size() ; i++) {
					PrimitiveProperties primProp = stringProperties.get(i);
					if(primProp.getStringLength() != null) {
						String[] tmp = primProp.getStringLength().split("-");
						String min = tmp[0].toString();
						String max = tmp[1].toString();
					
						string.append("\"minLength\":" + min + ",\n");
						string.append("\"maxLength\":" + max);
						}
						
					
					if(primProp.getPatternString() != null) {
							string.append("\"pattern\":\"" + primProp.getPatternString() + "\"");
						}
							
					if(primProp.getStringFormat() != FormatTypes.DEFAULT) {
						string.append("\"format\":\"" + primProp.getStringFormat().getName().toString() + "\"");
					}
					
					if(i+1 < stringProperties.size()) {
						string.append(",\n");
					}
				}
				
			}
				string.append("\n}");
		}
		
		else if(type.equals(PrimitiveType.NUMBER)) {
			if(valNumber != null) {
				string.append("{\n");
				string.append("\"type\":\"number\",\n");
				string.append("\"value\":\"" + valNumber + "\"\n");
			} else {
				string.append("\"type\":\"number\"\n");
			}
			string.append("}");
		}
		
		else if(type.equals(PrimitiveType.ARRAY)) {
			string.append("\"" + this.name + "\":{\n");
			string.append("\"type\":\"array\",\n");
			string.append("\"$id\":\"" + this.name + "\",\n");
			
			if((arrayContent != null && arrayContent.size() > 0) || optArrayType != null) {
				string.append("\"items\":[\n");
				
				if(optArrayType != null) {
					string.append("{\n");
					string.append("\"type\":\"" + ("\"") + primitiveObject.getType().getArray().getArrayType() + "\"");
					string.append("}\n");
					string.append("]\n");
					string.append("}");
					
					return string.toString();
				} else if(arrayContent.size() > 0) {
					string.append("{\n");
					
					for(int i = 0 ; i < arrayContent.size() ; i++) {
						Object e = arrayContent.get(i);
						if(e instanceof ObjectClass) {
							string.append(((ObjectClass) e).getObjectJSchemaString());
						} else if (e instanceof PrimitiveObjectClass) {
							string.append(((PrimitiveObjectClass) e).getObjectItemRepresentation());
						}
						if(i+1 < arrayContent.size()) {
							string.append(",\n");
						} else {
							string.append("\n");
						}
					}
					string.append("]");
					string.append("\n}");
					
				}
				
			}
		}
	
		return string.toString();
	}
	
	
	private String getObjectItemRepresentation() {
		StringBuilder string = new StringBuilder();
		
		if(type.equals(PrimitiveType.STRING)){
			string.append("\"$id\":\"" + valString + "\",\n");
			if(stringProperties.size() == 0) {
			string.append("\"type\":\"string\"");
			}
			else if(stringProperties.size() > 0) {
				string.append("\"type\":\"string\",\n");
				
				for(int i=0 ; i < stringProperties.size() ; i++) {
					PrimitiveProperties primProp = stringProperties.get(i);
					if(primProp.getStringLength() != null) {
						String[] tmp = primProp.getStringLength().split("-");
						String min = tmp[0].toString();
						String max = tmp[1].toString();
					
						string.append("\"minLength\":" + min + ",\n");
						string.append("\"maxLength\":" + max);
						}
						
					
					if(primProp.getPatternString() != null) {
							string.append("\"pattern\":\"" + primProp.getPatternString() + "\"");
						}
							
					if(primProp.getStringFormat() != FormatTypes.DEFAULT) {
						string.append("\"format\":\"" + primProp.getStringFormat().getName().toString() + "\"");
					}
					
					if(i+1 < stringProperties.size()) {
						string.append(",\n");
					}
				}
				
			}
				string.append("\n}");
		}
		
		else if(type.equals(PrimitiveType.NUMBER)) {
			if(valNumber != null) {
				string.append("{");
				string.append("\"type\":\"number\"\n");
				string.append("}");
			}
		}
		
		else if(type.equals(PrimitiveType.ARRAY)) {
			string.append("\"" + this.name + "\":{\n");
			string.append("\"type\":\"array\",\n");
			string.append("\"$id\":\"" + this.name + "\",\n");
			
			if((arrayContent != null && arrayContent.size() > 0) || optArrayType != null) {
				string.append("\"items\":[\n");
				
				if(optArrayType != null) {
					string.append("{\n");
					string.append("\"type\":\"" + ("\"") + primitiveObject.getType().getArray().getArrayType() + "\"");
					string.append("}\n");
					string.append("]\n");
					string.append("}");
					
					return string.toString();
				} else if(arrayContent.size() > 0) {
					string.append("{\n");
					
					for(int i = 0 ; i < arrayContent.size() ; i++) {
						Object e = arrayContent.get(i);
						if(e instanceof ObjectClass) {
							string.append(((ObjectClass) e).getObjectJSchemaString());
						} else if (e instanceof PrimitiveObjectClass) {
							string.append(((PrimitiveObjectClass) e).getPrimitiveObjectString());
						}
						if(i+1 <= arrayContent.size()) {
							string.append(",\n");
						} else {
							string.append("\n");
						}
					}
					string.append("]");
					string.append("}\n");
					
				}
				
			}
		}
	
		
		
		return string.toString();
	}
}