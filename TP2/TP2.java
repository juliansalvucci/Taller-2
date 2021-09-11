import java.util.Scanner;

public class TP2 {
    public static void main (String[] args){

        //PUNTO 1
        System.out.println("Ingreser duración: ");
        Scanner entrada = new Scanner(System.in);  
        int minutos = entrada.nextInt();  //Ingresar valor en minutos.

        double d=minutos/60/24; //Obtener. 
        int a=(int)d/365; //Obtener la cantidad de años.
		d= d%365;
		System.out.println("La cantidad de años es: "+ a + " y la cant de dias es: " + d);
        

        //PUNTO 2
        String salida="";  //Variable string para mostrar la salida

        System.out.println("Ingresar numero");
        Scanner entrada1 = new Scanner(System.in);
		int secuenciaOriginal = entrada1.nextInt();  //Ingresar valor.
		int secuencia=secuenciaOriginal; //Guardar en variable auxiliar.
		int secuenciaAnt; 
		while(secuencia/10>0)
        {
		    secuenciaAnt=secuencia; //secuenciaAnt guarda la secuencia original
		    secuencia= secuencia/10; //se va dividiendo la secuencia en unidades
		    salida= (secuenciaAnt-(secuencia*10))+ " " + salida; //Se concatena la saiida con espacios entre dígitos.
		}
		salida= secuencia +" "+ salida;
	    System.out.println("La salida es:" + salida);
        


        //PUNTO 3
        System.out.println("Ingreser valor 1: ");
        Scanner entrada2 = new Scanner(System.in); //Ingresar el primer valor.
        float valor1 = entrada.nextFloat();

        System.out.println("Ingreser valor 2: ");
        Scanner entrada3 = new Scanner(System.in); //Ingresar el segundo valor.
        float valor2 = entrada.nextFloat();

        System.out.println("Suma: " + (valor1 + valor2));  //sumar.
        System.out.println("Resta: " + (valor1 - valor2));  //restar.
        System.out.println("Producto: " + (valor1 * valor2));  //multiplicar.
        System.out.println("Promedio: " + (valor1 + valor2)/2 ); //promediar.
        
        if(valor1>valor2)  //Obtener el valor máximo y el valor mínimo.
        {
		    System.out.println("Maximo: " + valor1);
		    System.out.println("Minimo: " + valor2);
		}
        else
        {
		    System.out.println("Maximo: " + valor2);
		    System.out.println("Maximo: " + valor1);
		}   
    }
}