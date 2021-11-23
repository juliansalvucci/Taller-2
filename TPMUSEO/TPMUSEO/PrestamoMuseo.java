package TPMUSEO;
import java.util.Date;

public class PrestamoMuseo
{

    private Date fechaDevolucion;
    private Date fechaPrestamo;
    private String responsableMuseo;
    private Integer tiempoPrestamo;

    public PrestamoMuseo()
    {

    }

    public PrestamoMuseo(Date fechaDevolucion, Date fechaPrestamo, String responsableMuseo, Integer tiempoPrestamo)
    {
        fechaDevolucion = this.fechaDevolucion;
        fechaPrestamo = this.fechaPrestamo;
        responsableMuseo = this.responsableMuseo;
        tiempoPrestamo = this.tiempoPrestamo;

    }

    public Integer getTiempoPrestamo()
    {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(Integer tiempoPrestamo) 
    {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getResponsableMuseo() 
    {
        return responsableMuseo;
    }

    public void setResponsableMuseo(String responsableMuseo) 
    {
        this.responsableMuseo = responsableMuseo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) 
    {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) 
    {
        this.fechaDevolucion = fechaDevolucion;
    }
 
}