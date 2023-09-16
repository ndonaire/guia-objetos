package unlam.paradigmas.objetos.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGettersX() {
		Punto point = new Punto(-34.6647109476089, -58.608847499771954);
		
		assertEquals(point.obtenerX(),-34.6647109476089,0.000000000000001);
	}
	
	@Test
	public void testGettersY() {
		Punto point = new Punto(-34.6647109476089, -58.608847499771954);
		
		assertEquals(point.obtenerY(),-58.608847499771954,0.000000000000001);
	}
	
	@Test
	public void testSettersX() {
		Punto point = new Punto(-34.6647109476089, -58.608847499771954);
		point.cambiarX(1.4);
		
		assertEquals(point.obtenerX(),1.4,0.000000000000001);
	}
	
	@Test
	public void testSettersY() {
		Punto point = new Punto(-34.6647109476089, -58.608847499771954);
		point.cambiarY(1.4);
		
		assertEquals(point.obtenerY(),1.4,0.000000000000001);
	}
	
	@Test
	public void testdistanciaAlOrigen() {
		Punto point = new Punto(-1.5, 5.6);
			
		assertEquals(point.distanciaAlOrigen(),5.79741,0.0001);
	}
	
	@Test
	public void testdistanciaAOtroPunto() {
		Punto point1 = new Punto(-1.5, 5.6);
		Punto point2 = new Punto(1.5, -5.6);
		
		assertEquals(point1.distanciaAotroPunto(point2),11.5948264,0.000001);
	}	

	@Test
	public void testSobreEjeX() {
		Punto point = new Punto(-1.5,0);
		
		assertTrue(point.estaSobreEjeX());
	}
	
	@Test
	public void testSobreEjeY() {
		Punto point = new Punto(0,-1.5);
		
		assertTrue(point.estaSobreEjeY());
	}
	
	@Test
	public void testEsElOrigen() {
		Punto point = new Punto(0,0);		
		assertTrue(point.esElOrigen());
	}	

}
