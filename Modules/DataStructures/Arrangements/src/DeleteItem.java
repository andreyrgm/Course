import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para eliminar un elemento de un arreglo y ajustar su tamaño.
 */
public class DeleteItem {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(in);

        for (int i = 0; i < nums.length; i++) {
            out.print("Enter number " + i + ": ");
            nums[i] = sc.nextInt();
        }

        out.print("\nEnter a position to delete between 0 - 9: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= nums.length) {
            out.println("Invalid position. It should be between 0 and " + (nums.length - 1));
            return;
        }

        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        int[] nums2 = new int[nums.length - 1];
        System.arraycopy(nums, 0, nums2, 0, nums2.length);

        nums = nums2;

        out.println("Array after deletion:");
        for (int i = 0; i < nums.length; i++) {
            out.println(i + " => " + nums[i]);
        }
    }
}
