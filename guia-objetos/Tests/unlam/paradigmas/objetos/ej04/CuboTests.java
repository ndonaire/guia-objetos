package unlam.paradigmas.objetos.ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCuboInvalido() {
		Cubo cubo = new Cubo(-1);
		
		assertEquals(cubo.obtenerLado(),0);
	}
	
	@Test
	void testCuboValido() {
		Cubo cubo = new Cubo(9);
		
		assertEquals(cubo.obtenerLado(),9);
	}
	
	@Test
	void testSetterLado() {
		Cubo cubo = new Cubo(4);
		cubo.cambiarLado(7);
		
		assertEquals(cubo.obtenerLado(),7);
	}
	
	@Test
	void testGetterAreaCara() {
		Cubo cubo = new Cubo(4);
		
		assertEquals(cubo.obtenerAreaCara(),16);
	}
	
	@Test
	void testSetterAreaCara() {
		Cubo cubo = new Cubo(4);
		cubo.cambiarAreaCara(4);
		
		assertEquals(cubo.obtenerAreaCara(),4);
	}
	
	@Test
	void testGetterVolumen() {
		Cubo cubo = new Cubo(2);
		
		assertEquals(cubo.obtenerVolumen(),8);
	}
	
	@Test
	void testSetterVolumen() {
		Cubo cubo = new Cubo(4);
		cubo.cambiarAreaCara(27);
		
		assertEquals(cubo.obtenerAreaCara(),27);
	}
	
}
