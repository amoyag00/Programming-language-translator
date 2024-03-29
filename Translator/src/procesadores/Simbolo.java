package procesadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Simbolo {
	String nombre;
	Object valor;
	String tipo;
	String javaCode;
	int declaredLine;
	int declaredCol;
	//Only structs
	StructInstance struct;
	
	//Only functions
	List<String> paramTypes;
	String returnType;
	
	//Only arrays
	int dimension;
	public ArrayList<String> dims;
	
	public Simbolo() {
		this.paramTypes= new ArrayList<String>();
		this.dims= new ArrayList<String>();
	}
	
	public Simbolo(String nombre, Integer valor){
		this.nombre = nombre;
		this.valor = valor;
		this.paramTypes= new ArrayList<String>();
		this.dims= new ArrayList<String>();
	 }
	
	public Simbolo(String nombre, Integer valor, int line, int col){
		this.nombre = nombre;
		this.valor = valor;
		this.declaredLine= line;
		this.declaredCol= col;
		this.paramTypes= new ArrayList<String>();
	 }
	
	public void addParamType(String type) {
		this.paramTypes.add(type);
		//System.out.println("Params "+this.paramTypes.toString());
	}
	
	public List<String> getParamTypes(){
		return this.paramTypes;
	}
	
	public void setValue(Object value) {
		valor=value;
	}
	
	public void setTipo(String  tipo) {
		this.tipo = tipo;
	}
	
	public void setLineCol(int line, int col) {
		this.declaredLine= line;
		this.declaredCol= col;
	}
	
	public int getLine() {
		return this.declaredLine;
	}
	
	public int getCol() {
		return this.declaredCol;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void createStructInstance(StructDefinition def) {
		this.struct = new StructInstance(def, this.nombre);
	}
	
	public StructInstance getStructInstance() {
		return this.struct;
	}

	public String getTipoRetorno() {
		return returnType;
	}

	public void setTipoRetorno(String returnType) {
		this.returnType = returnType;
	}
	
	public void setDimension(int dim) {
		this.dimension = dim;
	}
	
	public int getDimension() {
		return this.dimension;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void increaseDim() {
		this.dimension++;
	}

	public String getCode() {
		return javaCode;
	}

	public void setCode(String javaCode) {
		this.javaCode = javaCode;
	}
	
	public void addDim(String dim) {
		this.dims.add(dim);
	}
	
	public void addDim(int dim) {
		this.dims.add(String.valueOf(dim));
	}
	
	public String getDim(int i) {
		if(i<this.dims.size()) {
			return this.dims.get(i);
		}
		return "0";
	}
	
}
