package procesadores;

import java.util.*;

public class TablaSimbolos {
	HashMap t;
	Stack bloques;
	Map<String, StructDefinition> structDefinitions;
	Map<String, StructInstance> structInstances;
	Map<String,FunctionDef> uncheckedCalls;

	public TablaSimbolos() {
		HashMap tablaprincipal = new HashMap();
		bloques = new Stack();
		bloques.push(tablaprincipal);
		t = (HashMap) bloques.peek();

		structDefinitions = new HashMap<String, StructDefinition>();
		structInstances = new HashMap<String, StructInstance>();
		uncheckedCalls = new HashMap<String, FunctionDef>();
	}

	public Simbolo insertar(Simbolo s) {

		t.put(s.nombre, s);
		return s;
	}

	public Simbolo buscar(String nombre) {
		return (Simbolo) (t.get(nombre));
	}

	public Simbolo buscarGlobal(String nombre) {
		HashMap tabla;
		Simbolo s;
		for (int i = (bloques.size() - 1); i >= 0; i--) {
			tabla = (HashMap) bloques.elementAt(i);
			// System.out.println("Buscando "+nombre+" en tabla "+(i+1));
			s = (Simbolo) tabla.get(nombre);
			if (s != null) {
				// System.out.println("Encontrado "+nombre+" en tabla "+(i+1));
				return s;
			}
		}
		return null;
	}

	public void set() {
		HashMap nuevaTabla = new HashMap();
		bloques.push(nuevaTabla);
		t = (HashMap) bloques.peek();

	}

	public void reset() {

		bloques.pop();
		t = (HashMap) bloques.peek();

	}

	public void imprimir() {
		for (int i = (bloques.size() - 1); i >= 0; i--) {
			System.out.println("Bloque " + (i + 1) + ":");
			HashMap tabla = (HashMap) bloques.elementAt(i);
			Iterator it = tabla.values().iterator();
			while (it.hasNext()) {
				Simbolo s = (Simbolo) it.next();
				System.out.println(s.nombre + "--> " + s.valor);
			}

		}

	}

	public StructDefinition buscarStructDef(String structDefName) {
		return structDefinitions.get(structDefName);
	}

	public void addStructDef(StructDefinition def) {
		this.structDefinitions.put(def.getName(), def);
	}

	/**
	 * Comprueba si una variable de tipo tipo puede asignarse en una variable de
	 * tipo expectedTipo
	 * 
	 * @param expectedTipo
	 * @param tipo
	 * @return true si puede, false si no.
	 */
	public boolean isAssignable(String expectedTipo, String tipo) {
		boolean assignable = false;

		switch (expectedTipo) {

			case "INT":
				switch (tipo) {
					case "INT":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
	
			case "REAL":
				switch (tipo) {
					case "INT":
					case "REAL":
		
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
	
			case "STRING":
				switch (tipo) {
					case "STRING":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
	
			case "CHAR":
				switch (tipo) {
					case "CHAR":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
	
			case "BOOL":
				switch (tipo) {
					case "BOOL":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
				
			case "STRUCT":
				switch (tipo) {
					case "STRUCT":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
			
			case "ARRAY":
				switch (tipo) {
					case "ARRAY":
						assignable = true;
						break;
					default:
						assignable = false;
				}
				break;
			}
		
			return assignable;
	}

	public boolean isNumeric(String tipo) {
		return tipo.equals("INT") || tipo.equals("REAL");
	}
	
	public String getInitialValueOf(String tipo) {
		String initialValue="";
		
		switch (tipo) {
			case "INT":
				initialValue="0";
				break;
	
			case "REAL":
				initialValue="0.0";
				break;
	
			case "STRING":
				initialValue="\"\"";
				break;
	
			case "CHAR":
				initialValue="' '";
				break;
	
			case "BOOL":
				initialValue="false";
				break;
	
		}
		
		return initialValue;
		
	}
	
	public String getReadCode(Simbolo simbolo) {
		String code ="in = new Scanner(System.in).useLocale(Locale.US);\n"+
				simbolo.getNombre()+" = ";
		String tipo = simbolo.getTipo();
		
		switch(tipo) {
			case "INT":
				code+="in.nextInt()";
				break;
	
			case "REAL":
				code += "in.nextDouble()";
				break;
	
			case "STRING":
				code += "in.nextLine()";
				break;
	
			case "CHAR":
				code += "in.next().charAt(0)";
				break;
	
			case "BOOL":
				code += "in.nextBoolean()";
				break;

		}
				
		return code;
	}
	
	public void addUncheckedCall(FunctionDef def) {
		this.uncheckedCalls.put(def.getName(), def);
	}
	/**
	 * Elimina todas las llamadas a la funcion definida en def
	 * 
	 * @param def
	 */
	public void check(FunctionDef def) {
		//System.out.println("Before: "+uncheckedCalls.size());
		uncheckedCalls.entrySet().removeIf(entry -> entry.getValue().equals(def));
		//System.out.println("After: "+uncheckedCalls.size());
	}

	public Map<String, FunctionDef> getUncheckedCalls() {
		return uncheckedCalls;
	}


	
	
}