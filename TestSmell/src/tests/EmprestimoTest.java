package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class EmprestimoTestCase {

	@Test
	void testGetSet() {
		Emprestimo e = new Emprestimo();
		
		Date data = new Date();
		
		e.setDataEmprestimo(data);
		
		assertEquals(data, e.getDataEmprestimo());
	}
}
