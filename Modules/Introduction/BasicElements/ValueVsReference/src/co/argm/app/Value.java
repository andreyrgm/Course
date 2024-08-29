package co.argm.app;

import static java.lang.System.out;

/**
 * Clase que demuestra el paso por valor en Java.
 */
public class Value {
    public static void main(String[] args) {
        int num = 10;

        out.println("We start the main method with number = " + num);

        test(num);

        out.println("End the main method with the value of number (remains the same) = " + num);
    }

    /**
     * Método que modifica el valor del parámetro localmente.
     *
     * @param value El valor a modificar localmente.
     */
    public static void test(int value) {
        out.println("We start the test method with value = " + value);

        value = 35;

        out.println("End the test method with value = " + value);
    }
}
