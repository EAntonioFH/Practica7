package modelosTecnologicos;

public abstract class Dispositivo{

	public static final int MEJOR = 0;
	public static final int REGULAR = 1;
	public static final int ESTUDIANTE = 2;
	//Atributos
	protected int pila;
	protected int dimPantalla;
	protected String marca; 
	protected String os;
	protected double precio;
	protected int categoria; //mejor: 0 regular: 1 estudiante:2

	//Constructores
	public Dispositivo(int categoria, String marca, String os, int pila, int dimPantalla, double precio){
		this.categoria=categoria;
		this.pila=pila;
		this.precio=precio;
		this.dimPantalla=dimPantalla;
		this.marca=marca;
		this.os=os;
	}
	public String getNombre() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCategoria() {
		return categoria;
	}
	@Override
	public String toString() {
		return String.format(
				"Marca: %s\nOS: %s\nPila: %d mAh\nPantalla: %d\nPrecio: $%.2f\n",
				marca, os, pila, dimPantalla, precio
				);
	}
}
