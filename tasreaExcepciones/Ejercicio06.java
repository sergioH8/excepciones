package tasreaExcepciones;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean correcto = false;

		int num1 = 0, num2 = 0;

		while (!correcto) {

			try {
				capturarNumeros(num1, num2);

				System.out.println(num2 / num1);
				correcto = true; // Si llega aquí sin lanzar excepción, cambiamos correcto a true
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir entre 0. Inténtalo de nuevo.");
			} catch (MiException e) {

			} catch (Exception e1) {
				System.out.println(e1.getMessage());
				sc.nextLine();
			}
		}

		sc.close();
	}

	private static void capturarNumeros(int num1, int num2) throws ArithmeticException, Exception, MiException {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce el primer número:");
	    num1 = sc.nextInt();

	    System.out.println("Introduce el segundo número:");
	    num2 = sc.nextInt();

	    if (num1 > num2) {
	        throw new MiException("Num1 > Num2 -> resultado 0");
	    }
	}
}

 class MiException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;

    public MiException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "MiException [mensaje=" + mensaje + "]";
    }
}