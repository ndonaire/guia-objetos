package unlam.paradigmas.objetos.ej01;

public class Nota {
	
	private int valorNota;
	
    public Nota(int valorInicial) {
    	if(valorInicial >= 0 && valorInicial <= 10)
    		this.valorNota = valorInicial;
    	else
    		System.out.println("Nota inválida");
    }
    
    public int obtenerValor() {
    	return this.valorNota;
    }
    
    public boolean aprobado() {
    	return this.valorNota >=4;
    }
    
    public boolean desaprobado() {
    	return !this.aprobado();
    }
    
    public void recuperar(int nuevoValor) {
		if(nuevoValor > this.valorNota)
			this.valorNota = nuevoValor; 
	}

}
