public class Autor {
    private String nombre;
    private String apellido;
    private String corrienteLiterario;
    private String nacionalidad;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Autor(String nombre, String apellido, String corrienteLiterario, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.corrienteLiterario = corrienteLiterario;
    }

    public String getNombre() { 
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorrienteLiteraria() {
        return corrienteLiterario;
    }

    public void setCorrienteLiteraria(String corrienteLiterario) {
        this.corrienteLiterario = corrienteLiterario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}

