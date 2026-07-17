/**
 * @author Fabian Andres Gomez Calva
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Ingrese numero: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                pares++;
                sumaPares += numero;
            } else {
                impares++;
                sumaImpares += numero;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);

    }
}
