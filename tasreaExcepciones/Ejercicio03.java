package tasreaExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {


		String nombreFinal = null;
		while (nombreFinal == null) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Introduce el nombre de la persona:");
			try {
				String inputNombre = sc1.nextLine();
				nombreFinal = compruebaNombre(inputNombre);
			} catch (IllegalArgumentException e) {
				System.out.println("El nombre no puede contener dígitos.");
			}
		}

		int age = 0;
		while (age == 0) {
			Scanner sc2 = new Scanner(System.in);
			try {
				System.out.println("Introduce su edad:");

				int inputEdad = sc2.nextInt();
				age = compruebaEdad(inputEdad);
			} catch (IllegalArgumentException e2) {
				System.out.println("La edad debe de ser un numero negativo");
				
			} catch (InputMismatchException e1) {
				System.out.println("La edad debe ser un número entero");
			
				
			}
		}
		imprimeDatos(nombreFinal, age, compruebaCategoria(age));
	}

	

	public static void imprimeDatos(String nombre, int edad, char categoria) {

		System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Usuario " + nombre + " de Categoria "
				+ categoria + ", en una decada tendra " + (edad + 10) + " años");

	}

	public static int compruebaEdad(int edad) {

		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puede ser un número negativo.");
		}
		return edad;
	}

	public static char compruebaCategoria(int edad) {
		char categoria;

		if (edad >= 0 && edad <= 25) {
			categoria = 'A';
		} else if (edad > 25 && edad <= 50) {
			categoria = 'B';
		} else {
			categoria = 'C';
		}

		return categoria;
	}

	public static String compruebaNombre(String nombre) throws IllegalArgumentException {

		char[] nombreChar = nombre.toCharArray();
		for (char n : nombreChar) {
			if (Character.isDigit(n)) {
				throw new IllegalArgumentException("El nombre no puede contener dígitos.");
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char n : nombreChar) {

			sb.append(n);

		}
		return sb.toString().trim().toUpperCase();

	}
}
