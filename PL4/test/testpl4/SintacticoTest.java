package testpl4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl4.Lexico;
//import pl4.Lexico;
import pl4.Sintactico;
/**
 * @author Carlos Fernández Valladares / Samuel Lebrero Alonso / Alejandro Moya
 *         García 
 *         Consideraciones: El símbolo de potenciación no se considera
 *         como válido(^) y no se considera la resta unaria (-x)
 *         
 *         Practica: Practica  Analizador Sintáctico Descendente Recursivo
 */
class SintacticoTest {

	Sintactico createASint(String text) throws Exception {

		InputStream stream = new ByteArrayInputStream(text.getBytes());
		Reader reader = new InputStreamReader(stream);
		Lexico lex = new Lexico(reader);
		Sintactico asd = new Sintactico(lex);

		return asd;
	}

	@Test
	void test1() throws Exception {

		Sintactico asd;
		
		asd = createASint("2+2-2;");
		asd.S();
		assertEquals("LITERAL SIGNO_SUMA LITERAL SIGNO_RESTA LITERAL PTO_COMA", asd.getTokensCorrectos());
		
	}

	@Test
	void testEjemplo1() {
		// (12+3-4)
		Sintactico asd;
		try {
			asd = createASint("(12+3-4);");
			asd.S();
			assertEquals("ABRE_PAR LITERAL SIGNO_SUMA LITERAL SIGNO_RESTA LITERAL CIERRA_PAR PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testEjemplo2() {
		// 123+32
		Sintactico asd;
		try {
			asd = createASint("123+32;");
			asd.S();
			assertEquals("LITERAL SIGNO_SUMA LITERAL PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testEjemplo3() {
		// 34
		Sintactico asd;
		try {
			asd = createASint("34;");
			asd.S();
			assertEquals("LITERAL PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testEjemplo4() {
		// +
		Sintactico asd;
		try {
			asd = createASint("+;");
			asd.S();
			assertEquals("Error", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testEjemplo5() {
		// 12-3(
		Sintactico asd;
		try {
			asd = createASint("12-3(;");
			asd.S();
			assertEquals("Error", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testID() {
		// a+b
		Sintactico asd;
		try {
			asd = createASint("a+b;");
			asd.S();
			assertEquals("ID SIGNO_SUMA ID PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testMult() {
		// (a+b)*5
		Sintactico asd;
		try {
			asd = createASint("(a+b)*5;");
			asd.S();
			assertEquals("ABRE_PAR ID SIGNO_SUMA ID CIERRA_PAR SIGNO_MULT LITERAL PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testDiv() {
		// 4/3+a
		Sintactico asd;
		try {
			asd = createASint("4/3+a;");
			asd.S();
			assertEquals("LITERAL SIGNO_DIV LITERAL SIGNO_SUMA ID PTO_COMA", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testInvalido() {
		// 4/+a
		Sintactico asd;
		try {
			asd = createASint("4/+a;");
			asd.S();
			assertEquals("Error", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testNoMatch() {
		// (4+a!*5
		Sintactico asd;
		try {
			asd = createASint("(4+a!*5;");
			asd.S();
			assertEquals("Error", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testVacio() {
		// (4+a!*5
		Sintactico asd;
		try {
			asd = createASint("");
			asd.S();
			assertEquals("Error", asd.getTokensCorrectos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
