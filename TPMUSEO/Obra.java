package TPMUSEO;


public class Obra 
{
    private int alto;
    private int ancho;
    private int codigoSensor;
    private String descripcion;
    private String nombreObra;
    private double peso;
    private double valuacion;

    private TipoIngreso tipoIngreso;

    public Obra(int alto, int ancho, int codigoSensor, String descripcion, String nombreObra, double peso, double valuacion, String descripcionTipoObra, String nombre)
    {
        this.setAlto(alto);
        this.setAncho(ancho);
        this.setCodigoSensor(codigoSensor);
        this.setDescripcion(descripcion);
        this.setNombreObra(nombreObra);
        this.setPeso(peso);
        this.setValuacion(valuacion);

        setTipoIngreso(new TipoIngreso(nombre, descripcionTipoObra));
    }

    /*GETTERS Y SETTERS*/

    public TipoIngreso getTipoIngreso() 
    {
        return tipoIngreso;
    }

    public void setTipoIngreso(TipoIngreso tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public double getValuacion()
    {
        return valuacion;
    }

    public void setValuacion(double valuacion) 
    {
        this.valuacion = valuacion;
    }

    public double getPeso() 
    {
        return peso;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public String getNombreObra() 
    {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) 
    {
        this.nombreObra = nombreObra;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public int getCodigoSensor() 
    {
        return codigoSensor;
    }

    public void setCodigoSensor(int codigoSensor) 
    {
        this.codigoSensor = codigoSensor;
    }

    public int getAncho() 
    {
        return ancho;
    }

    public void setAncho(int ancho) 
    {
        this.ancho = ancho;
    }

    public int getAlto() 
    {
        return alto;
    }

    public void setAlto(int alto) 
    {
        this.alto = alto;
    }
}
