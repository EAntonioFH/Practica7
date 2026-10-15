package modelosHumanos;

import java.util.ArrayList;
import modelosTecnologicos.Dispositivo;

public class Carrito extends ArrayList<Dispositivo> {

	public double subtotal() {
		double suma = 0;
		for (Dispositivo disp : this)
			suma += disp.getPrecio();
		return suma;
	}

	//Interesante que al heredar se pueda hacer esto
	public void mostrar() {
		forEach(disp -> System.out.printf("- %s $%.2f%n", disp.getNombre(), disp.getPrecio()));
	}
}
