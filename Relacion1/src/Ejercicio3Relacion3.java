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
		
		int numero, totalCifras, numeroActual;
		
		//INICIO
		System.out.println("Introduce un numero entero");
		numero = Integer.parseInt(teclado.nextLine());
		
		numeroActual = numero;
		totalCifras = 1;
		
		while ( numeroActual / 10 != 0) {
			numeroActual = numeroActual / 10;
			totalCifras ++;
		}
		
		System.out.println("El numero " + numero + " tiene " + totalCifras + " cifras.");
	}

}
