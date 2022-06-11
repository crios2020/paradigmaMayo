public class Programa4{
    public static void main(String[] args) {
        //Persona p1=new Persona("Ana","Garcia");
        Persona p2=new Empleado("Cristian","Molina",26);
        Persona p3=new Cliente("Andres","Lapuente",22);

        //p1.saludar();
        p2.saludar();
        p3.saludar();
        
        //System.out.println(p1.getClass());
        System.out.println(p2.getClass());
        System.out.println(p3.getClass());
        
    }
}

class Cliente extends Persona{
    private int nroCliente;

    public Cliente(String nombre, String apellido, int nroCliente) {
        super(nombre, apellido);
        this.nroCliente = nroCliente;
    }
    
    //método sobreescrito
    public void saludar(){
        System.out.println("Hola soy un cliente! "+nroCliente);
    }

}

class Empleado extends Persona{
    private int nroLegajo;

    public Empleado(String nombre, String apellido, int nroLegajo) {
        super(nombre, apellido);    //llama al constructor de persona
        this.nroLegajo = nroLegajo;
    }

    //método sobreescrito
    public void saludar(){
        System.out.println("Hola soy un empleado! "+nroLegajo);
    }
}

abstract class Persona{
    private String nombre;
    private String apellido;
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void saludar(){
        System.out.println("Hola soy una persona");
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
