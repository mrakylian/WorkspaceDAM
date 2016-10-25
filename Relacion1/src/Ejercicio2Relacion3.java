import java.util.Scanner;

/**
 * 2. Realizar un programa que solicite dos números,base y exponente, enteros
 * positivos (incluido el 0), y que calcule la potencia ( base elevado a
 * exponente) a través de productos. Si los datos son incorrectos deberán
 * volverse a solicitar.
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio2Relacion3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// VARIABLES

		int numeroBase, numeroExponente, contador, resultado;

		// INCIO

		// Este repetir mientras solicita la base y el exponente si los n�mero
		// introducidos son negativos o 0

		do {
			System.out.println("Introduce la base y el exponente");
			numeroBase = Integer.parseInt(teclado.nextLine());
			numeroExponente = Integer.parseInt(teclado.nextLine());
		}

		while (numeroBase < 0 || numeroExponente < 0);

		if (numeroBase == 0 && numeroExponente == 0) {
			System.out.println("0 es una indeterminacion, no sabe su resultado");

		} else {
			if (numeroBase == 0) {
				resultado = 0;
			} else {

				resultado = 1;

				for (contador = 1; contador <= numeroExponente; contador++) {
					resultado = resultado * numeroBase;

				}

			}
			System.out.println("La potencia de " + numeroBase + " elevado a " + numeroExponente + " es " + resultado);
		}

	}

}
