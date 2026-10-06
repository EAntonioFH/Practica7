
package modelosTecnologicos;

class DispMovil extends Dispositivo{

	//Atributos
	protected int nBotones;
	protected boolean puertoAudi;

	//Constructores
	public Dispositivo(int pila, int dimPantalla, String modelo, String marca, String os, 
				int nBotones, boolean puertoAudi){
		super(pila,dimPantalla,modelo,marca,os);
		this.nBotones=nBotones;
		this.puertoAudi=puertoAudi;
	}
	@Override
	protected String toString(){
		return super.toString()+String.format("%d\n%s tiene puerto de audifonos\n",nBotones,((puertoAudi)?"Si":"No"));
	}
}
