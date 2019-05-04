package procesadores;

import java.util.*;
public class TablaSimbolos{
 HashMap t;
 Stack bloques;
 public TablaSimbolos(){
 HashMap tablaprincipal = new HashMap();
 bloques = new Stack();
 bloques.push(tablaprincipal);
 t=(HashMap)bloques.peek();
 }
 
 public Simbolo insertar(Simbolo s){
 
 t.put(s.nombre, s);
 return s;
 }
 
 public Simbolo buscar(String nombre){
 return (Simbolo)(t.get(nombre));
 }
 
 public Simbolo buscarGlobal(String nombre) {
	 HashMap tabla;
	 Simbolo s;
	 for (int i=(bloques.size()-1);i>=0;i--)
	 {
		 tabla=(HashMap)bloques.elementAt(i);
		 //System.out.println("Buscando "+nombre+" en tabla "+(i+1));
		 s=(Simbolo)tabla.get(nombre);
		 if (s!=null) {
			 //System.out.println("Encontrado "+nombre+" en tabla "+(i+1));
			 return s;
		 }
	 }
	 return null;
 }
 
 public void set()
 {
	 HashMap nuevaTabla=new HashMap();
	 bloques.push(nuevaTabla);
	 t=(HashMap)bloques.peek();
	 
 }
 
 public void reset() {
	 
	 bloques.pop();
	 t=(HashMap)bloques.peek();
	 
 }
 
 public void imprimir(){
	 for (int i=(bloques.size()-1);i>=0;i--)
	 {
		 System.out.println("Bloque "+ (i+1)+":");
		 HashMap tabla=(HashMap)bloques.elementAt(i);
		 Iterator it = tabla.values().iterator();
		 while(it.hasNext()){
			 Simbolo s = (Simbolo)it.next();
			 System.out.println(s.nombre + "--> "+ s.valor);
		 	}
		 
	 }
 
 }
}