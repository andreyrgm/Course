package co.argm.app;

import static java.lang.System.*;

/**
 * Una calculadora simple que realiza operaciones aritméticas básicas
 * (suma, resta, multiplicación, división) basadas en argumentos de línea de comandos.
 */
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            err.println("Please enter an operation (add, subtract, multi or div) and two numbers");
            exit(1);  // Salir con código de error
        }

        String operation = args[0];
        double a, b, result = 0;

        try {
            a = Double.parseDouble(args[1]);
            b = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            err.println("The arguments must be valid numbers.");
            exit(1);
            return; // Aunque exit termine el programa, return es una buena práctica.
        }

        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multi":
                result = a * b;
                break;
            case "div":
                if (b == 0) {
                    err.println("Cannot be divided by zero");
                    exit(-1);
                }
                result = a / b;
                break;
            default:
                err.println("Unrecognized operation. Use add, subtract, multi or div.");
                exit(1);
        }

        out.println("Operation result '" + operation + "': " + result);
    }
}
