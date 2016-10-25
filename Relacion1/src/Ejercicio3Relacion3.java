import java.util.Scanner;
/**
 * Realizar un programa que solicite un número entero y determine el número
de cifras que tiene dicho número. 
Ejemplo:
Introduce un número: 124
El número 124 tiene 3 cifras
 * @author alumnodiurno
 *
 */
public class Ejercicio3Relacion3 {
	
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		//VARIABLES
		
		//Declaramos la variables
		
		int numero, totalCifras, numeroActual;
		
		//INICIO
		
		//Solicitamos por pantalla el numero
		
		System.out.println("Introduce un numero entero");
		
		//Leemos el numero
		
		numero = Integer.parseInt(teclado.nextLine());
		
		//Declaramos las variables
		
		numeroActual = numero;
		totalCifras = 1;
		
		//Mientras numeroActual entre 10 sea distinto de 0
		
		while ( numeroActual / 10 != 0) {
			
		//Si numeroActual es igual el numero actual entre 10
			
			numeroActual = numeroActual / 10;
			
		//Se incrementa el contador en 1	
			
			totalCifras ++;
		}
		
		//Se muestra el resultado
		
		System.out.println("El numero " + numero + " tiene " + totalCifras + " cifras.");
	}

}
