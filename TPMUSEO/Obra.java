package TPMUSEO;

import java.util.Date;

public class Obra 
{
    private double alto;
    private double ancho;
    private String codigoSensor;
    private String descripcionObra;
    private int duracionExtendida;
    private int duracionResumida;
    private Date fechaCreacion;
    private Date fechaPrimerIngreso;
    private String nombreObra;
    private double peso;
    private double valuacion;


    //PUNTERO
    private TipoIngreso tipoIngreso;

    private List<PrestamoMuseo> prestamoMuseo = new LinkedList<>;


    //CONSTRUCTOR SIN PARÁMETROS
    public Obra()
    {

    }
    
    //CONSTRUCTOR CON PARÁMETROS
    public Obra(double alto, double ancho, String codigoSensor, String descripcionObra, int duracionExtendida, int duracionResumida, Date fechaCreacion, Date fechaPrimerIngreso, String nombreObra, double peso, double valuacion, TipoIngreso tipoIngreso)
    {
        this.setAlto(alto);
        this.setAncho(ancho);
        this.setCodigoSensor(codigoSensor);
        this.setDescripcionObra(descripcionObra);
        this.setDuracionExtendida(duracionExtendida);
        this.setDuracionResumida(duracionResumida);
        this.setFechaCreacion(fechaCreacion);
        this.setFechaPrimerIngreso(fechaPrimerIngreso);
        this.setNombreObra(nombreObra);
        this.setPeso(peso);
        this.setValuacion(valuacion);
        this.setTipoIngreso(tipoIngreso);
    }

    /*------GETTERS Y SETTERS------*/

    public TipoIngreso getTipoIngreso() 
    {
        return tipoIngreso;
    }


    public void setTipoIngreso(TipoIngreso tipoIngreso) 
    {
        this.tipoIngreso = tipoIngreso;
    }


    public double getValuacion() {
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


    public Date getFechaPrimerIngreso() 
    {
        return fechaPrimerIngreso;
    }


    public void setFechaPrimerIngreso(Date fechaPrimerIngreso) 
    {
        this.fechaPrimerIngreso = fechaPrimerIngreso;
    }


    public Date getFechaCreacion() 
    {
        return fechaCreacion;
    }


    public void setFechaCreacion(Date fechaCreacion) 
    {
        this.fechaCreacion = fechaCreacion;
    }


    public int getDuracionResumida() 
    {
        return duracionResumida;
    }


    public void setDuracionResumida(int duracionResumida) 
    {
        this.duracionResumida = duracionResumida;
    }


    public int getDuracionExtendida() 
    {
        return duracionExtendida;
    }


    public void setDuracionExtendida(int duracionExtendida) 
    {
        this.duracionExtendida = duracionExtendida;
    }


    public double getAncho() 
    {
        return ancho;
    }


    public void setAncho(double ancho) 
    {
        this.ancho = ancho;
    }


    public String getDescripcionObra() 
    {
        return descripcionObra;
    }


    public void setDescripcionObra(String descripcionObra) 
    {
        this.descripcionObra = descripcionObra;
    }


    public String getCodigoSensor() 
    {
        return codigoSensor;
    }


    public void setCodigoSensor(String codigoSensor) 
    {
        this.codigoSensor = codigoSensor;
    }


    public double getAlto() 
    {
        return alto;
    }


    public void setAlto(double alto) 
    {
        this.alto = alto;
    }

   
}
