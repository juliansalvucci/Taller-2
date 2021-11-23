package Exceps;

import java.util.Scanner;

public class EjemploExcepciones 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numerador, denominador,resultado;

        numerador = input.nextInt();

        denominador = input.nextInt();


        /* Tratamiento preventivo
        if(denominador == 0)
        {
            System.out.println("NO SE PUEDE DIVIDIR POR 0");
        } 
        else 
        {
            resultado = numerador / denominador;
            System.out.println(resultado);
        }
        */

        //manejo reactivo
        try 
        {
            //resultador = numerador / denominador
            resultado = dividir(numerador, denominador);
            System.out.println(resultado);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Intento de división por 0");
        } 
        catch( Exception e) //Excepción general, deber ir al final
        { 
            System.out.println(e);
        }

        //Se ejecuta el bloque try hasta la línea dónde se produce la excepción.

        //puedo tener múltiples catchs
        
    }

    public static int dividir(int numerador, int denominador) throws ArithmeticException
    {
        return numerador / denominador;
    }
    
}
