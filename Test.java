import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String args){
        Date today;
        today = new Date(0);
        System.out.println(today.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(today));
    }
    
}
