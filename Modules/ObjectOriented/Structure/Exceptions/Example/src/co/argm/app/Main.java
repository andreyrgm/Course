package co.argm.app;

import javax.swing.*;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Clase principal para ejecutar la aplicación de la calculadora.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            out.println(calculator.divide(
                    JOptionPane.showInputDialog("Enter a numerator:"),
                    JOptionPane.showInputDialog("Enter a divisor:")));
        } catch (FormatNumberException e) {
            err.println("An exception was detected: Please enter a valid number: " + e.getMessage());
            e.printStackTrace(out);
            main(args);
        } catch (DivisionByZeroException e) {
            err.println("Caught a division by zero exception: " + e.getMessage());
            main(args);
        } finally {
            out.println("This block is always executed, with or without an exception.");
        }
        out.println("Continuing with the flow of our application!");
    }
}
