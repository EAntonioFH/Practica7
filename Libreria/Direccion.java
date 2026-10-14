public class Direccion
{
    private String calle;
    private int numeroExterior;
    private int numeroInterior;
    private String colonia;
    private String ciudad;
    private String pais;

    public Direccion(String calle, int numeroExterior, int numeroInterior, String colonia, String ciudad, String pais)
    {
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Direccion(String calle, int numeroInterior, String colonia, String ciudad, String pais)
    {
        this.calle = calle;
        this.numeroInterior = numeroInterior;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCalle()
    {
        return calle;        
    }
    public int getNumeroExterior()
    {
        return numeroExterior;
    }
    public int getNumeroInterior()
    {
        return numeroInterior;
    }
    public String getColonia()
    {
        return colonia;
    }
    public String getCiudad()
    {
        return ciudad;
    }
    public String getPais()
    {
        return pais;
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }
    public void setNumeroExterior(int numeroExterior)
    {
        this.numeroExterior = numeroExterior;
    }
    public void setNumeroInterior(int numeroInterior)
    {
        this.numeroInterior = numeroInterior;
    }
    public void setColonia(String colonia)
    {
        this.colonia = colonia;
    }
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }
    public void setPais(String pais)
    {
        this.pais = pais;
    }

    @Override
    public String toString()
    {
        return String.format("\n\t%s ,%s ,%s ,%s, #%d ,numinterior #%d", pais, ciudad, colonia, calle, numeroExterior, numeroInterior);
    }
}