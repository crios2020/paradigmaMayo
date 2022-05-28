import javax.swing.JOptionPane;
public class Programa{
	public static void main(String[] args){
		
		//IDE Integrated Development Enviroment
		//	Entorno de Desarrollo Integrado

		//Programa clasico
		System.out.println("Hola Mundo");
		
		
		// creamos objetos de la clase Auto
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();						//método constructor
		auto1.marca="Ford";
		auto1.modelo="Ka";
		auto1.color="Negro";
		auto1.acelerar();				//10
		auto1.acelerar();				//20
		auto1.acelerar();				//30
		auto1.frenar();					//20
		//auto1.acelerar(25);				//45
		//auto1.acelerar(12);				//57
		auto1.acelerar(15,true);		//87
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.obtenerVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Citroen";
		auto2.modelo="C4";
		auto2.color="Verde";
		for(int a=0; a<=60; a++){
			auto2.acelerar();
		}
		//auto2.velocidad=360;
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.obtenerVelocidad());
		
		auto2.imprimirVelocidad();	//imprime la velocidad
		System.out.println(auto2.obtenerVelocidad());	//devuelve la velocidad
		
		//JOptionPane.showMessageDialog(null,"Hola a todos!");
		JOptionPane.showMessageDialog(null,"Velocidad: "+auto2.obtenerVelocidad());
		
		
		//Los atributos String se inicializan automaticamente en null
		//Los atributos numericos se inicializan automaticamente en 0
		//Las variables deben ser inicializadas obligatoriamente.

		System.out.println("-- auto3 --");
		Auto auto3=new Auto("Renault","12","Azul");
		System.out.println(auto3);
		
		
	}
}
