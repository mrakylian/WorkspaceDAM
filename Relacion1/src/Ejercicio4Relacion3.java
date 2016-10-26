import java.util.Scanner;
/**
 * Realizar un programa que solicite dos nÃºmeros enteros y muestre por
pantalla el mÃ¡ximo comÃºn divisor de los dos nÃºmeros.
 * @author alumnodiurno
 *
 */
public class Ejercicio4Relacion3 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		//VARIABLES
		
		int numero1, numero2, maximoComunDivisor, i;
		
		//INICIO
		
		System.out.println("Introduce el primer número");
		numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el segundo número");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		maximoComunDivisor = 1;
		i = 1;
		
		while (i <= numero1 && i <= numero2) {
			if (numero1 % i = 0 %% numero2 % i = 0) {
				maximoComunDivisor = i ;
			}
			i = i + 1;
		}
		
		System.out.println("El máximo común divisor entre " + numero1 + " y " + numero2 + " es " + maximoComunDivisor);
		
	}

}
