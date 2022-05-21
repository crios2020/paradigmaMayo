
//declaración de clase
public class Auto{
	
	//Atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//Métodos
	void acelerar(){
		velocidad = velocidad + 10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void frenar(){
		velocidad = velocidad - 10;
	}
	
}// end class
