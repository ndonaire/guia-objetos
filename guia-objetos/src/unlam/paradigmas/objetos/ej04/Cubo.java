package unlam.paradigmas.objetos.ej04;

public class Cubo {

	private double longitudLado;	
    
    public Cubo (double longitudLado) {
    	if(longitudLado > 0 )
    		this.longitudLado = longitudLado;
    	else
    		System.out.print("Longitud de lado inválido");
    }

    public double obtenerLado() {
    	return this.longitudLado;
    }
        
    public void cambiarLado(double longitudLado) {
    	if(longitudLado > 0 )
    		this.longitudLado = longitudLado;    		
    	else
    		System.out.print("Longitud de lado inválido");
    }
    
    public double obtenerAreaCara() {
    	return Math.pow(this.longitudLado, 2);
    }
    
    public void cambiarAreaCara(double areaCara) {
    	if(areaCara > 0 )     		
    		this.longitudLado = Math.sqrt(areaCara);
    	else
    		System.out.print("Area de cara inválida");
    }

    public double obtenerVolumen() {
    	return Math.pow(this.longitudLado, 3);
    }

    public void cambiarVolumen(double volumen) {
    	if(volumen > 0 )
    		this.longitudLado = Math.cbrt(volumen);
    	else
    		System.out.print("Volumen inválido");
    }
}
