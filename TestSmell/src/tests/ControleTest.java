package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

import org.junit.jupiter.api.Test;

class ControleTestCase {

	@Test
	void testEmprestar() throws ParseException {
		int[] codigos= {1,2,3};
		String aluno = "2";
		int num = 3;
		Controle c = new Controle();
		assertTrue(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void testEmprestimoGrande() throws ParseException {
		int[] codigos= {1,2,3};
		String aluno = "2";
		int num = 3;
		Controle c = new Controle();
		assertTrue(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void alunoDebito() throws ParseException {
		int[] codigos= {1,2,3};
		String aluno = "4";
		int num = 3;
		Controle c = new Controle();
		assertFalse(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void alunoEmBranco() throws ParseException {
		int[] codigos= {1,2,3};
		String aluno = "";
		int num = 3;
		Controle c = new Controle();
		assertFalse(c.emprestar(aluno, codigos, num));
	}
	
	@Test
	void NenhumLivro() throws ParseException {
		int[] codigos= {3};
		String aluno = "2";
		int num = 1;
		Controle c = new Controle();
		assertFalse(c.emprestar(aluno, codigos, num));
	}
}
