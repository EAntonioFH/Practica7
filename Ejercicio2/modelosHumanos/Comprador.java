package modelosHumanos;

import modelosTecnologicos.Dispositivo;

public abstract class Comprador{

	protected int categoria;
	protected Carrito carrito = new Carrito();

	public Comprador(int categoria) {
		this.categoria=categoria;
	}

	public boolean dispositivoDisponible(Dispositivo disp) {
		return categoria==disp.getCategoria();
	}

	public void agregarAlCarrito(Dispositivo disp) {
		carrito.add(disp);
		System.out.println("Agregado: " + disp.getNombre());
	}

	public double total() {
		return carrito.subtotal()*(1-getDescuento());
	}

	public void comprar() {
		if (carrito.isEmpty()) {
			System.out.println("Carrito vacio");
			return;
		}
		System.out.println("Compra:");
		carrito.mostrar();
		System.out.printf("Subtotal: $%.2f\n", carrito.subtotal());
		System.out.printf("Descuento: %.0f\n", getDescuento() * 100);
		System.out.printf("Total: $%.2f\n", total());
		carrito.clear();
	}
	public abstract double getDescuento();
}
