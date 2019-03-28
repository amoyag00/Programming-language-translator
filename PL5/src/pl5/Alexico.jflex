package pl5;
import java_cup.runtime.*;
/**
 * 
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya García
 *
 *  Practica: Practica  Analizador Sintáctico LARL con CUP
 */
%%

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
"^" { return new Symbol(sym.POW); }
";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.CIERRAPAR); }


[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[ \t\r\n]+ {;}


. { System.out.println("Error en l�xico."+yytext()+"-"); }