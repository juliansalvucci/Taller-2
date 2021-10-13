import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EdadDelGregorianCalendar{
	public static void main(String[] args) {

		//Setear edad a CERO
		int edad=0; 

		//Fijamos la fechaActual con el calendario
		GregorianCalendar fechaActual= new GregorianCalendar();

		//Fijamos La fecha del nacimiento
		GregorianCalendar fechaNacimiento= new GregorianCalendar(1996, Calendar.JANUARY, 10);

		//Fijamos la fechaActual
		edad= fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);

		//Comprobamos que si el mes existe escrito (January = Enero)
		if(fechaActual.get(Calendar.MONTH)<fechaNacimiento.get(Calendar.MONTH)) {
			edad--;
		}else if(fechaActual.get(Calendar.MONTH)==fechaNacimiento.get(Calendar.MONTH)) {
			if(fechaActual.get(Calendar.DAY_OF_MONTH)<fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
				edad--;
			}
		}
		System.out.println("La Persona tiene una Edad de: "+edad);
	}
}