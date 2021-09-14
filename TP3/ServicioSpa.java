package TP3;

public class ServicioSpa 
{
    private String descripcion;
    private double precio;

    //CONSTRUCTOR SIN PARÁMETROS.
    public ServicioSpa()
    {
       this.descripcion = "";
       this.precio = 0;
    }

    //CONSTRUCTOR CON PARÁMETROS.
    public ServicioSpa(String descripcion, double precio)
    {
       this.descripcion = descripcion;
       this.precio = precio;
    }
   
    //SETTERS.
    public void setDescripcion(String d)
    {
        this.descripcion = d;
    }
    public void setPrecio(double p)
    {
        this.precio = p;
    }

    //GETTERS.
    public String getDescripcion()
    {
        return this.descripcion;
    }
    public double getPrecio()
    {
        return this.precio;
    }
}
