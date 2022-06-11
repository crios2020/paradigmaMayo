public class Cliente {
    int nro;
    String nombre;
    String apellido;
    Cuenta cuenta;

	//Este constructor permite tener un objeto sin estado.
    //public Cliente() {
		//Constructor Vacio
    //}
    
    //Este constructor permite que un cliente puede crearse sin una cuenta
	public Cliente(int nro, String nombre, String apellido) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
    }

	//Este constructor crea una cuenta que es propia del cliente.
    public Cliente(int nro, String nombre, String apellido, int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta=new Cuenta(nroCuenta, "arg$");
    }
    
    //Este constructor permite crear un cliente con una cuenta que pertenece a otro cliente
    public Cliente(int nro, String nombre, String apellido, Cuenta cuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta=cuenta;
    }

    public Cuenta obtenerCuenta(){
        return this.cuenta;
    }

    public String obtenerEstado(){
        return nro+", "+nombre+", "+apellido+", "+cuenta.obtenerEstado();
    }
    
}
