
package modelosTecnologicos;

public class PC extends Computadora{

	//Atributos
	private int tamanoGabinete;
	private boolean refrigeracionLiquida;
	//Constructores
	public PC(int categoria,String marca, String os, int pila, int dimPantalla, double precio, boolean tarjetaGrafica, int lenTeclado,
			int tamanoGabinete, boolean refrigeracionLiquida){
		super(categoria,marca,os,pila,dimPantalla,precio, tarjetaGrafica, lenTeclado);
		this.tamanoGabinete=tamanoGabinete;
		this.refrigeracionLiquida=refrigeracionLiquida;	
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Gabinete: %d m^2\nRefrigeracion liquida: %b\n",tamanoGabinete,refrigeracionLiquida);
	}
}
