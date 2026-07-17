/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}