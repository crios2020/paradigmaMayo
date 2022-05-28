public class Cliente {
    int nro;
    String nombre;
    String apellido;
    Cuenta cuenta;

    public Cliente(int nro, String nombre, String apellido, int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta=new Cuenta(nroCuenta, "arg$");
    }

    public Cuenta obtenerCuenta(){
        return this.cuenta;
    }

    public String obtenerEstado(){
        return nro+", "+nombre+", "+apellido+", "+cuenta.obtenerEstado();
    }
    
}
