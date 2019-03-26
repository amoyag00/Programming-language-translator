package pl5;
import java_cup.runtime.*;
%%

%unicode
%cup
%line
%column

Id = [:jletter:][:jletterdigit:]*
%%

"+" { return new Symbol(sym.MAS); }
"-" { return new Symbol(sym.MENOS); }
"*" { return new Symbol(sym.POR); }
"/" { return new Symbol(sym.ENTRE); }
"^" { return new Symbol(sym.POW); }
";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.CIERRAPAR); }

{Id} {return new Symbol(sym.ID, new Integer(yytext()));}

[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[ \t\r\n]+ {;}


. { System.out.println("Error en léxico."+yytext()+"-"); }