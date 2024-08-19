import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para clasificar números ingresados por el usuario en pares e impares.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int[] nums;
        int totalEvens = 0, totalOdds = 0;
        nums = new int[10];
        Scanner sc = new Scanner(in);

        out.println("Enter 10 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                totalEvens++;
            } else {
                totalOdds++;
            }
        }

        int[] evens = new int[totalEvens];
        int[] odds = new int[totalOdds];
        int addEven = 0, addOdd = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evens[addEven++] = num;
            } else {
                odds[addOdd++] = num;
            }
        }

        out.println("Evens:");
        for (int even : evens) {
            out.print(even + " ");
        }

        out.println("\nOdds:");
        for (int odd : odds) {
            out.print(odd + " ");
        }
    }
}
