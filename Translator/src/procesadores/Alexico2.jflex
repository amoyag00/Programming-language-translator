package procesadores;
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

";" {  System.out.println("END_INSTR");return new Symbol(sym.END_INSTR); }
\$[:jletter:][:jletterdigit:]* {System.out.println("ID: "+yytext()); return new Symbol(sym.ID, yytext());}
		
"struct" { return new Symbol(sym.STRUCT); }
"endStructs" { return new Symbol(sym.END_STRUCT); }
"{" { return new Symbol(sym.INIT_BLOCK); }
"}" { return new Symbol(sym.END_BLOCK); }
"(" { return new Symbol(sym.OPEN_PAR); }
")" { return new Symbol(sym.CLOSE_PAR); }
"[" { return new Symbol(sym.OPEN_BRACKETS); }
"]" { return new Symbol(sym.CLOSE_BRACKETS); }
"function" { return new Symbol(sym.FUNCTION); }
"integer" { return new Symbol(sym.INT); }
"real" { return new Symbol(sym.REAL); }
"character" { return new Symbol(sym.CHAR); }
"string" { return new Symbol(sym.STRING); }
"bool" { return new Symbol(sym.BOOL); }
"=" { System.out.println("ASSIGN");return new Symbol(sym.ASSIGN); }
"<" { System.out.println("LESS");return new Symbol(sym.LESS); }
">" { return new Symbol(sym.GREATER); }
"==" { return new Symbol(sym.EQUAL); }
"!=" { return new Symbol(sym.NOT_EQUAL); }
"<=" { return new Symbol(sym.LESS_EQUAL); }
">=" { return new Symbol(sym.GREATER_EQUAL); }
"&" { return new Symbol(sym.AND); }
"|" { return new Symbol(sym.OR); }
"+" { return new Symbol(sym.PLUS); }
"-" { return new Symbol(sym.MINUS); }
"/" { return new Symbol(sym.DIV); }
"%" { return new Symbol(sym.MOD); }
"*" { return new Symbol(sym.MULT); }
"^" { return new Symbol(sym.POW); }
"iter" { return new Symbol(sym.WHILE); }
"if" { System.out.println("IF"); return new Symbol(sym.IF); }
"else" { System.out.println("ELSE"); return new Symbol(sym.ELSE); }
"," { return new Symbol(sym.COMMA); }
"." { return new Symbol(sym.POINT); }
"true" { return new Symbol(sym.TRUE); }
"false" { return new Symbol(sym.FALSE); }
"return" { return new Symbol(sym.RETURN); }
"read" { return new Symbol(sym.READ); }
"print" { return new Symbol(sym.PRINT); }
"\"" .* "\"" {  System.out.println("string literal");return new Symbol(sym.STRING_LITERAL, new String(yytext())); }
"\'" . "\'" { return new Symbol(sym.CHAR_LITERAL, new Character(yytext().charAt(0))); }
[-+]?[0-9]*\.[0-9]+([eE][-+]?[0-9]+)? {System.out.println("REAL");return new Symbol(sym.NUM_REAL, new Float(yytext())); }
[:digit:]+ { return new Symbol(sym.NUM_INT, new Integer(yytext())); }
[ \t\r\n]+ {;}
. { System.out.println("Error en lexico."+yytext()+"-"); }

