import java.util.Scanner;

/**
 * Realizar un programa que solicite un carácter por teclado e informe por
 * pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
 * mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc. Opción
 * con SI: No es factible porque generaría demasiados niveles de anidamiento en
 * los SI Opción con SEGUN_VALOR:
 * 
 * @author Pablo García Moya
 *
 */
public class Ejercicio6 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		char letra;
		System.out.println("Introduzca una letra mayúscula");
		letra = teclado.nextLine().charAt(0);

		switch (letra) {
		case 'A': {
			System.out.println("Es la primera vocal (A)");
			break;
		}

		case 'E': {
			System.out.println("Es la segunda vocal (E)");
			break;
		}
		case 'I': {
			System.out.println("Es la tercera vocal (I)");
			break;
		}
		case 'O': {
			System.out.println("Es la cuarta vocal (O)");
			break;
		}
		case 'U': {
			System.out.println("Es la quinta vocal (U)");

			break;
		}
		default: {
			System.out.println("No es una vocal mayúscula");
		}
		
		}
	}
}

//letras = teclado.nextLine().toUpperCase().charAt(0);   Esta instrución tranforma las mayusculas en minusculas