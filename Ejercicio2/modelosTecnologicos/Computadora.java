
package modelosTecnologicos;

public abstract class Computadora extends Dispositivo{
	//Atributos
	protected boolean tarjetaGrafica;
	protected int lenTeclado;

	//Constructoresp
	public Computadora(int categoria, String marca, String os, int pila, int dimPantalla, 
			double precio, boolean tarjetaGrafica, int lenTeclado){
		super(categoria,marca,os,pila,dimPantalla,precio);
		this.tarjetaGrafica=tarjetaGrafica;
		this.lenTeclado=lenTeclado;
	}
	@Override
	public String toString(){
		return super.toString()+ String.format("N. teclas: %d\nHay tarjeta?: %b\n", lenTeclado, tarjetaGrafica);
	}
}
