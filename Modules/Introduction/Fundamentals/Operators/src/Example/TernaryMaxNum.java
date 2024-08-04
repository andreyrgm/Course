package Example;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para encontrar el número mayor entre cuatro números ingresados por el usuario usando el operador ternario.
 */
public class TernaryMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("Enter a number:");
        int num1 = sc.nextInt();

        out.println("Enter a second number:");
        int num2 = sc.nextInt();

        out.println("Enter a third number:");
        int num3 = sc.nextInt();

        out.println("Enter a fourth number:");
        int num4 = sc.nextInt();

        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        max = Math.max(max, num4);

        out.println("Number 1 = " + num1);
        out.println("Number 2 = " + num2);
        out.println("Number 3 = " + num3);
        out.println("Number 4 = " + num4);
        out.println("The largest number is: " + max);

    }
}
