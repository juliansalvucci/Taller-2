package Fechas;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public static void main(String[] args) {
		Date today;
		SimpleDateFormat sdf;
		today = new Date();
		
		sdf= new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(sdf.format(today));
		
		sdf= new SimpleDateFormat("EEEE MMMM dd, yyyy");
		System.out.println(sdf.format(today));
		
		sdf= new SimpleDateFormat("hh:mm:ss a");
		System.out.println(sdf.format(today));
	}
}
