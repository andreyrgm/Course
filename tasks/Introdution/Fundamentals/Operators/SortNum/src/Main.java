import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 * <p>
 * Podría ser utilizando operador ternario.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter num:");
        double num = sc.nextDouble();
        out.println("Enter second num:");
        double secondNum = sc.nextDouble();

        String max = num > secondNum ? num + " - " + secondNum : secondNum + " - " + num;
        out.println(max);
    }
}
