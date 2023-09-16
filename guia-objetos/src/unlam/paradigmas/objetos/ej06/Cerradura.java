package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	private int clave;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estadoAbierta = false;
	private boolean estadoBloqueada = false;
	private int cantAperturasExitosas =  0;
	private int cantAperturasFallidas = 0; 
	
	public Cerradura(int clave, int cantidadDeFallosConsecutivosQueLaBloquean) {
		if( cantidadDeFallosConsecutivosQueLaBloquean > 0) {
				this.clave = clave;
				this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		}
		else
			System.out.print("Cantidad inválida de fallos admitidos");
	}
		
	public int getCantidadDeFallosConsecutivosQueLaBloquean() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(int clave) {
		if(clave == this.clave) {
			this.estadoAbierta = true;
			this.cantAperturasExitosas++;
			return true;
		}
		else
		{
			this.cantAperturasFallidas++;
			if(this.cantAperturasFallidas >= this.cantidadDeFallosConsecutivosQueLaBloquean)
				estadoBloqueada = true;
			return false;
		}
	}
	public void cerrar() {
		this.estadoAbierta = false;
	}
	public boolean estaAbierta() {
		return this.estadoAbierta;
	}
	public boolean estaCerrada() {
		return !this.estadoAbierta;
	}
	public boolean fueBloqueada() {
		return this.estadoBloqueada;
	}
	public int contarAperturasExitosas() {
		return this.cantAperturasExitosas;
	}
	public int contarAperturasFallidas() {
		return this.cantAperturasFallidas;
	}
	
}
