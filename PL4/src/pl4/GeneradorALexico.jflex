//Area de codigo, importaciones y paquetes
package pl4;
import java.io.*;

/**
 * 
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya García
 *
 */
%%
//Area de opciones y declaraciones
%class Lexico
%line
%column


Digito = [0-9]
Numero = {Digito} {Digito}*
Finlinea = \n|\r|\r\n
Blanco = {Finlinea}|[ \t\f]

%%
//Area de reglas y acciones

";" {System.out.println("LEX:PTOCOMA"); return new Yytoken(1,yytext(),"PTOCOMA",yyline,yycolumn);}
"(" {System.out.println("LEX:ABREPAR"); return new Yytoken(1,yytext(),"ABREPAR",yyline,yycolumn);}
")" {System.out.println("LEX:CIERRAPAR"); return new Yytoken(1,yytext(),"CIERRAPAR",yyline,yycolumn);}
{Numero} {System.out.println("LEX:NUM:"+yytext());return new Yytoken(1,yytext(),"NUM",yyline,yycolumn);}
[\+\-\*/] {System.out.println("LEX:OP:"+yytext());return new Yytoken(1,yytext(),"OP",yyline,yycolumn);}
{Blanco} {}
. {System.out.println("LEX:Error: encontrado "+yytext()+" en linea "+(yyline+1)+" columna "+(yycolumn+1));}


