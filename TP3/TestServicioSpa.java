package TP3;

public class TestServicioSpa 
{
    public static void main(String[] args)
    {
        ServicioSpa s1=new ServicioSpa("facial",150.20);
        ServicioSpa s2=new ServicioSpa("masajes",340.00);
       
        System.out.println("Primer servicio: ");
        System.out.println(s1.getDescripcion() + " $ "+ s1.getPrecio());
        System.out.println("Segundo servicio: ");
        System.out.println(s2.getDescripcion() + " $ "+ s2.getPrecio());
    }
}
