/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese valor: ");
                matriz[i][j] = teclado.nextInt();

            }

        }

        System.out.println("Matriz:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();

        }

    }

}
