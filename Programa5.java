public class Programa5{
	public static void main(String[] args){
		
		Auto.acelerar();
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("Citroen", "C4", "Negro");
		auto1.acelerar();
		auto1.acelerar();
		System.out.println(auto1+" "+auto1.getVelocidad());
		
		Auto.frenar();
		Auto.frenar();
		Auto.frenar();
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("Renaul","Kangoo","Rojo");
		auto2.acelerar();
		System.out.println(auto2+" "+auto2.getVelocidad());
		System.out.println(auto1+" "+auto1.getVelocidad());
		
	}
}

class Auto{
	//Atributos
	String marca;
	String modelo;
	String color;
	static int velocidad;
	
	public Auto(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static void frenar(){
		velocidad=velocidad-10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
	
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
