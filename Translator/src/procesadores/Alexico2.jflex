package procesadores;
import java_cup.runtime.*;
import java.io.*;
%%
%{
 boolean debug;
 private TablaSimbolos tabla;
 public Yylex(Reader in, TablaSimbolos t){
 this(in);
 this.tabla = t;
 }
 public TablaSimbolos getTabla(){
 	return tabla;
 }
 public void setDebugMode(boolean flag){
 	this.debug = flag;
 }
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
 public void printRef(){ System.out.println( ". Linea:"+linea()+" Col:"+columna());}
 
%}
%unicode
%cup
%line
%column

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

    
%%


{Comment} {;}
";" { 
if(debug){
	System.out.print("END_INSTR");
	printRef();
}
return new Symbol(sym.END_INSTR);
}

\$[:jletter:][:jletterdigit:]* {
if(debug){
	System.out.print("ID: "+yytext());
	printRef();
}
return new Symbol(sym.ID, yytext());
}
		
"struct" {
if(debug){
	System.out.print("STRUCT");
	printRef();
}
return new Symbol(sym.STRUCT); 
}

"endStructs" { 
if(debug){
	System.out.print("END_STRUCT");
	printRef();
}
return new Symbol(sym.END_STRUCT);
}

"{" { 
if(debug){
	System.out.print("INIT_BLOCK");
	printRef();
}
return new Symbol(sym.INIT_BLOCK); 
}

"}" { 
if(debug){
	System.out.print("END_BLOCK");
	printRef();
}
return new Symbol(sym.END_BLOCK);
}

"(" { 
if(debug){
	System.out.print("OPEN_PAR");
	printRef();
}
return new Symbol(sym.OPEN_PAR);
}

")" { 
if(debug){
	System.out.print("CLOSE_PAR");
	printRef();
}
return new Symbol(sym.CLOSE_PAR);
}

"[" { 
if(debug){
	System.out.print("OPEN_BRACKETS");
	printRef();
}
return new Symbol(sym.OPEN_BRACKETS);
}

"]" { 
if(debug){
	System.out.print("CLOSE_BRACKETS");
	printRef();
}
return new Symbol(sym.CLOSE_BRACKETS);
}

"function" { 
if(debug){
	System.out.print("FUNCTION");
	printRef();
}
return new Symbol(sym.FUNCTION);
}

"integer" { 
if(debug){
	System.out.print("INT");
	printRef();
}
return new Symbol(sym.INT);
}

"real" { 
if(debug){
	System.out.print("REAL");
	printRef();
}
return new Symbol(sym.REAL);
}

"character" { 
if(debug){
	System.out.print("CHAR");
	printRef();
}
return new Symbol(sym.CHAR);
}

"string" {
if(debug){
	System.out.print("STRING");
	printRef();
}
return new Symbol(sym.STRING);
}

"bool" {
if(debug){
	System.out.print("BOOL");
	printRef();
}
return new Symbol(sym.BOOL);
}

"=" {
if(debug){
	System.out.print("ASSIGN");
	printRef();
}
return new Symbol(sym.ASSIGN);
}

"<" { 
if(debug){
	System.out.print("LESS");
	printRef();
}
return new Symbol(sym.LESS);
}

">" { 
if(debug){
	System.out.print("GREATER");
	printRef();
}
return new Symbol(sym.GREATER);
}

"==" { 
if(debug){
	System.out.print("EQUAL");
	printRef();
}
return new Symbol(sym.EQUAL);
}

"!=" { 
if(debug){
	System.out.print("NOT_EQUAL");
	printRef();
}
return new Symbol(sym.NOT_EQUAL);
}

"<=" { 
if(debug){
	System.out.print("LESS_EQUAL");
	printRef();
}
return new Symbol(sym.LESS_EQUAL);
}

">=" { 
if(debug){
	System.out.print("GREATER_EQUAL");
	printRef();
}
return new Symbol(sym.GREATER_EQUAL);
}

"&&" { 
if(debug){
	System.out.print("AND");
	printRef();
}
return new Symbol(sym.AND);
}

"||" {
if(debug){
	System.out.print("OR");
	printRef();
}
return new Symbol(sym.OR);
}

"+" { 
if(debug){
	System.out.print("PLUS");
	printRef();
}
return new Symbol(sym.PLUS);
}

"-" { 
if(debug){
	System.out.print("MINUS");
	printRef();
}
return new Symbol(sym.MINUS);
}

"/" {
if(debug){
	System.out.print("DIV");
	printRef();
}return new Symbol(sym.DIV);
}

"%" {
if(debug){
	System.out.print("MOD");
	printRef();
}
 return new Symbol(sym.MOD);
}

"*" { 
if(debug){
	System.out.print("MULT");
	printRef();
}
return new Symbol(sym.MULT);
}

"^" { 
if(debug){
	System.out.print("POW");
	printRef();
}
return new Symbol(sym.POW);
}

"iter" {
if(debug){
	System.out.print("WHILE");
	printRef();
}
return new Symbol(sym.WHILE);
}

"if" { 
if(debug){
	System.out.print("IF");
	printRef();
}
return new Symbol(sym.IF);
}

"else" { 
if(debug){
	System.out.print("ELSE");
	printRef();
}
return new Symbol(sym.ELSE);
}

"," { 
if(debug){
	System.out.print("COMMA");
	printRef();
}
return new Symbol(sym.COMMA);
}

"." {
if(debug){
	System.out.print("POINT");
	printRef();
}
return new Symbol(sym.POINT);
}

"true" { 
if(debug){
	System.out.print("TRUE");
	printRef();
}
return new Symbol(sym.TRUE);
}

"false" {
if(debug){
	System.out.print("FALSE");
	printRef();
}
return new Symbol(sym.FALSE);
}

"return" { 
if(debug){
	System.out.print("RETURN");
	printRef();
}
return new Symbol(sym.RETURN);
}

"read" {
if(debug){
	System.out.print("READ");
	printRef();
}
return new Symbol(sym.READ);
}

"print" { 
if(debug){
	System.out.print("PRINT");
	printRef();
}
return new Symbol(sym.PRINT);
}
"\"" .* "\"" {
if(debug){
	System.out.print("SRING_LITERAL");
	printRef();
}
return new Symbol(sym.STRING_LITERAL, new String(yytext()));
}

"\'" . "\'" {
if(debug){
	System.out.print("CHAR_LITERAL");
	printRef();
}
return new Symbol(sym.CHAR_LITERAL, new Character(yytext().charAt(1)));
}

[-+]?[0-9]*\.[0-9]+([eE][-+]?[0-9]+)? {
if(debug){
	System.out.print("REAL");
	printRef();
}
return new Symbol(sym.NUM_REAL, new Double(yytext()));
}

[:digit:]+ {
if(debug){
	System.out.print("NUM_INT");
	printRef();
}
return new Symbol(sym.NUM_INT, new Integer(yytext()));
}

[ \t\r\n]+ {;}
. { System.out.println("Error léxico."+yytext()+"-"); }
