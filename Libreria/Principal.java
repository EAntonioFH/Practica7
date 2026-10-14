public class Principal
{
    public static void main(String[] args)
    {
        Direccion ubicacion = new Direccion("Hidalgo",15,3,"San Miguel","Puebla","China");
        Empleado voluntario = new Empleado("Juan", 15, 0, "Mostrador");
        LibroDigital l1 = new LibroDigital("El libro inventado", 2045, new Autor("LoveMan", "H.P."), 200.25,"PDF",145);
        LibroDigital l2 = new LibroDigital("La historia del sujeto", 1945, new Autor("Manuel", "G."), 800.75,"PDF",700);
        LibroDigital l3 = new LibroDigital("Apuntes tomo1", 2008, new Autor("Julio", "Crammer"), 150,"EPUB",10);
        LibroFisico l4 = new LibroFisico("Juana y el examen de control", 2026, new Autor("Alberto", "UNAM"), 1500, false, 1);
        LibroFisico l5 = new LibroFisico("Juan Silvestre", 2002, new Autor("Juan", "Paz"), 500.12, true, 800);
        Libreria local45 = new Libreria("Libros y poetas", "12312312", "12:00-17:00", ubicacion);
        
        local45.setEmpleado(voluntario);
        local45.agregarLibro(l1);
        local45.agregarLibro(l2);
        local45.agregarLibro(l3);
        local45.agregarLibro(l4);
        local45.agregarLibro(l5);

        System.out.println("\tLibros en la libreria: ");
        local45.getLibros();
        System.out.println("\nLibros registrados: " + Libreria.cantidadLibros);

        Cliente librofilo = new Cliente("Juan", 30, "159113254");
        System.out.println("\n" + librofilo.getNombre() + " ha venido a comprar");

        local45.facturaCompra(librofilo, l4);

        System.out.println("\n" + librofilo.getNombre() + " tiene un libro más en su colección");
        librofilo.getcoleccion();
    }
}