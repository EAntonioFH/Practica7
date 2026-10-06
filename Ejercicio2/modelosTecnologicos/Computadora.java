
package modelosTecnologicos;

class Computadora extends DispMovil{

	//Atributos
	//Constructores
	public Dispositivo(int pila, int dimPantalla, String modelo, String marca, String os, 
				int nBotones, boolean puertoAudi){
		super(pila,dimPantalla,modelo,marca,os,nBotones,puertosAudi);
	}
	@Override
	protected String toString(){
		return super.toString();
	}
}
