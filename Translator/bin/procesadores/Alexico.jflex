import java_cup.runtime.*;
import java.io.*;
%%
%{
 private TablaSimbolos tabla;
 public Yylex(Reader in, TablaSimbolos t){
 this(in);
 this.tabla = t;
 }
 public TablaSimbolos getTabla(){
 	return tabla;
 }
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
 
%}
%unicode
%cup
%line
%column
%%
"+" { return new Symbol(sym.MAS); }
"-" { return new Symbol(sym.MENOS); }
"*" { return new Symbol(sym.POR); }
"/" { return new Symbol(sym.ENTRE); }
"%" { return new Symbol(sym.MODULO); }
";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.CIERRAPAR); }
":=" { return new Symbol(sym.ASIGNA); }
"{" { 	return new Symbol(sym.INICIOBLOQUE); }
"}" { 	return new Symbol(sym.FINBLOQUE); }
[:jletter:][:jletterdigit:]* {
	Simbolo s;
	s=new Simbolo(yytext(),null);
		return new Symbol(sym.ID,s);
	}
[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[ \t\r\n]+ {;}
. { System.out.println("Error en léxico."+yytext()+"-"); }
