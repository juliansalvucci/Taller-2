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
        this.setDescripcionTipoIngreso(descripcionTipoIngreso);
        this.setNombre(nombre);
    }

    /*------GETTERS Y SETTERS------*/

    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDescripcionTipoIngreso() 
    {
        return descripcionTipoIngreso;
    }

    public void setDescripcionTipoIngreso(String descripcionTipoIngreso) 
    {
        this.descripcionTipoIngreso = descripcionTipoIngreso;
    }
    
}
