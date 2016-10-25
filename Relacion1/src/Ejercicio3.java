
/*
 * Realizar un programa que lea un número por teclado. El programa debe imprimir en
pantalla un mensaje con “El número xx es múltiplo de 2” o un mensaje con “El número xx
es múltiplo de 3”. Si es múltiplo de 2 y de 3 deben aparecer los dos mensajes. Si no es
múltiplo de ninguno de los dos el programa finaliza sin mostrar ningún mensaje.
 */
import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int numero;
		System.out.println("Introduce un número");
		numero = Integer.parseInt(teclado.nextLine());

		if (numero % 2 == 0) {
			System.out.println("El " + numero + " es múltiplo de 2");
		}

		if (numero % 3 == 0) {
			System.out.println("El " + numero + " es múltiplo de 3");
		}

	}

}
