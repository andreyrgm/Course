package co.argm.app.model.arithmetic;

/**
 * Interfaz funcional que representa una operación aritmética.
 */
@FunctionalInterface
public interface Arithmetic {
    /**
     * Realiza una operación aritmética en dos números.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return el resultado de la operación
     */
    double operation(double a, double b);
}
