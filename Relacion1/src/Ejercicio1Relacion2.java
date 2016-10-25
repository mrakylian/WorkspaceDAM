import java.util.Scanner;
/**
 *  Realizar un programa que muestre por pantalla todos los n�meros comprendidos
entre 1 y 100 que son m�ltiplos de 7 o de 13. Debe mostrar un mensaje indicando si
el n�mero es m�ltipo de 7 o de 13. Si el n�mero es m�ltiplo de 7 y de 13 a la vez,
deben aparecer dos mensajes.
 * @author pgmy9
 *
 */
public class Ejercicio1Relacion2 {
	
	private static Scanner teclado = new Scanner(System.in);
	//CONSTANTES
	private static final int VALOR_INICIAL = 1;
	private static final int VALOR_FINAL = 100;
	private static final int NUM_CLAVE1 = 7;
	private static final int NUM_CLAVE2 = 13;
	
	public static void main(String[] args) {
		
		//VARIABLES
		
		int contador;
		
		//INICIO
		
		contador = VALOR_INICIAL;
		
		while (contador <= VALOR_FINAL) {
			
			if (contador % NUM_CLAVE1 == 0) {
			System.out.println(contador + " es m�ltiplo de " + NUM_CLAVE1);
			}
			
			if (contador % NUM_CLAVE2 == 0) {
				System.out.println(contador + " es m�ltiplo de " + NUM_CLAVE2);
			}
			contador ++;
		}

	}

}
