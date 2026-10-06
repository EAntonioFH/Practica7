import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private String telefono;
    private String horario;
    private ArrayList<Libro> libros;
    private Direccion localizacion;

    public Libreria(String nombre, String direccion, String telefono, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
    }

    public Libreria(String nombre, String direccion, String telefono, String horario, Direccion localizacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
        this.localizacion = localizacion;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
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
}
