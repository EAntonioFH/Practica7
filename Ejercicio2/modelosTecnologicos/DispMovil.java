
package modelosTecnologicos;

class DispMovil extends Dispositivo{

	//Atributos
	protected boolean puertoAudi;
	protected int camaraW;
	protected int camaraH;

	//Constructores
	public DispMovil(int categoria,String marca, String os, int pila, int dimPantalla, double precio, boolean puertoAudi, 
			int camaraW ,int camaraH){
		super(categoria,marca,os,pila,dimPantalla,precio);
		this.camaraW=camaraW;
		this.camaraH=camaraH;
		this.puertoAudi=puertoAudi;
	}
	@Override
	public String toString(){
		return super.toString()+String.format("Tiene audifonos alambricos: %b\nCamara: %dx%d\n", puertoAudi,camaraW,camaraH);
	}
}
