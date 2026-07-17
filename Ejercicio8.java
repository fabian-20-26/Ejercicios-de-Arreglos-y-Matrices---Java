/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Ingrese valor: ");
                matriz[i][j] = teclado.nextInt();

            }

        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < 4; i++) {

            System.out.println(matriz[i][i]);

            suma = suma + matriz[i][i];

        }

        System.out.println("Suma diagonal: " + suma);

    }

}