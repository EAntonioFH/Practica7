import java.util.ArrayList;

public class Cliente extends Usuario
{
    private String numTarjeta;
    private ArrayList<Libro> coleccion;

    public Cliente(String nombre, int edad, String numTarjeta)
    {
        super(nombre, edad);
        this.edad = edad;
        this.coleccion = new ArrayList<Libro>();
    }

    public String getNumTarjeta()
    {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta)
    {
        this.numTarjeta = numTarjeta;
    }

    public void agregarColeccion(Libro ejemplar)
    {
        coleccion.add(ejemplar);
    }
}