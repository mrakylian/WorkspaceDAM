import java.util.Scanner;

public class Ejercicio1Relacion3 {
	
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//VARIBLES
		int num1, num2, num3, aux;
		//INICIO
		System.out.println("Introduce tres números");
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		num3 = Integer.parseInt(teclado.nextLine());
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		System.out.println(num1 + " < " + num2 + " < " + num3);
	}

}
