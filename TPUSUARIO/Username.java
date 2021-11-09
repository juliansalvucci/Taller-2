import java.util.Scanner;

public class Username
{
	public static void main(String[] args) 
	{
		String nombre, apellido, edad, user, contraseña;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		nombre = input.nextLine();

		System.out.println("Ingresa tu apellido: ");
		apellido = input.nextLine();

		System.out.println("Ingresa tu edad: ");
		edad = input.nextLine();
		
		user= (nombre.substring(0,1)).toUpperCase();
		user+=apellido.toLowerCase();
		
		contraseña=nombre.toLowerCase();
		contraseña+=(apellido.substring(0,3)).toUpperCase();
		contraseña+=edad; 
		
		System.out.println("Tu usuario es: "+user);
		System.out.println("Tu contraseña es: "+ contraseña);
	}
}