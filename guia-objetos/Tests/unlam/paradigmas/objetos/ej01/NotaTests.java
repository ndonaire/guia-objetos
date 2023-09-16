package unlam.paradigmas.objetos.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testNotaValida() {
		Nota nota = new Nota(9);
		
		assertEquals(nota.obtenerValor(), 9);		
	}
	
	@Test
	public void testAprobado() {
		Nota nota = new Nota(4);
		assertTrue(nota.aprobado());		
	}
	
	@Test
	public void testDesaprobado() {
		Nota nota = new Nota(2);
		assertTrue(nota.desaprobado());		
	}
	
	@Test
	public void testRecuperar() {
		Nota nota = new Nota(4);
		nota.recuperar(9);
		assertEquals(nota.obtenerValor(), 9);		
	}
}
