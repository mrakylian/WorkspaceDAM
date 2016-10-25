import java.util.Scanner;

/**
 * Realizar un programa que lea un número entero entre 0 y 10 y visualice su
 * tabla de multiplicar.
 * 
 * @author alumnodiurno
 *
 */
public class Ejercicio2Relacion2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		// VARIABLES
		
		int numero, contador, resultado;
		
		// INICIO
		
		do {
			System.out.println("Introduce un número");
			numero = Integer.parseInt(teclado.nextLine());
		}
			while (numero < 1 || numero > 10);
		
		contador = 0;

		while (contador <= 10) {
			
			resultado = numero*contador;
			
			System.out.println(numero + " x " + contador + " = " + resultado);
			contador++;
		}

	}

}
