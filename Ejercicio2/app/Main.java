package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import modelosHumanos.*;
import modelosTecnologicos.Dispositivo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Dispositivo> catalogo=CargadorDatos.cargarCatalogo();
		List<Dispositivo> disponibles= new ArrayList<>();

		System.out.println("Bienvenido a la simualcion de una tienda de tecnologia");
		System.out.println("Elige tu tipo de cliente");
		System.out.println("1. Cliente VIP");
		System.out.println("2. Regular");
		System.out.printf("3. Estudiante\n-> ");
		int opcion = Integer.parseInt(sc.nextLine());

		Comprador comprador = switch (opcion) {
			case 1 -> new ClienteVip();
			case 2 -> new Regular();
			case 3 -> new Estudiante();
			default -> new Regular();
		};

		for(Dispositivo dispositivo: catalogo)
			if(comprador.dispositivoDisponible(dispositivo))
				disponibles.add(dispositivo);

		System.out.printf("\nDispositivos disponible:\n");

		for (int i = 0; i < disponibles.size(); i++) {
			Dispositivo dispositivo = disponibles.get(i);
			System.out.println("["+(i+1)+"]");
			System.out.println(dispositivo);
		}

		do{
			System.out.printf("\nOpciones\n");
			System.out.println("1.- Agregar al carrito");
			System.out.println("2.- Finalizar compra");
			System.out.printf("3.- Salir\n->");
			opcion = Integer.parseInt(sc.nextLine());

			switch(opcion){
			case 1:
				System.out.print("Digita el numero del articulo: ");
				int aux = Integer.parseInt(sc.nextLine());
				comprador.agregarAlCarrito(disponibles.get(aux-1));
				break;
			case 2:
				comprador.comprar();
				break;
			case 3:	break;
			}
		}while(opcion!=3);
		System.out.println("Finalizando programa");
		sc.close();
	}
}
