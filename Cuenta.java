public class Cuenta{
	private int nro;
	private String moneda;
	private double saldo;
	
	//método Constructor
	Cuenta(int nro, String moneda){
		this.nro=nro;
		this.moneda=moneda;
	}

	void depositar(double monto){
		saldo=saldo+monto;
	}
	
	void debitar(double monto){
		if(monto<=saldo){
			saldo=saldo-monto;
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
	
	String obtenerEstado(){
		return nro+", "+moneda+", "+saldo;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
