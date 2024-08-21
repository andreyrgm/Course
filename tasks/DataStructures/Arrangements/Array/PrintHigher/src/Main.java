import java.util.Scanner;

import static java.lang.System.*;

/**
 * Encuentra e imprime el número más alto en un arreglo de 7 elementos.
 *
 * <p>El arreglo contiene números enteros en el rango de 11 a 99. Si hay valores repetidos,
 * se considera solo uno de ellos.</p>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            int input;
            do {
                out.print("Enter a number from 11 to 99: ");
                input = sc.nextInt();
                if (input < 11 || input > 99) {
                    err.println("Invalid input. Please enter a number between 11 and 99.");
                }
            } while (input < 11 || input > 99);
            nums[i] = input;
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        out.println("The highest value is: " + max);
    }
}
