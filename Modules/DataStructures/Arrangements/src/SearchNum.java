import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para buscar un número en un arreglo de enteros.
 */
public class SearchNum {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(in);

        out.println("Enter 10 numbers:");
        for (int i = 0; i < nums.length; i++) {
            out.print("Number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        out.println("\nEnter number to search: ");
        int find = sc.nextInt();

        int position = -1; // Posición del número en el arreglo, -1 indica que no se ha encontrado
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == find) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            out.println("Number not found");
        } else {
            out.println("Number found in position: " + position);
        }
    }
}
