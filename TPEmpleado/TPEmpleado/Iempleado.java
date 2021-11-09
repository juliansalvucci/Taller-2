package TPEmpleado;

import javax.swing.JOptionPane;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Comparator;

public class Iempleado 
{
    public static void main(String[] args)
    {
        ArrayList<Empleado> empleados = new ArrayList<>(5);

        for(int i = 0; i < 5; i++)
        {
            Empleado e = new Empleado();
            e.setNombre(JOptionPane.showInputDialog("Ingrese nombre de empleado" + (i + 1)));
            e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad" + (i + 1))));

            empleados.add(e);

        }

        System.out.print("Listado de empleados: "); //Listado en orden de ingreso.

        for(Empleado e: empleados)
        {
            System.out.println(e.getNombre());
        }

        //Collection.sort(empleados);
        System.out.println("" + "Listado de empleados: " );

        for (Empleado e: empleados)
        {
            System.out.println(e.getNombre());
        }

        Collections.sort(empleados, Collections.reverseOrder());
        System.out.println("" + "Listado de empleados"); //Lista invertida

        for (Empleado e: empleados)
        {
            System.out.println(e.getNombre());
        }
    }
}
