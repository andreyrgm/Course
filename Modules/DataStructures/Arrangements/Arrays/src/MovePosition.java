import java.util.Scanner;

import static java.lang.System.out;

/**
 * Programa para mover el último elemento de un arreglo a la primera posición.
 */
public class MovePosition {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            out.print("Enter number: ");
            nums[i] = sc.nextInt();
        }

        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;

        out.println("\nThe array is: ");
        for (int num : nums) {
            out.println(num);
        }
    }
}
