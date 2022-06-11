
//declaración de clase
public class Auto{
	
	//Atributos
	String marca;
	String modelo;
	String color;
	String patente;
	private int velocidad;
	
	//Método constructor
	
	

	
	//Métodos constructores
	public Auto(){} //constructor vacio!

	public Auto(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	//Métodos
	public void acelerar(){									//acelerar
		//velocidad = velocidad + 10;
		//if(velocidad>100){
		//	velocidad=100;
		//}
		acelerar(10);
	}
	
	//Método con ingreso de parámetros
	private void acelerar(int kilometros){					//acelerarInt
		velocidad = velocidad + kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	public void acelerar(int kilometros, boolean nitro){	//acelerarIntBoolean
		if(nitro){
			acelerar(kilometros*2);					//llamado a método de la misma clase
		}else{
			acelerar(kilometros);					//llamado a método de la misma clase
		}
	}
	
	public void acelerar(String x){}	//método de relleno
	
	public void frenar(){
		velocidad = velocidad - 10;
	}
	
	// método sin valor de retorno (void)
	public void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	// método con valor de retorno 
	public int obtenerVelocidad(){
		return velocidad;	//Valor retornado!
	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente
				+ ", velocidad=" + velocidad + "]";
	}
	

	
}// end class
