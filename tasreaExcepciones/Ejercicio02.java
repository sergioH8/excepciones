package tasreaExcepciones;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		NumberDivision.convertirString();

	}

	public class NumberDivision {

		public static void convertirString() {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("Introduce el primer número:");
				String numeroComoTexto1 = sc.next();
				System.out.println("Introduce el segundo número:");
				String numeroComoTexto2 = sc.next();
				int numero1 = Integer.parseInt(numeroComoTexto1);
				int numero2 = Integer.parseInt(numeroComoTexto2);

				System.out.println("El número como entero de la division de String es : " + numero1 / numero2);
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir entre 0. Inténtalo de nuevo.");
			} catch (NumberFormatException e) {
				System.out.println("Error: La cadena no puede ser convertida a un número entero.");
			}
		}
	}
}
