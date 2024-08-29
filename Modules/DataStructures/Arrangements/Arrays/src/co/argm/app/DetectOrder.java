package co.argm.app;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Programa que detecta el orden de un arreglo de enteros ingresados por el usuario.
 */
public class DetectOrder {
    public static void main(String[] args) {
        int[] nums = new int[7];

        Scanner sc = new Scanner(System.in);
        out.println("Enter 7 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        boolean upward = false;
        boolean downward = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                downward = true;
            } else if (nums[i] < nums[i + 1]) {
                upward = true;
            }
        }

        if (upward && downward) {
            out.println("Array = Messy");
        } else if (!upward && !downward) {
            out.println("Array = They are all the same");
        } else if (upward) {
            out.println("Array = Sorted in ascending order");
        } else {
            out.println("Array = Sorted in descending order");
        }
    }
}
