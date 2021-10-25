package TPMUSEO;


public class Obra 
{
    private int alto;
    private int ancho;
    private int codigoSensor;
    private String descripcionObra;
    private Double duracion;
    private String nombreObra;
    private double peso;
    private double valuacion;


    //PUNTERO
    private TipoIngreso tipoIngreso;


    //CONSTRUCTOR SIN PARÁMETROS
    public Obra()
    {

    }

    //CONSTRUCTOR CON PARÁMETROS
    public Obra(int alto, int ancho, int codigoSensor, String descripcionObra, Double duracion, String nombreObra, double peso, double valuacion)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.codigoSensor = codigoSensor;
        this.descripcionObra = descripcionObra;
        this.duracion = duracion;
        this.nombreObra = nombreObra;
        this.peso = peso;
        this.valuacion = valuacion;
    }

    /*------GETTERS------*/

    public TipoIngreso getTipoIngreso() 
    {
        return tipoIngreso;
    }

    public double getValuacion()
    {
        return valuacion;
    }

    public double getPeso() 
    {
        return peso;
    }

    public String getNombreObra() 
    {
        return nombreObra;
    }

    public String getDescripcionObra() 
    {
        return descripcionObra;
    }

    public Double getDuracion()
    {
        return duracion;
    }

    public int getCodigoSensor() 
    {
        return codigoSensor;
    }

    public int getAncho() 
    {
        return ancho;
    }

    public int getAlto() 
    {
        return alto;
    }

}
