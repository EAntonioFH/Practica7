public class LibroFisico extends Libro
{
    private boolean pastaDura;
    private int numImpresion;

    public LibroFisico(String titulo, int añoPublicacion, Autor autor, double precio, boolean pastaDura, int numImpresion)
    {
        super(titulo, añoPublicacion, autor, precio);
        this.pastaDura = pastaDura;
        this.numImpresion = numImpresion;
    }

    public boolean getPastaDura()
    {
        return pastaDura;
    }

    public void getPastaDura(boolean pastaDura)
    {
        this.pastaDura = pastaDura;
    }

    public int getNumImpresion()
    {
        return numImpresion;
    }

    public void setNumImpresion(int numImpresion)
    {
        this.numImpresion = numImpresion;
    }
}