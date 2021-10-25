package TPMUSEO;

public class TipoIngreso 
{
    private String descripcionTipoIngreso;
    private String nombre;
    
    //CONSTRUCTOR SIN PARÁMETROS
    public TipoIngreso()
    {

    }

    //CONSTRUCTOR CON PARÁMETROS
    public TipoIngreso(String descripcionTipoIngreso, String nombre)
    {
        this.descripcionTipoIngreso = descripcionTipoIngreso;
        this.nombre = nombre;
    }

    /*------GETTERS------*/
    public String getDescripcion()
    {
        return this.descripcionTipoIngreso;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}
