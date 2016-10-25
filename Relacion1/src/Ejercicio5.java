
/*
 * Realizar un programa que solicite 4 números e imprima la media de los números. También
debe imprimir aquellos números que son superiores a la media.
 */
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner teclado = new Scanner(System.in);
	// CONSTANTES
	private static final int CANTIDAD = 4;

	public static void main(String[] args) {

		// VARIABLES
		int numero1, numero2, numero3, numero4, media;
		// INICIO
		System.out.println("Introduce 4 números.");

		numero1 = Integer.parseInt(teclado.nextLine());
		numero2 = Integer.parseInt(teclado.nextLine());
		numero3 = Integer.parseInt(teclado.nextLine());
		numero4 = Integer.parseInt(teclado.nextLine());

		media = ((numero1 + numero2 + numero3 + numero4) / CANTIDAD);
		System.out.println("La media es " + media);

		if (media < numero1) {
			System.out.println("El número, " + numero1 + " , es mayor a la media");
		}

		if (media < numero2) {
			System.out.println("El número, " + numero2 + " , es mayor a la media");
		}

		if (media < numero3) {
			System.out.println("El número, " + numero3 + " , es mayor a la media");
		}

		if (media < numero4) {
			System.out.println("El número, " + numero4 + " , es mayor a la media");
		}
	}

}
