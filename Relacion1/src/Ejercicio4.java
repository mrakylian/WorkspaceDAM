
/*
 * Realizar un programa que lea la edad de una persona menor a 100 años e informe de si es
un niño (0-12 años), un adolescente (13-17), un joven (18-29) o un adulto.
 */
import java.util.Scanner;

public class Ejercicio4 {
	private static Scanner teclado = new Scanner(System.in);
	// CONSTANTES
	private static final int EDAD_NINO = 12;
	private static final int EDAD_ADOLESCENTE = 17;
	private static final int EDAD_JOVEN = 29;
	private static final int EDAD_MAX = 100;

	public static void main(String[] args) {
		// VARIABLES
		int edad;
		// INICIO
		System.out.println("Introduce tu edad");
		edad = Integer.parseInt(teclado.nextLine());
		if (edad < 0 || edad > EDAD_MAX) {
			System.out.println("Error de formato, la edad introducida es incorrecta");
		} else {
			if (edad <= EDAD_NINO) {
				System.out.println("Es un niño");
			} else {
				if (edad <= EDAD_ADOLESCENTE) {
					System.out.println("Es un adolescente");
				} else {
					if (edad <= EDAD_JOVEN) {
						System.out.println("Es un joven");
					} else {
						System.out.println("Es un adulto");
					}
				}

			}
		}
	}

}
