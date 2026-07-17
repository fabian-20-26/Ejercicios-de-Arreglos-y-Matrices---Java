/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese valor: ");
                int numero = teclado.nextInt();

                matriz[i][j] = numero + (i * j);

            }

        }

        System.out.println("Matriz resultante:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }

}