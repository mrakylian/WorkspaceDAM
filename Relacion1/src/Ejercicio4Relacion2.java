import java.util.Scanner;

/**
 * . Realizar un programa que lea un n�mero estrictamente positivo N y muestre
 * la suma de los N primeros n�meros. Dise�a el programa de forma que si N es
 * incorrecto vuelva a solicitarse. Ejemplo: Introduce un n�mero positivo: 4 La
 * suma de los 4 primeros n�meros es: 10
 * 
 * @author pgmy9
 *
 */
public class Ejercicio4Relacion2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int numero, suma, contador;
		// INICIO

		do {
			System.out.println("Introduce un n�mero positivo");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero <= 0);

		contador = 1;
		suma = 0;

		while (contador <= numero) {
			suma = suma + contador;
			contador++;
		}
		System.out.println("La suma de los " + numero + " primeros n�mero es: " + suma);
	}
}
