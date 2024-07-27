import java.util.Scanner;

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 *
 * Podría ser utilizando operador ternario.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        double num = sc.nextDouble();
        System.out.println("Enter second num:");
        double secondNum = sc.nextDouble();

        String max = num > secondNum ? num + " - " + secondNum : secondNum + " - " + num;
        System.out.println(max);
    }
}
