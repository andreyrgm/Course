import java.util.Scanner;

import static java.lang.System.out;

/**
 * Programa para mover posiciones de un arreglo y agregar un nuevo elemento.
 */
public class MovePosition2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            out.print("Enter number: ");
            nums[i] = sc.nextInt();
        }

        out.println("New item to add:");
        int item = sc.nextInt();

        out.println("Position to add (from 0 to " + (nums.length - 1) + "):");
        int position = sc.nextInt();

        if (position < 0 || position >= nums.length) {
            out.println("Invalid position. It should be between 0 and " + (nums.length - 1));
            return;
        }

        int[] nums2 = new int[nums.length + 1];

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if (j == position) {
                nums2[j++] = item; // Insertar el nuevo elemento en la posición deseada
            }
            nums2[j] = nums[i]; // Copiar el elemento actual
        }

        nums2[nums.length] = nums[nums.length - 1];

        nums = nums2;

        out.println("\nThe array is:");
        for (int num : nums) {
            out.println(num);
        }
    }
}
