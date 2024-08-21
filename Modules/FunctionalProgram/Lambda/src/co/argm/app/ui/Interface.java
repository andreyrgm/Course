package co.argm.app.ui;

import co.argm.app.model.arithmetic.Arithmetic;
import co.argm.app.model.arithmetic.Calculator;

import static java.lang.System.*;

/**
 * Clase que demuestra el uso de una interfaz funcional personalizada para cálculos aritméticos.
 */
public class Interface {
    public static void main(String[] args) {
        // Define operaciones aritméticas utilizando lambdas.
        Arithmetic sum = Double::sum;
        Arithmetic rest = Double::min;

        Calculator calculator = new Calculator();

        // Realiza cálculos y muestra los resultados.
        out.println(calculator.compute(10, 5, sum));
        out.println(calculator.compute(10, 5, rest));
        out.println(calculator.compute(10, 5, (a, b) -> a * b));

        out.println(calculator.computeBi(10, 5, Double::sum));
    }
}
