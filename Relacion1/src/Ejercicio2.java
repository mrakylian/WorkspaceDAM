
/*
 * 2. Realizar un programa que solicite dos números por teclado e imprima en pantalla si son
iguales, el primero mayor que el segundo o el primero más pequeño que el segundo.
 *AUTOR: PABLO GARCÍA MOYA
 */
import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int numero1, numero2;
		// INICIO
		System.out.println("Introduce dos números");
		numero1 = Integer.parseInt(teclado.nextLine());
		numero2 = Integer.parseInt(teclado.nextLine());

		if (numero1 == numero2) {
			System.out.println("Los números son iguales");
		} else {
			if (numero1 > numero2) {
				System.out.println("El número 1 es mayor que el número 2");
			} else {
				System.out.println("El número 2 es mayor que el número 1");
			}
		}

	}

}
