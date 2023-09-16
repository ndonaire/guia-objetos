package unlam.paradigmas.objetos.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCerraduraInvalida() {
		Cerradura lock = new Cerradura(1234,-1);
		
		assertEquals(lock.getCantidadDeFallosConsecutivosQueLaBloquean(),0);
	}
	
	@Test
	void testCerraduraValida() {
		Cerradura lock = new Cerradura(1234,3);
		
		assertEquals(lock.getCantidadDeFallosConsecutivosQueLaBloquean(),3);
	}
	
	@Test
	void testAbrir() {
		Cerradura lock = new Cerradura(1234,3);
		lock.abrir(1234);
		
		assertTrue(lock.estaAbierta());
	}
	
	@Test
	void testCerrar() {
		Cerradura lock = new Cerradura(1234,3);
		lock.cerrar();
		assertTrue(lock.estaCerrada());
	}
	
	@Test
	void testEstaCerrada() {
		Cerradura lock = new Cerradura(1234,3);
		assertTrue(lock.estaCerrada());
	}
	
	@Test
	void testFueBloqueada() {
		Cerradura lock = new Cerradura(1234,2);
		lock.abrir(222);
		lock.abrir(222);
		assertTrue(lock.fueBloqueada());
	}
	
	@Test
	void testcontarAperturasExitosas() {
		Cerradura lock = new Cerradura(1234,3);
		lock.abrir(1234);
		lock.abrir(222);
		lock.abrir(1234);
		assertEquals(lock.contarAperturasExitosas(),2);
	}

	@Test
	void testcontarAperturasFallidas() {
		Cerradura lock = new Cerradura(1234,3);
		lock.abrir(222);
		lock.abrir(222);
		assertEquals(lock.contarAperturasFallidas(),2);
	}
	
	
	
	
}
