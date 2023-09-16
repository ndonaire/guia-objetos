package unlam.paradigmas.objetos.ej03;

public class Circulo {
	
	private double radio;

	public Circulo(double radio) {
		if(radio > 0)
			this.radio = radio;
		else
			System.out.print("Valor de radio inválido");
	}

	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		if(radio > 0)
			this.radio = radio;
		else
			System.out.print("Valor de radio inválido");
	}
	
	public double getDiametro() {
		return 2 * this.radio;
	}
	
	public double getPerimetro() {
		return this.getDiametro()* Math.PI;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(),2);
	}
}
