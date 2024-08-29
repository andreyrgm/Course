package co.argm.app;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Clase para insertar un número en una posición ordenada en un arreglo.
 */
public class MovePosition3 {
    public static void main(String[] args) {
        int[] nums = new int[7];
        Scanner sc = new Scanner(in);

        out.println("Enter 6 numbers:");
        for (int i = 0; i < nums.length - 1; i++) {
            out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        out.print("\nEnter a number to insert: ");
        int num = sc.nextInt();

        int position = 0;
        while (position < nums.length - 1 && num > nums[position]) {
            position++;
        }

        for (int i = nums.length - 2; i >= position; i--) {
            nums[i + 1] = nums[i];
        }

        nums[position] = num;

        out.println("\nThe new sorted arrangement: ");
        for (int i = 0; i < nums.length; i++) {
            out.println(i + " => " + nums[i]);
        }
    }
}
