//Area de codigo, importaciones y paquetes
package pl4;
import java.io.*;

/**
 * 
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya García
 *
 *  Practica: Practica  Analizador Sintáctico Descendente Recursivo
 */
%%
//Area de opciones y declaraciones
%class Lexico
%public
%line
%column


Digito = [0-9]
Numero = {Digito} {Digito}*
Finlinea = \n|\r|\r\n
Blanco = {Finlinea}|[ \t\f]

Id = [:jletter:][:jletterdigit:]*

%%
//Area de reglas y acciones
//El s�mbolo de potenciaci�n se ignora (^) y no se considera la resta unaria (-x)

";" {System.out.println("LEX:PTO_COMA"); return new Yytoken(1,yytext(),"PTO_COMA",yyline,yycolumn);}
"(" {System.out.println("LEX:ABRE_PAR"); return new Yytoken(1,yytext(),"ABRE_PAR",yyline,yycolumn);}
")" {System.out.println("LEX:CIERRA_PAR"); return new Yytoken(1,yytext(),"CIERRA_PAR",yyline,yycolumn);}

{Numero} {System.out.println("LEX:LITERAL:"+yytext());return new Yytoken(1,yytext(),"LITERAL",yyline,yycolumn);}

"+" {System.out.println("LEX:SIGNO_SUMA:"+yytext());return new Yytoken(1,yytext(),"SIGNO_SUMA",yyline,yycolumn);}
"-" {System.out.println("LEX:SIGNO_RESTA:"+yytext());return new Yytoken(1,yytext(),"SIGNO_RESTA",yyline,yycolumn);}
"/" {System.out.println("LEX:SIGNO_DIV:"+yytext());return new Yytoken(1,yytext(),"SIGNO_DIV",yyline,yycolumn);}
"*" {System.out.println("LEX:SIGNO_MULT:"+yytext());return new Yytoken(1,yytext(),"SIGNO_MULT",yyline,yycolumn);}

{Id} {System.out.println("LEX:ID:"+yytext());return new Yytoken(1,yytext(),"ID",yyline,yycolumn);}

{Blanco} {}

. {System.out.println("LEX:Error: encontrado "+yytext()+" en linea "+(yyline+1)+" columna "+(yycolumn+1));}


