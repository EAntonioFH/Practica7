
package modelosTecnologicos;

public class Smartphone extends DispMovil{

	//Atributos
	private boolean eSIM;
	private int almacenamiento;

	//Constructores
	public Smartphone(int categoria, String marca, String os, int pila, int dimPantalla, double precio, boolean puertoAudi, 
			int camaraW, int camaraH, boolean eSIM, int almacenamiento){
		super(categoria,marca,os,pila,dimPantalla,precio, puertoAudi,camaraW, camaraH);
		this.eSIM=eSIM;
		this.almacenamiento=almacenamiento;
	}


	@Override
	public String toString(){
		return super.toString()+String.format("Tiene eSIM: %b\nAlmacenamiento: %d\n", eSIM, almacenamiento);
	}
}
