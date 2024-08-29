package co.argm.app;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Encuentra e imprime el número con más ocurrencias en un arreglo de 10 elementos y la cantidad de veces que aparece.
 *
 * <p>El arreglo contiene números enteros en el rango de 1 a 9. Si hay un empate en la cantidad de ocurrencias,
 * se considera el primero que alcanza esa cantidad.</p>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int input;
            do {
                out.print("Enter a number from 1 to 9: ");
                while (!sc.hasNextInt()) {
                    out.println("Invalid input. Please enter an integer between 1 and 9.");
                    sc.next();
                }
                input = sc.nextInt();
                if (input < 1 || input > 9) {
                    out.println("Invalid input. Please enter a number between 1 and 9.");
                }
            } while (input < 1 || input > 9);
            nums[i] = input;
        }

        int[] counts = new int[10];
        for (int num : nums) {
            counts[num]++;
        }

        int mostRepeated = 0;
        int maxCount = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostRepeated = i;
            }
        }

        out.println("The highest occurrence is: " + maxCount +
                "\nThe most repeated element is: " + mostRepeated +
                "\nThe element " + mostRepeated + " is repeated " + maxCount + " times!");
    }
}
