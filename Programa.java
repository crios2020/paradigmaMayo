public class Programa{
	public static void main(String[] args){
		
		//Programa clasico
		System.out.println("Hola Mundo");
		
		
		// creamos objetos de la clase Auto
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();
		auto1.marca="Ford";
		auto1.modelo="Ka";
		auto1.color="Negro";
		auto1.acelerar();				//10
		auto1.acelerar();				//20
		auto1.acelerar();				//30
		auto1.frenar();					//20
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Citroen";
		auto2.modelo="C4";
		auto2.color="Verde";
		for(int a=0; a<=60; a++){
			auto2.acelerar();
		}
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
		
	}
}
