/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = teclado.nextDouble();
            suma += numeros[i];
        }

        promedio = suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

    }
}