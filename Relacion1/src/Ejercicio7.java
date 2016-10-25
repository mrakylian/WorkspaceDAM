import java.util.Scanner;

/**
 * 7. Realizar un programa que lea el estado civil de una persona (S-Soltero,
 * C-Casado, V-Viudo y D-Divorciado) y su edad. Después debe mostrar por
 * pantalla el porcentaje de retención que debe aplicársele de acuerdo con las
 * siguientes reglas: 
 * • A los solteros o divorciados menores de 35 años, un 12%
 * • Todas las personas mayores de 50 años, un 8.5% 
 * • A los viudos o casados  menores de 35 años, un 11.3% 
 * • Al resto de casos se le aplica un 10.5%
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio7 {
	private static Scanner teclado = new Scanner(System.in);
	// CONSTANTES
	private static final int LIMITE_EDAD1 = 35;
	private static final int LIMITE_EDAD2 = 50;
	private static final double RETENCION1 = 12;
	private static final double RETENCION2 = 8.5;
	private static final double RETENCION3 = 11.3;
	private static final double RETENCION4 = 10.5;
	private static final double MAX_EDAD = 100;

	public static void main(String[] args) {

		// VARIABLES
		char estadoCivil;
		int edad;
		double retencion = 0;

		// INICIO
		
		System.out.println("Introduce tu edad");
		edad = teclado.nextLine().charAt(0);

		if (edad < 0 || edad > MAX_EDAD) {
			System.out.println("Error de formato, la edad introducida es incorrecta");
		} else {
			System.out
					.println("Introduce el estado civil  de una persona (S-Soltero, C-Casado, V-Viudo y D-Divorciado");
			estadoCivil = teclado.nextLine().charAt(0);

			if (!(estadoCivil == 'S' || estadoCivil == 'C' || estadoCivil == 'V' || estadoCivil == 'D')) {
				System.out.println("Error de formato, el carácter introducido es incorrecto");
			} else {
				if (estadoCivil > LIMITE_EDAD2) {
					retencion = RETENCION2;

				} else {

					if (estadoCivil > LIMITE_EDAD1) {
						retencion = RETENCION4;

					} else {
						if (estadoCivil == 'S' || estadoCivil == 'D') {
							retencion = RETENCION1;
						} else {
							retencion = RETENCION3;
						}
					}
				}
			}
			System.out.println("La retencion es " + retencion);

		}

	}

}
