
package modelosTecnologicos;

public class Tablet extends DispMovil{

	//Atributos
	private boolean lapizDigital;


	//Constructores
	public Tablet(int categoria,String marca, String os, int pila, int dimPantalla, double precio, boolean puertoAudi, 
			int camaraW, int camaraH, boolean lapizDigital){
		super(categoria,marca,os,pila,dimPantalla,precio,puertoAudi, camaraW, camaraH);
		this.lapizDigital=lapizDigital;
	}


	@Override
	public String toString(){
		return super.toString()+String.format("Tiene lapizDIgital: %b\n",lapizDigital);
	}
}
