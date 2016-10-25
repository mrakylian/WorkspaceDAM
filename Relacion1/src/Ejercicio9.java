import java.util.Scanner;

/**
 * 9. En un establecimiento en rebajas, hay 3 tipos de producto (A, B y C). El
 * porcentaje de rebaja que se aplicará sobre el precio original del producto se
 * calcula de la siguiente forma: 
 * 
 * • Si el producto es de tipo A,
 * independientemente de su precio se aplica un 7% de descuento. 
 * 
 * •Si el producto es de tipo C o bien el precio es inferior a 500 euros se aplicará un
 * porcentaje del 12 % de descuento. 
 * 
 * • En el resto de casos se aplica un 9 % de
 * descuento. 
 * 
 * Realizar un programa que solicite los datos necesarios (tipo de
 * producto y precio original) y calcule el precio rebajado. Debe comprobarse
 * que los datos de entrada son correctos, y si no lo son mostrar un mensaje de
 * error.
 * 
 * @author pgmy9
 *
 */
public class Ejercicio9 {

	private static Scanner teclado = new Scanner(System.in);

	// CONSTANTES

	private static final double REBAJA1 = 0.07;
	private static final double REBAJA2 = 0.12;
	private static final double REBAJA3 = 0.09;
	private static final int LIMITE_PRECIO = 500;

	public static void main(String[] args) {

		// VARIABLES

		char tipoProducto;
		double precio, precioRebajado;
		double descuento;

		// INICIO

		do {
			System.out.println("Introduce el tipo de producto seleccionado ('A', 'B' o 'C')");
			tipoProducto = teclado.nextLine().toUpperCase().charAt(0);

		} while (!(tipoProducto == 'A' || tipoProducto == 'B' || tipoProducto == 'C'));

		do {
			System.out.println("Introduce el precio original del producto");
			precio = Integer.parseInt(teclado.nextLine());
			
		} while (precio < 0);
		
		if (tipoProducto == 'A') {
			descuento = REBAJA1;
		} else {
			if (tipoProducto == 'C' || precio < LIMITE_PRECIO) {
				descuento = REBAJA2;
			} else {
				descuento = REBAJA3;
			}
		}
		
		precioRebajado = precio - precio * descuento;
		
		System.out.println("El precio original era " + precio + " y el rebajado es " + precioRebajado);
	}

}
