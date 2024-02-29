package tasreaExcepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroMaquina = random.nextInt(500) + 1;
        int numeroJugador = 0;
        int contador = 0;
        boolean acertado = false;

        while (!acertado) {
            try {
                contador++;
                System.out.println("Introduce un numero");
                numeroJugador = compruebaNum(sc.nextInt());
              
                if (numeroJugador < numeroMaquina) {
                    System.out.println("Tu numero elegido es menor ");
                } else if (numeroMaquina < numeroJugador) {
                    System.out.println("Tu numero elegido es mayor ");
                }else {
                    acertado = true;
                }
        	} catch (IllegalArgumentException e2) {
				System.out.println("Debe de ser un numero positivo");

            } catch (InputMismatchException e1) {
                System.out.println("Debe ser un número entero");
                sc.next(); 
               
            }

        } 

        System.out.println("¡Acertaste!");
        System.out.println(" Has usado " + contador + " intentos , mas suerte la proxima vez ");
        sc.close();
    }
    
    public static int compruebaNum(int numero) {

		if (numero < 0) {
			throw new IllegalArgumentException("La edad no puede ser un número negativo.");
		}
		return numero;
	}
    
}
