/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese valor: ");
                matriz[i][j] = teclado.nextInt();

            }

        }

        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];

                }

                if (matriz[i][j] < menor) {

                    menor = matriz[i][j];

                }

            }

        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

    }

}
