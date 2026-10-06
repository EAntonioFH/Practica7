package modelosTecnologicos;

class Dispositivo{

	//Atributos
	protected int pila;
	protected int dimPantalla;
	protected String modelo;
	protected String marca; 
	protected String os;

	//Constructores
	public Dispositivo(int pila, int dimPantalla, String modelo, String marca){
		this.pila=pila;
		this.dimPantalla=dimPantalla;
		this.modelo=modelo;
		this.marca=marca;
	}
	@Override
	protected void toString(){
		return String.format("%d\n%d\n%s\n%s\n%s\n",pila,dimPantalla,modelo,marca,os);
	}
}
