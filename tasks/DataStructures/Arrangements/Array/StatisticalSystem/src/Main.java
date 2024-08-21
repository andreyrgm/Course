import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lee 7 números desde el teclado, calcula y muestra el promedio de los números positivos,
 * el promedio de los números negativos, y cuenta el número de ceros.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[7];
        int addPositive = 0;
        int positiveCounter = 0;
        int addNegative = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            out.print("Enter a number: ");
            while (!scanner.hasNextInt()) {
                out.println("Invalid input. Please enter an integer.");
                scanner.next();
                out.print("Enter a number: ");
            }
            nums[i] = scanner.nextInt();
        }

        for (int num : nums) {
            if (num == 0) {
                zeroCounter++;
            } else if (num > 0) {
                addPositive += num;
                positiveCounter++;
            } else {
                addNegative += num;
                negativeCounter++;
            }
        }

        if (positiveCounter == 0) {
            out.println("Cannot average positive numbers.");
        } else {
            out.printf("The average of the positive numbers is: %.2f%n", (float) addPositive / positiveCounter);
        }

        if (negativeCounter == 0) {
            out.println("Cannot average negative numbers.");
        } else {
            out.printf("The average of the negative numbers is: %.2f%n", (float) addNegative / negativeCounter);
        }

        out.println("The number of zeros is: " + zeroCounter);
    }
}
