package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TituloTestCase {

	@Test
	void testGetSet() {
		Titulo t = new Titulo(2);
		
		t.setPrazo(4);
		
		assertEquals(4, t.getPrazo());
	}

}
