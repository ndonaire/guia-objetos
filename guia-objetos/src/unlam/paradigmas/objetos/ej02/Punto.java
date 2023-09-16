package unlam.paradigmas.objetos.ej02;

public class Punto {
	private double coordX;
	private double coordY;
		
	public Punto(double coordX, double coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public double obtenerX() {
		return coordX;
	}
	
	public void cambiarX(double coordX) {
		this.coordX = coordX;
	}
	
	public double obtenerY() {
		return coordY;
	}
	
	public void cambiarY(double coordY) {
		this.coordY = coordY;
	}
	
	public boolean estaSobreEjeX() {
		return this.coordY == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.coordX == 0;
	}
	
	public boolean esElOrigen() { 
		return this.estaSobreEjeX() && this.estaSobreEjeY();
	}

	public double distanciaAlOrigen() { 
		return Math.sqrt(Math.pow(this.coordX, 2) + Math.pow(this.coordY, 2)); 
		
	}
	public double distanciaAotroPunto(Punto otro) { 
		return Math.sqrt(Math.pow(this.coordX-otro.coordX, 2) + Math.pow(this.coordY-otro.coordY, 2));
		
	}
}
