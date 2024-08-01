import java.util.Scanner;

/**
 * Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros.
 * Usando la clase Scanner, ingresar la cantidad de números a comparar. Luego, utilizando una sentencia for,
 * iterar el número de veces (ingresado) para pedir el número entero.
 * <p>
 * Se requiere:
 * - Calcular el menor número e imprimir el valor.
 * - Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
 * - Si no, imprimir "El número menor es igual o mayor que 10!".
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num of nums to compare:");
        int quantity = sc.nextInt();

        if (quantity < 10) {
            System.out.println("Error: You must compare at least 10 integers!");
        } else {
            int min = Integer.MAX_VALUE;
            int num;

            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter the num " + (i + 1) + ": ");
                num = sc.nextInt();
                min = (num < min) ? num : min;
            }

            System.out.println("The min num is: " + min);

            if (min < 10) {
                System.out.println("The num " + min + " it's less than 10!");
            } else {
                System.out.println("The num " + min + " is equal to or greater than 10!");
            }
        }
    }
}
