/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = leer.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 1; i < 15; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Posicion mayor: " + posMayor);

        System.out.println("Menor: " + menor);
        System.out.println("Posicion menor: " + posMenor);

    }
}