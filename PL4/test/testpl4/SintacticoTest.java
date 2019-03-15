package testpl4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import pl4.Lexico;
import pl4.Sintactico;

class SintacticoTest {


	@Test
	void test1() {
		
		Sintactico asd = new Sintactico("LITERAL", "SIGNO_SUMA", "LITERAL", "SIGNO_RESTA", "LITERAL");
		asd.S();
		assertEquals("LITERAL SIGNO_SUMA LITERAL SIGNO_RESTA LITERAL",asd.getTokensCorrectos());
	}
	
	@Test
	void testEjemplo1() {
		//(12+3-4)
		Sintactico asd = new Sintactico("ABRE_PAR","LITERAL", "SIGNO_SUMA", "LITERAL", "SIGNO_RESTA", "LITERAL", "CIERRA_PAR");
		asd.S();
		assertEquals("ABRE_PAR LITERAL SIGNO_SUMA LITERAL SIGNO_RESTA LITERAL CIERRA_PAR",asd.getTokensCorrectos());
	}
	
	@Test
	void testEjemplo2() {
		//123+32
		Sintactico asd = new Sintactico("LITERAL", "SIGNO_SUMA", "LITERAL");
		asd.S();
		assertEquals("LITERAL SIGNO_SUMA LITERAL",asd.getTokensCorrectos());
	}
	
	@Test
	void testEjemplo3() {
		//34
		Sintactico asd = new Sintactico("LITERAL");
		asd.S();
		assertEquals("LITERAL",asd.getTokensCorrectos());
	}
	
	@Test
	void testEjemplo4() {
		//+
		Sintactico asd = new Sintactico("SIGNO_SUMA");
		asd.S();
		assertEquals("Error",asd.getTokensCorrectos());
	}
	
	@Test
	void testEjemplo5() {
		//12-3(
		Sintactico asd = new Sintactico("LITERAL", "SIGNO_RESTA", "LITERAL", "ABRE_PAR");
		do {
			asd.S();
		} while (!asd.currentType().equals("EOF"));

		assertEquals("Error",asd.getTokensCorrectos());
	}
	
	@Test
	void testID() {
		//a+b
		Sintactico asd = new Sintactico("ID", "SIGNO_SUMA", "ID");
		asd.S();
		assertEquals("ID SIGNO_SUMA ID",asd.getTokensCorrectos());
	}
	
	@Test
	void testMult() {
		//(a+b)*5
		Sintactico asd = new Sintactico("ABRE_PAR","ID", "SIGNO_SUMA", "ID", "CIERRA_PAR","SIGNO_MULT", "LITERAL");
		asd.S();
		assertEquals("ABRE_PAR ID SIGNO_SUMA ID CIERRA_PAR SIGNO_MULT LITERAL",asd.getTokensCorrectos());
	}
	
	@Test
	void testDiv() {
		// 4/3+a
		Sintactico asd = new Sintactico("LITERAL", "SIGNO_DIV", "LITERAL", "SIGNO_SUMA", "ID");
		asd.S();
		assertEquals("LITERAL SIGNO_DIV LITERAL SIGNO_SUMA ID",asd.getTokensCorrectos());
	}
	
	@Test
	void testInvalido() {
		// 4/+a
		Sintactico asd = new Sintactico("LITERAL", "SIGNO_DIV", "!", "SIGNO_SUMA", "ID");
		asd.S();
		assertEquals("Error",asd.getTokensCorrectos());
	}
	
	@Test
	void testNoMatch() {
		// (4+a!*5
		Sintactico asd = new Sintactico("ABRE_PAR","LITERAL","SIGNO_SUMA", "ID","!","SIGNO_MULT", "LITERAL");
		asd.S();
		assertEquals("Error",asd.getTokensCorrectos());
	}
	

}
