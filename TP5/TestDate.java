import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {

		Date hoy;
		SimpleDateFormat sdf;
		hoy= new Date();
		
		sdf= new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("\nLa fecha Actual en el primer formato: "+sdf.format(hoy));
		
		sdf= new SimpleDateFormat("EEEE MMMM dd, yyyy");
		System.out.println("\nLa fecha Actual en otro formato: "+sdf.format(hoy));
		
		sdf= new SimpleDateFormat("hh:mm:ss a");
		System.out.println("\nLa hora Actual es: "+sdf.format(hoy));
	}
}
		