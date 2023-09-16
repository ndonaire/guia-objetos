package unlam.paradigmas.objetos.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCirculoInvalido() {
		Circulo circ = new Circulo(-1);
		assertEquals(circ.getRadio(),0);
	}
	
	@Test
	void testCirculoValido() {
		Circulo circ = new Circulo(9);
		assertEquals(circ.getRadio(),9);
	}
	
	@Test
	void testSetterRadio() {
		Circulo circ = new Circulo(7);
		circ.setRadio(8);
		assertEquals(circ.getRadio(),8);
	}
	
	@Test
	void testDiametro() {
		Circulo circ = new Circulo(7);
		assertEquals(circ.getDiametro(),14);
	}
	
	@Test
	void testPerimetro() {
		Circulo circ = new Circulo(1);
		assertEquals(circ.getPerimetro(),2 * Math.PI);
	}
	
	@Test
	void testArea() {
		Circulo circ = new Circulo(1);
		assertEquals(circ.getArea(),Math.PI);
	}
	
}
