import java.util.Scanner;

import static java.lang.System.out;

/**
 * Genera e imprime un histograma de frecuencias para un arreglo de 12 elementos con números enteros en el rango de 1 a 6.
 *
 * <p>El histograma muestra la frecuencia de cada número del 1 al 6, incluso si algún número no está presente en el arreglo.
 * Cada frecuencia se representa con asteriscos (*).</p>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[12];

        for (int i = 0; i < nums.length; i++) {
            int input;
            do {
                out.print("Enter a number from 1 to 6: ");
                while (!sc.hasNextInt()) {
                    out.println("Invalid input. Please enter an integer between 1 and 6.");
                    sc.next();
                }
                input = sc.nextInt();
                if (input < 1 || input > 6) {
                    out.println("Invalid input. Please enter a number between 1 and 6.");
                }
            } while (input < 1 || input > 6);
            nums[i] = input;
        }

        StringBuilder[] histograms = new StringBuilder[6];
        for (int i = 0; i < histograms.length; i++) {
            histograms[i] = new StringBuilder((i + 1) + ": ");
        }

        for (int num : nums) {
            histograms[num - 1].append("*");
        }

        for (StringBuilder histogram : histograms) {
            out.println(histogram);
        }
    }
}
