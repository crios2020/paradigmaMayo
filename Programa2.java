public class Programa2{
	public static void main(String[] args){

		//Continuar desde Diapo Class Programa

		System.out.println("-- cuenta 1 --");
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(80000);
		cuenta1.depositar(50000);
		cuenta1.debitar(30000);
		System.out.println(cuenta1.obtenerEstado());

		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1, "Juan", "Perez", 10);
		cliente1.obtenerCuenta().depositar(200000);
		cliente1.obtenerCuenta().debitar(50000);
		//cliente1.obtenerCuenta().saldo=999999999;
		cliente1.obtenerCuenta().debitar(300000000);
		//cliente1.obtenerCuenta().moneda="U$S";
		cliente1.obtenerCuenta().setMoneda("U$S");
		System.out.println(cliente1.obtenerEstado());

	}
}
