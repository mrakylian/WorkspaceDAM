import java.util.Scanner;

public class prueba {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//VARIABLES
		int num1, num2, num3;
		//INICIO
		System.out.println("Introduce el 1º número");
		num1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el 2º número");
		num2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el 3º número");
		num3 = Integer.parseInt(teclado.nextLine());
		
		if (num1 > num2) {
			if (num1 < num3) {
				System.out.println(num2 + num1 + num3);
			}else {
				if (num2 > num3) {
					System.out.println(num3 + num2 + num1);
				}else {
					System.out.println(num2 + num3 + num1);
				}
			}
		} else {
			if (num3 > num2) {
				System.out.println(num1 + num2 + num3);
			} else {
				if (num3) {
					
				}
			}
		}

	}

}
