import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String args){
        Date today;
        today = new Date(0);
        System.out.println(today.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(today));

        GregorianCalendar ahora = new GregorianCalendar(1816, Calendar.JULY, 9);
       
        

        System.out.println(ahora.get(Calendar.AM_PM)); //Calendar.AM == 0, con las constantes se puede documentar mejor el código.
        System.out.println(ahora.get(Calendar.DAY_OF_MONTH));
        
        ahora.set(2020, Calendar.FEBRUARY, 10);

        System.out.println(ahora.get(Calendar.DAY_OF_MONTH));

        ahora.set(2020, Calendar.FEBRUARY, 30);

        System.out.println(ahora.get(Calendar.DAY_OF_MONTH));

        //SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");


    }
    
}
