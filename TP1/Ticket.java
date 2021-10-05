package TP1;

import java.util.Scanner;

class Ticket{
    public static void main(String args[]){

        //Ingresar N°de ticket
        System.out.println("Ingrese el numero de ticket: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        //Extraer el último dígito.
        int ultimoDigito = numero % 10;
        System.out.println("El ultimo digito del ticket es: " + ultimoDigito);

        //Obtener el número sin la última cifra.
        int numeroSinCifra = (numero / 10);
        System.out.println("La cifra verificadora del ticket es: " + ultimoDigito);

        //Determinar cifra verificadora.
        int division = numeroSinCifra % 7;
        System.out.println(numero + " ===> " + (division == ultimoDigito));
    }
}