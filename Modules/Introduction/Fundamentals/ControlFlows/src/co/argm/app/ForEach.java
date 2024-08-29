package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso del bucle 'for-each' en Java para iterar sobre arreglos.
 */
public class ForEach {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};

        out.println("Example 1: Iteration over an array of integers");
        for (int num : nums) {
            out.println("number = " + num); // Imprime cada número en el arreglo
        }

        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        out.println("\nExample 2: Iteration over an array of strings");
        for (String name : names) {
            out.println("name = " + name); // Imprime cada nombre en el arreglo
        }
    }
}
