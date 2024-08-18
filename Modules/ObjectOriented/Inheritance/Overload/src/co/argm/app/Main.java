package co.argm.app;

import static co.argm.app.Calculator.add;
import static java.lang.System.out;

/**
 * Clase principal para probar la clase Calculator.
 */
public class Main {
    public static void main(String[] args) {
        out.println("add int: " + add(10, 5));
        out.println("add double: " + add(10.0, 5.0));
        out.println("add double - int: " + add(10.0, 5));
        out.println("add int - double: " + add(10, 5.0));
        out.println("add String: " + add("10", "5"));
        out.println("add three int: " + add(10, 5, 3));
        out.println("add four int: " + add(10, 5, 3, 4));
        out.println("add six int: " + add(10, 5, 3, 4, 5, 6));
        out.println("add double + n int: " + add(10.5, 5, 9, 15));

        out.println("add long: " + add(10L, 5L));
        out.println("add int - char: " + add(10, '@'));
        out.println("add double - char: " + add(10.0, '@'));
    }
}
