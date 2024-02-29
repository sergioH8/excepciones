package tasreaExcepciones;

import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroMaquina = random.nextInt(); 

        try {
            compruebaParImpar(numeroMaquina);
        } catch (ParException e) {
            System.out.println("El número " + numeroMaquina + " es par.");
        } catch (ImparException e) {
            System.out.println("El número " + numeroMaquina + " es impar.");
        }
    }

    public static void compruebaParImpar(int numero) throws ParException, ImparException {
        if (numero % 2 == 0) {
            throw new ParException();
        } else {
            throw new ImparException();
        }
    }

   
    public static class ParException extends Exception {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ParException() {
            super("El número es par.");
        }
    }

    public static class ImparException extends Exception {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ImparException() {
            super("El número es impar.");
        }
    }
}