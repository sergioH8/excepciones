package tasreaExcepciones;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

			compruebaNumero();
	}

	public static void compruebaNumero() {
		LinkedList<Integer> numbers = new LinkedList<>();
		int age = 0;
		
		while (age == 0) {
			try {
				Scanner sc2 = new Scanner(System.in);

				System.out.println("Introduce un numero:");

				int inputNumero = sc2.nextInt();
				if (inputNumero < 0) {
					throw new IllegalArgumentException();
				}
				System.out.println("El numero es : " + inputNumero);
				numbers.add(inputNumero);
				System.out.println("La lista de numeros son : " + numbers);
			} catch (IllegalArgumentException e2) {
				System.out.println("Debe de ser un numero negativo");

			} catch (InputMismatchException e1) {
				System.out.println("Debe ser un número entero");

			}

		}

	}
}
