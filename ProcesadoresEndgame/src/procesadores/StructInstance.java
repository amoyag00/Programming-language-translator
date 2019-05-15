package procesadores;

import java.util.HashMap;
import java.util.Map;

public class StructInstance{
	private String name;
	private Map<String, Simbolo> attributes;
	private StructDefinition def;
	
	public StructInstance(StructDefinition def, String name) {
		this.name = name;
		this.def = def;
		this.attributes = new HashMap<String, Simbolo>();
		Map<String,String> attributesDef = def.getAttributesDef();
		
		for (Map.Entry<String, String> attribute : attributesDef.entrySet()) {
		    String attName = attribute.getKey();
		    String attType = attribute.getValue();
		    Simbolo att = new Simbolo(attName, null);
		    att.setTipo(attType);
		    attributes.put(name, att);
		}
	}
	
	public void setAttValue(String name, Object value) {
		attributes.get(name).setValue(value);
	}
	
	public Simbolo getAttribute(String name) {
		return attributes.get(name);
	}
	
	public String getStructType() {
		return this.def.getName();
	}
	
	public StructDefinition getStructDef() {
		return this.def;
	}
}
