package co.argm.app.model.arithmetic;

import java.util.function.BiFunction;

/**
 * Clase que permite realizar cálculos aritméticos usando expresiones lambda.
 */
public class Calculator {

    /**
     * Realiza un cálculo utilizando una implementación de la interfaz {@link Arithmetic}.
     *
     * @param a      el primer número
     * @param b      el segundo número
     * @param lambda la implementación de la operación aritmética
     * @return el resultado de la operación
     */
    public double compute(double a, double b, Arithmetic lambda) {
        return lambda.operation(a, b);
    }

    /**
     * Realiza un cálculo utilizando una implementación de la interfaz {@link BiFunction}.
     *
     * @param a      el primer número
     * @param b      el segundo número
     * @param lambda la implementación de la operación aritmética
     * @return el resultado de la operación
     */
    public double computeBi(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}
