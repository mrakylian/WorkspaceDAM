import java.util.Scanner;

/**
 * Realizar un programa que lea dos n�meros enteros cualesquiera numeroA y
 * numeroB, y calcule el producto de A y B mediante sumas, es decir, sin usar el
 * operador *.
 * 
 * @author Pablo Garc�a Moya
 *
 */
public class Ejercicio6Relacion2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// VARIABLES

		int numeroA, numeroB, contador, signo, producto, numeroVueltasBucle;

		// INICIO

		// Solicitamos los dos n�meros por pantalla

		System.out.println("Escribe dos n�meros");

		// Leemos los n�meros

		numeroA = Integer.parseInt(teclado.nextLine());
		numeroB = Integer.parseInt(teclado.nextLine());
		numeroVueltasBucle = numeroB;
		
		// Iniciamos la variable signo a 1

		signo = 1;

		// Iniciamos la condici�n if diciendo que si numeroA es menor que cero
		// entonces numeroA es igual a menos numeroA

		if (numeroA < 0) {
			numeroA = -numeroA;

			// Cambiarmos el valor de signo

			signo = -signo;
		}

		// Iniciamos la condici�n if diciendo que si numeroB es menor que cero
		// entonces numeroB es igual a menos numeroA

		if (numeroB < 0) {
			signo =signo * -1;

			// Cambiarmos el valor de signo

			signo = -signo;
		}

		// Iniciamos las variables contador y producto

		contador = 1;
		producto = 0;

		// El bucle while se cumplir� hasta que contador sea menor o igual al
		// n�meroB

		while (contador <= numeroVueltasBucle) {

			// Producto es igual a producto m�s n�meroA

			producto = producto + numeroA;

			// Incrementamos el contador (contador = contador +1)

			contador++;
		}

		// Producto es igual al producto multiplicado por el signo

		producto = producto * signo;

		// Mostramos por pantalla el resultado y finalizamos el programa

		System.out.println("El producto de " + numeroA + " X " + numeroB + " es: " + producto);
		System.out.println("FIN");
	}

}

/**
 * PANTALLA: MEMORIA: CONDICIONES: Introduce dos numeros numero //// contador
 * //// producto 2 < 0 --> NO 2 2 1 0 2 < 0 --> NO 2 1 0 2 contador <= 2 --> NO
 * El producto de 2 x 1 es: 2 producto = 1 * 2 FIN
 */
