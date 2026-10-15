package app;

import java.util.ArrayList;
import java.util.List;
import modelosTecnologicos.*;

public class CargadorDatos {

    public static List<Dispositivo> cargarCatalogo() {
        List<Dispositivo> productos = new ArrayList<>();

        // Laptops
	// public laptop(int categoria,String marca, String os, int pila, int dimPantalla,
	//  double precio, boolean tarjetaGrafica,int lenTeclado,double peso, int relCamara)
        productos.add(new Laptop(Dispositivo.MEJOR, "Apple", "macOS", 100, 14, 25000, true, 78, 1.4, 12));
        productos.add(new Laptop(Dispositivo.REGULAR, "Lenovo", "Windows", 80, 15, 15000, true, 82, 2.0, 8));
        productos.add(new Laptop(Dispositivo.ESTUDIANTE, "Acer", "Windows", 60, 14, 9000,false, 80, 1.8, 5));

        // PCs
	// public PC(int categoria,String marca, String os, int pila, int dimPantalla, 
	// double precio, boolean tarjetaGrafica, int lenTeclado,int tamanoGabinete, boolean refrigeracionLiquida)
        productos.add(new PC(Dispositivo.MEJOR, "HP", "Windows", 0, 27, 30000,true, 104, 30, true));
        productos.add(new PC(Dispositivo.REGULAR, "Dell", "Windows", 0, 24, 18000,true, 104, 25, false));
        productos.add(new PC(Dispositivo.ESTUDIANTE, "Asus", "Windows", 0, 22, 12000, false, 104, 20, false));

        // Smartphones
	// public Smartphone(int categoria, String marca, String os, int pila, int dimPantalla,
	// double precio, boolean puertoAudi,int camaraW int camaraH, boolean eSIM, int almacenamiento)
        productos.add(new Smartphone(Dispositivo.MEJOR, "Samsung", "Android", 5000, 6, 22000,false, 108, 200, true, 512));
        productos.add(new Smartphone(Dispositivo.REGULAR, "Xiaomi", "Android", 4500, 6, 8000,true, 64, 108, false, 256));
        productos.add(new Smartphone(Dispositivo.ESTUDIANTE, "Motorola", "Android", 4000, 6, 5000,true, 48, 64, false, 128));

        // Tablets 
	// public Tablet(int categoria,String marca, String os, int pila, int dimPantalla, 
	// double precio, boolean puertoAudi,int camaraW int camaraH, boolean lapizDigital)
        productos.add(new Tablet(Dispositivo.MEJOR, "Apple", "iPadOS", 8000, 11, 20000,false, 12, 12, true));
        productos.add(new Tablet(Dispositivo.REGULAR, "Samsung", "Android", 7000, 10, 10000,true, 8, 8, true));
        productos.add(new Tablet(Dispositivo.ESTUDIANTE, "Lenovo", "Android", 6000, 10, 6000,true, 5, 5, false));

        return productos;
    }
}
