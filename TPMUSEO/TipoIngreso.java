package TPMUSEO;

public class TipoIngreso 
{
    private String descripcionTipoIngreso;
    private String nombre;

    public TipoIngreso(String descripcionTipoIngreso, String nombre)
    {
        this.descripcionTipoIngreso = descripcionTipoIngreso;
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return this.descripcionTipoIngreso;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setDescripcion(String descripcionTipoIngreso)
    {
        this.descripcionTipoIngreso = descripcionTipoIngreso;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
