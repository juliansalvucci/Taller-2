import java.util.Scanner;

public class TP2 {
    public static void main (String[] args){

        System.out.println("Ingreser duración: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        int anio = numero / 525600;
        int dias = anio % 365;

        System.out.println("Días: " + dias + " Año: " + anio);

        System.out.println("Ingreser número de 6 dígitos: ");
        Scanner entrada1 = new Scanner(System.in);
        String numero1 = entrada.nextLine();

        if(numero1.length() == 6)
        {
            int num1 = Integer.parseInt(numero1);

            int a;
            int b = 100000;
            for (int i = 0 ; i < 6 ;  i++)
            {

                a = num1 / b ;
                System.out.print(a + " ");
                num1 = num1 - (a * b);
                b = b / 10;

            }
            
            System.out.print("");

            

        }
        else
        {
            System.out.println("Por favor ingresa un valor de 6 digitos :)");
        }

        System.out.println("Ingreser duración: ");
        Scanner entrada2 = new Scanner(System.in);
        float valor1 = entrada.nextFloat();

        System.out.println("Ingreser duración: ");
        Scanner entrada3 = new Scanner(System.in);
        float valor2 = entrada.nextFloat();

        System.out.println("Suma: " + (valor1 + valor2));
        System.out.println("Resta: " + (valor1 - valor2));
        System.out.println("Producto: " + (valor1 * valor2));
        System.out.println("Promedio: " + (valor1 + valor2)/2 );
        //FALTA MAX Y MIN


        
    }

}