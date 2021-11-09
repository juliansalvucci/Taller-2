package TPEmpleado;

public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Empleado o) 
    {
        if(o instanceof Empleado)
        {
            Empleado s = (Empleado)o;
            return (this.nombre.compareTo(s.nombre));
        }
        else
        {
            return -1;
        }  
    }   
}
