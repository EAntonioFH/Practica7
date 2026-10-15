
package modelosTecnologicos;

public class Laptop extends Computadora{

	//Atributos
	private double peso;
	private int relCamara;
	//Constructores
	public Laptop(int categoria,String marca, String os, int pila, int dimPantalla, double precio, boolean tarjetaGrafica, 
			int lenTeclado,	double peso, int relCamara){
		super(categoria,marca,os,pila,dimPantalla,precio, tarjetaGrafica, lenTeclado);
		this.peso=peso;
		this.relCamara=relCamara;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Peso: %.2f\nResolucion de camara: %d MP\n", peso, relCamara);
	}
}
