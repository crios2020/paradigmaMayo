class Auto{
	$marca;
}

echo 'Hola Mundo!';
$auto1=new Auto();
$p1=new Persona();
$p1->saludar();

class Persona{
	$nombre;
	
	public function saludar(){
		echo 'Hola';
	}
}
