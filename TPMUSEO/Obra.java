package TPMUSEO;

import java.time.LocalTime;

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

    public Obra(int alto, int ancho, int codigoSensor, String descripcion, String nombreObra, double peso, double valuacion, String descripcion, String nombre)
    {
        this.alto = alto;
        this.ancho = ancho;
        this.codigoSensor = codigoSensor;
        this.descripcion = descripcion;
        this.nombreObra = nombreObra;
        this.peso = peso;
        this.valuacion = valuacion;

        tipoIngreso = new TipoIngreso(nombre, descripcion);
    }
}
