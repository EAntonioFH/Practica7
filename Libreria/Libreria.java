import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private String telefono;
    private String horario;
    private ArrayList<Libro> libros;
    private Direccion localizacion;
    private Empleado mostrador;
    public static int cantidadLibros = 0;

    public Libreria(String nombre, String telefono, String horario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
    }

    public Libreria(String nombre, String telefono, String horario, Direccion localizacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
        this.localizacion = localizacion;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        cantidadLibros++;
    }

    public void getLibros() {
        for(Libro libro : libros)
            System.out.println("Titulo: " + libro.getTitulo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Direccion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Direccion localizacion) {
        this.localizacion = localizacion;
    }

    public Empleado getEmpleado()
    {
        return mostrador;
    }

    public void setEmpleado(Empleado mostrador)
    {
        this.mostrador = mostrador;
    }

    public void facturaCompra(Cliente comprador, Libro ejemplar)
    {
        System.out.println("\n\tTICKET DE COMPRA");
        System.out.println("Cliente: " + comprador.getNombre());
        System.out.println("Libro: " + ejemplar.getTitulo());
        System.out.println("Autor: " + ejemplar.getAutor().getNombreCompleto());
        System.out.println("Precio: $" + ejemplar.getPrecio());
        System.out.println("Num tarjeta: " + comprador.getNumTarjeta());
        System.out.println("Despacho: " + this.getEmpleado().getNombre());
        System.out.println("GRACIAS POR SU COMPRA");

        comprador.agregarColeccion(ejemplar);
    }
}