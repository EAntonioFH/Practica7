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

    public String getCalle
    {
        return calle;        
    }
    public int getNumeroExterior
    {
        return numeroExterior;
    }
    public int getNumeroInterior
    {
        return numeroInterior;
    }
    public String getColonia
    {
        return colonia;
    }
    public String getCiudad
    {
        return ciudad;
    }
    public String getPais
    {
        return pais;
    }

    public void setCalle
    {
        return calle;
    }
    public void setNumeroExterior
    {
        return numeroExterior;
    }
    public void setNumeroInterior
    {
        return numeroInterior;
    }
    public void setColonia
    {
        return colonia;
    }
    public void setCiudad
    {
        return ciudad;
    }
    public void setPais
    {
        return pais;
    }

    @override
    public String toString()
    {
        return String.format("\n\t%s ,%s ,%s ,%s, #%d ,numinterior #%d", pais, ciudad, colonia, calle, numeroExterior, numeroInterior);
    }
}