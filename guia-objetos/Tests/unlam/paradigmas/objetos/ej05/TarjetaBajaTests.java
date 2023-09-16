package unlam.paradigmas.objetos.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTarjetaInvalida() {
		TarjetaBaja sube = new TarjetaBaja(-1);
		assertEquals(sube.obtenerSaldo(),0);
	}
	
	@Test
	void testTarjetaValida() {
		TarjetaBaja sube = new TarjetaBaja(10000);
		assertEquals(sube.obtenerSaldo(),10000);
	}
	
	@Test
	void testSetterSaldo() {
		TarjetaBaja sube = new TarjetaBaja(10);
		sube.cargar(10);
		assertEquals(sube.obtenerSaldo(),20);
	}
	
	@Test
	void testPagarViajeEnColectivoSinSaldo() {
		TarjetaBaja sube = new TarjetaBaja(10);
		sube.pagarViajeEnColectivo();
		assertEquals(sube.obtenerSaldo(),10);
	}
	
	@Test
	void testPagarViajeEnColectivoConSaldo() {
		TarjetaBaja sube = new TarjetaBaja(39.59);
		sube.pagarViajeEnColectivo();
		assertEquals(sube.obtenerSaldo(),0);
	}
	
	@Test
	void testPagarViajeEnSubteSinSaldo() {
		TarjetaBaja sube = new TarjetaBaja(10);
		sube.pagarViajeEnColectivo();
		assertEquals(sube.obtenerSaldo(),10);
	}
	
	@Test
	void testPagarViajeEnSubteConSaldo() {
		TarjetaBaja sube = new TarjetaBaja(34.50);
		sube.pagarViajeEnSubte();
		assertEquals(sube.obtenerSaldo(),0);
	}
	
	@Test
	void testContarViajesEnColectivo() {
		TarjetaBaja sube = new TarjetaBaja(10000);
		sube.pagarViajeEnColectivo();
		sube.pagarViajeEnColectivo();
		sube.pagarViajeEnColectivo();
		assertEquals(sube.contarViajesEnColectivo(),3);
	}
	
	@Test
	void testContarViajesEnSubte() {
		TarjetaBaja sube = new TarjetaBaja(10000);
		sube.pagarViajeEnSubte();
		sube.pagarViajeEnSubte();
		assertEquals(sube.contarViajesEnSubte(),2);
	}
	
	@Test
	void testContarViajes() {
		TarjetaBaja sube = new TarjetaBaja(10000);
		sube.pagarViajeEnSubte();
		sube.pagarViajeEnSubte();
		sube.pagarViajeEnColectivo();
		sube.pagarViajeEnColectivo();
		assertEquals(sube.contarViajes(),4);
	}

}
