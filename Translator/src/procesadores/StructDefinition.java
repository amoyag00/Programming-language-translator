package procesadores;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StructDefinition {
	private Map<String, String> attributes;
	private String name;
	
	public StructDefinition(String name) {
		this.name = name;
		this.attributes = new HashMap<String, String>();
	}
	
	public void addAttribute(String name, String type) {
		attributes.put(name, type);
	}
	
	//Se asume que la pila viene cargada de la forma tipo, nombre, tipo nombre, tipo, nombre, etc.
	public void addAttributes(Stack t) {
		for (int i=0 ;i<t.size();i+=2){
			String attType =t.get(i).toString();
			String attName = t.get(i+1).toString();
		
			this.attributes.put(attName, attType);

		}
		
	}
	
	public boolean isType(String type) {
		boolean isType = false;
		switch(type) {
			case "INT":
			case "REAL":
			case "CHAR":
			case "STRING":
			case "BOOL":
				isType = true;
			default:
				isType = false;
				
			
		}
		return isType;
	}
	
	public Map<String,String> getAttributesDef(){
		return this.attributes;
	}
	
	public String getTipoOf(String attName) {
		
		return this.attributes.get(attName);
	}
	
	public String getName() {
		return this.name;
	}
}
