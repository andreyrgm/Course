package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso de los tipos de datos Integer en Java y su comparación.
 */
public class RelationalOperator {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = num1; // num2 referencia al mismo objeto que num1

        out.println("num1 = " + num1);
        out.println("num2 = " + num2);

        out.println("Are they the same object? " + (num1 == num2)); // true, ambos apuntan al mismo objeto

        num2 = 1000;

        out.println("num1 = " + num1);
        out.println("num2 = " + num2);

        out.println("Are they the same object? " + (num1 == num2)); // false, num2 apunta a una nueva instancia

        out.println("Do they have the same value? " + (num1.equals(num2))); // true, comparando valores

        out.println("Do they have the same value?" + (num1.intValue() == num2.intValue())); // true, comparando valores primitivos

        num2 = 500;
        boolean condition = num1 > num2; // Comparación usando autoboxing
        out.println("condition = " + condition); // true

        boolean condition2 = num1 < num2; // Comparación usando valores primitivos
        out.println("condition2 = " + condition2); // false
    }
}
