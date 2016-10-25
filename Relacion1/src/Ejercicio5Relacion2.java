import java.util.Scanner;
/**
 * 5. Realizar un programa que solicite n�meros hasta que se introduzca un n�mero
negativo. Cuando termine informar� de cuantos n�meros positivos se han
introducido. En este programa el n�mero 0 se considera positivo.
Ejemplo:
Introduce un n�mero (negativo para terminar): 4
Introduce un n�mero (negativo para terminar): 8
Introduce un n�mero (negativo para terminar): -2
Has introducido 2 n�meros positivos

 * @author pgmy9
 *
 */
public class Ejercicio5Relacion2 {

	//CONSTANTES
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		//VARIABLES
		
		int numero, cantidadPositivos;
		
		//INCIO
		
		//Iniciamos la variable cantidadPositivos en 0
		
		cantidadPositivos = 0;
		
		//Utilizaremos un bucle do/while para introducir n n�meros
		
		do {
			System.out.println("Introduce un número (negativo para terminar)");
			numero = Integer.parseInt(teclado.nextLine());
			
			//Esta instrucci�n incrementa el n�mero total de n�mero introducidos
			
			cantidadPositivos = cantidadPositivos +1;
			
		}
		
		//La condici�n se cumplir� mientras el n�mero que hayamos introducido sea mayor o igual a LIMITE_FIN 
		
		while (numero >= 0);
		
		//Esta instrucci�n la utilizaremos para que el bucle no cuente el n�mero negativo que hemos introducido para terminarlo
		
		cantidadPositivos = cantidadPositivos - 1;
		
		System.out.println("Has introducido " + cantidadPositivos + " números positivos");
	}

}
