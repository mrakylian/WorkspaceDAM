import java.util.Scanner;
/**
 * Realizar un programa que lea por teclado dos marcaciones de un reloj digital (horas,
minutos, segundos) comprendidas entre las 0:0:0 y las 23:59:59 e informe de cual de ellas
es mayor.
Ejemplo:
â€¢
Hora 1: 12:35:37
â€¢
Hora 2: 12:38:36
â€¢
â€œHora 2 es mayorâ€�
 * @author alumnodiurno
 *
 */
public class Ejercicio8 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		int hora1, hora2, minuto1, minuto2, segundo1, segundo2;
		//INICIO
			
			do {
				System.out.println("Introduce la primera marcanción horaria");
				hora1 = Integer.parseInt(teclado.nextLine());
				minuto1 = Integer.parseInt(teclado.nextLine());
				segundo1 = Integer.parseInt(teclado.nextLine());
				
			}
			
			 while (hora1 < 0 || hora1 > 23 || minuto1 < 0 || minuto1 > 59 || segundo1 < 0 || segundo1 > 59 );
				
	}

}
