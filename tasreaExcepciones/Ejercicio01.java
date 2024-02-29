package tasreaExcepciones;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			float num1 = 0, num2 = 0;
			System.out.println("Introduce el dividendo:");
			num1 = sc.nextInt();

			System.out.println("Introduce el divisor:");
			num2 = sc.nextInt();
			
			if(num1 > num2){
				System.out.println(num1 / num2);
			}else {
				System.out.println("El dividendo ha de ser mayor que el divisor");
			}
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre 0. Inténtalo de nuevo.");
		}
		

	}
}
