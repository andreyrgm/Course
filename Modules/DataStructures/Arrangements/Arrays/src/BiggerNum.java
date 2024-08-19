import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa que lee 5 enteros del usuario y determina el mayor de ellos.
 */
public class BiggerNum {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(in);

        out.println("Enter 5 integers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        out.println("The largest number is: " + nums[maxIndex]);
    }
}
