package procesadores;

import java.util.HashMap;
import java.util.Map;

public class FunctionDef {
	String name;
	Map<Integer, String> params;
	String returnType;
	int line;
	int col;
	
	public FunctionDef() {
		params = new HashMap<Integer,String>();
	}
	public void addParam(int pos, String type) {
		params.put(pos, type);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getParams() {
		return params;
	}
	public void setParams(Map<Integer, String> params) {
		this.params = params;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	

	public boolean equals(FunctionDef other) {
		other = (FunctionDef)other;
		
		if (!name.equals(other.getName())) {
			return false;
		}
		
		
		if(params.size()!=other.getParams().size()) {
			return false;
		}
		
		Map<Integer,String> otherParams = other.getParams();
		if(params.equals(otherParams)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
