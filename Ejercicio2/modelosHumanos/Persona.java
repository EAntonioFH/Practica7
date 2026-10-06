package modelosHumanos;

class Persona{
	String nombre;
	int edad;
	boolean sexo;

	public Persona(String nombre, int edad, boolean sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	protected String toString(){
		return String.format("%s\n%d\n%s\n",nombre,eded,(sexo)?"Hombre":"Mujer");
	}
}
