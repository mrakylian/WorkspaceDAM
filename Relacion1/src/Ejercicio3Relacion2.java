import java.util.Scanner;
/**
 * 3. Realizar un programa que solicite una cantidad de n�meros que van a introducirse
por teclado. Despu�s, para cada uno de ellos que indique si el n�mero es par o
impar. Si la cantidad de n�meros introducida es 0 o negativa volver� a solicitarse el
dato.
 * @author pgmy9
 *
 */
public class Ejercicio3Relacion2 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		int numero;
		//INICIO
		
		do {
			System.out.println("Introduce un n�mero");
			numero = Integer.parseInt(teclado.nextLine());
		}
		while (numero <= 0);
		
		if (numero % 2 == 0) {
			System.out.println("El n�mero es par");
		} else {
			System.out.println("El n�mero es impar");
		}
	}

}
