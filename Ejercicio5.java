/**
 * @author Fabian Andres Gomez Calva
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numero = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese numero: ");
            numero[i] = teclado.nextInt() + i;
        }

        for (int i = 0; i < 12; i++) {
            System.out.println(numero[i]);
        }
    }
}
