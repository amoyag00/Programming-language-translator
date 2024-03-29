package pl4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya
 *         García 
 *         Consideraciones: El símbolo de potenciación no se considera
 *         como válido(^) y no se considera la resta unaria (-x)
 *         
 *         Practica: Practica  Analizador Sintáctico Descendente Recursivo
 */
public class Sintactico {

	private static Lexico analizadorLexico = null;
	private Yytoken currentToken = null;
	private LinkedList<Yytoken> tokens;// Testing only
	private String tokensCorrectos;//Testing only

	public Sintactico(Lexico lex) {
		this.analizadorLexico = lex;
		this.tokensCorrectos = "";
	}

	/**
	 * Constructor para Testing
	 * 
	 * @param lexemas
	 *
	public Sintactico(String... lexemas) {
		this.tokens = new LinkedList<Yytoken>();
		for (String lexema : lexemas) {
			this.tokens.addLast(new Yytoken(lexema));
		}
		this.tokensCorrectos = "";
	}*/

	public String currentType() {
		return this.currentToken.getType();
	}

	/**
	 * Obtiene el siguiente token
	 */
	private void nextToken() {
		Yytoken prevToken = this.currentToken;
		try {
			this.currentToken = this.analizadorLexico.yylex();
			if (this.currentToken == null) {
				System.out.println("Fin de fichero");
				this.currentToken = new Yytoken(0, "", "EOF", prevToken.getLine(), prevToken.getColumn());

			}
		} catch (IOException e) {
			if (this.currentToken == null) {
				System.out.println("Fin de fichero" + e.toString());

			} else {
				this.currentToken.Error("Error obteniendo el siguiente token despues de");
			}
		}
		prevToken = null;
	}

	/**
	 * Obtiene el siguiente token. Utilizado para realizar pruebas unitarias.
	 *
	 * private void nextTokenTest() { Token prevToken = this.currentToken;
	 * 
	 * if (this.tokens.isEmpty()) { System.out.println("Fin de fichero");
	 * this.currentToken = new Yytoken(0, "", "EOF", prevToken.getLine(),
	 * prevToken.getColumn());
	 * 
	 * } else { this.currentToken = this.tokens.removeFirst(); }
	 * 
	 * prevToken = null; }
	 */

	/*
	 * Producciones S-> E E-> TE' E'-> +TE' | -TE' | ε T-> FT' T'-> *FT' | /FT' | ε
	 * F-> (E) | id | num
	 * 
	 */

	/**
	 * Producción inicial S-> E
	 */
	public void S() {

		this.nextToken();

		if (this.currentType().equals("EOF")) {
			// Para que cuando llegue al final de fichero no imprima Comienza la sentencia
			// System.out.println("Fin de Fichero");
			return;
		}

		System.out.println("Comienza la sentencia");
		// this.nextTokenTest();

		E();
		match("PTO_COMA");
		System.out.println("Fin de la sentencia");
	}

	/**
	 * E-> TE'
	 */
	public void E() {
		T();
		Ep();
	}

	/**
	 * T-> FT'
	 */
	public void T() {
		F();
		Tp();
	}

	/**
	 * E'-> +TE' | -TE' | ε
	 */
	public void Ep() {
		switch (this.currentType()) {
		case "SIGNO_SUMA":
			match("SIGNO_SUMA");
			T();
			Ep();
			break;

		case "SIGNO_RESTA":
			match("SIGNO_RESTA");
			T();
			Ep();
			break;

		default:
			// Caso E'-> ε no se hace nada
		}

	}

	/**
	 * F-> (E) | id | num
	 */
	public void F() {
		switch (this.currentType()) {
		case "ABRE_PAR":
			match("ABRE_PAR");
			E();
			match("CIERRA_PAR");
			break;

		case "ID":
			match("ID");
			break;

		case "LITERAL":
			match("LITERAL");
			break;

		default:
			this.currentToken.Error("Validando 'F'");
			this.match("EXPRESION");
			this.tokensCorrectos = "Error ";
		}
	}

	/**
	 * T'-> *FT' | /FT' | ε
	 */
	public void Tp() {
		switch (this.currentType()) {
		case "SIGNO_MULT":
			match("SIGNO_MULT");
			F();
			Tp();
			break;

		case "SIGNO_DIV":
			match("SIGNO_DIV");
			F();
			Tp();
			break;

		default:
			// Caso T'-> ε no se hace nada
		}
	}

	public String yytext() {
		return this.analizadorLexico.yytext();
	}

//Fin Producciones

	/**
	 * Compara los tokens
	 * 
	 * @param refStrToken
	 */
	public void match(String refStrToken) {
		if (currentType().equals(refStrToken)) {
			System.out.println("Token correcto: " + currentType());
			if (!currentType().equals("PTO_COMA")) {
				nextToken();
			}

			// this.nextTokenTest();
			this.tokensCorrectos += refStrToken + " ";
		} else {
			this.currentToken.ErrorMatch(refStrToken);
			this.tokensCorrectos = "Error ";
		}

	}

	public String getTokensCorrectos() {
		if (this.tokensCorrectos.contains("Error")) {
			this.tokensCorrectos = "Error ";
		}
		return this.tokensCorrectos.substring(0, this.tokensCorrectos.length() - 1);
	}

	public static void main(String[] argv) {
		if (argv.length == 0) {
			System.out.println("Uso : java Parser  <inputfile)>");
		} else {
			Sintactico asd = null;
			try {
				FileInputStream stream = new FileInputStream(argv[0]);
				Reader reader = new InputStreamReader(stream);
				Lexico lex = new Lexico(reader);
				asd = new Sintactico(lex);
				do {

					asd.S();
				} while (!asd.currentType().equals("EOF"));

			} catch (IOException x) {
				System.out.println("Error leyendo " + x.toString() + (asd.yytext()));
			}
		}
	}

}
