package co.argm.app;

/**
 * Clase que representa una calculadora con operaciones de división.
 */
public class Calculator {

    /**
     * Divide dos números decimales.
     *
     * @param numerator El numerador.
     * @param divider   El divisor.
     * @return El resultado de la división.
     * @throws DivisionByZeroException Si el divisor es cero.
     */
    public double divide(double numerator, double divider) throws DivisionByZeroException {
        if (divider == 0) {
            throw new DivisionByZeroException("You can't divide by zero!");
        }
        return numerator / divider;
    }

    /**
     * Divide dos números representados como cadenas.
     *
     * @param numerator La cadena que representa el numerador.
     * @param divider   La cadena que representa el divisor.
     * @return El resultado de la división.
     * @throws DivisionByZeroException Si el divisor es cero.
     * @throws FormatNumberException   Si las cadenas no pueden convertirse a números.
     */
    public double divide(String numerator, String divider) throws DivisionByZeroException, FormatNumberException {
        try {
            return divide(Double.parseDouble(numerator), Double.parseDouble(divider));
        } catch (NumberFormatException e) {
            throw new FormatNumberException("You must enter a valid number for both numerator and divisor");
        }
    }
}
