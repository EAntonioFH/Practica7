public class LibroDigital extends Libro
{
    private String formato;
    private int tamano;

    public LibroDigital(String titulo, int añoPublicacion, Autor autor, double precio, String formato, int tamano)
    {
        super(titulo, añoPublicacion, autor, precio);
        this.formato = formato;
        this.tamano = tamano;
    }

    public String getFormato()
    {
        return formato;
    }

    public void setFormato(String formato)
    {
        this.formato = formato;
    }

    public int getTamano()
    {
        return tamano;
    }

    public void setTamano(int tamano)
    {
        this.tamano = tamano;
    }
}