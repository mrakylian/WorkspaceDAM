
/*
 * PROGRAMA 1. Realizar un programa que lea un número entero por teclado e informe de si el número es
par o impar (el cero se considera par).
 *AUTOR: PABLO GARCÍA MOYA
 */
import java.util.Scanner;

public class Ejercicio1 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int numero;
		// INICIO
		System.out.println("Introduce un número: ");
		numero = Integer.parseInt(teclado.nextLine());
		
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}
}
