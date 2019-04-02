package pl6;
import java_cup.runtime.*;
import java.io.*;
%%
%{
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
%}
%unicode
%cup
%line
%column
%%

";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.CIERRAPAR); }
\'.\' { return new Symbol(sym.CARACTER); }
"int" { return new Symbol(sym.INTEGER); }
"real" { return new Symbol(sym.REAL); }
"char" { return new Symbol(sym.CHAR); }
"bool" { return new Symbol(sym.BOOLEAN); }
"ptr" { return new Symbol(sym.POINTER); }
"to" { return new Symbol(sym.TO); }
"array" { return new Symbol(sym.ARRAY); }
"of" { return new Symbol(sym.OF); }
"function" { return new Symbol(sym.PROCEDURE); }
"[" { return new Symbol(sym.ABRECOR); }
"]" { return new Symbol(sym.CIERRACOR); }
":" { return new Symbol(sym.DOSPUNTOS); }
"," { return new Symbol(sym.COMA); }
[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[:digit:]+\.[:digit:]+ { return new Symbol(sym.NUMREAL, new Float(yytext())); }
[:jletter:][:jletterdigit:]* { return new Symbol(sym.ID, yytext()); }
[ \t\r\n]+ {;}
. { System.out.println("Error en léxico."+yytext()+"-"); }