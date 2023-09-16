package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	private double saldo;
	private int viajesColectivo =  0;
	private int viajesSubte =  0;
	static final double precioViajeColectivo = 39.59;
	static final double precioViajeSubte = 34.50;
	
	public TarjetaBaja(double saldoInicial) {
		if(saldoInicial > 0 )
			this.saldo = saldoInicial;
		else
			System.out.print("Saldo inicial inválido");
	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	public void cargar(double monto) {
		if(monto > 0 )
			this.saldo += monto;
		else
			System.out.print("Monto inválido");
	}

	public void pagarViajeEnColectivo() {
		if(this.saldo >= precioViajeColectivo){
			this.saldo -= precioViajeColectivo;
			this.viajesColectivo++;
		}
		else
			System.out.print("Saldo insuficiente");
	}

	public void pagarViajeEnSubte() {
		if(this.saldo >= precioViajeSubte) {
			this.saldo -= precioViajeSubte;
			this.viajesSubte++ ;
		}
		else
			System.out.print("Saldo insuficiente");
	}

	public int contarViajes() {
		return this.viajesColectivo + this.viajesSubte;
	}

	public int contarViajesEnColectivo() {
		return this.viajesColectivo;
	}

	public int contarViajesEnSubte() {
		return this.viajesSubte;
	}

}
