package co.argm.app;

/**
 * Clase que proporciona métodos para sumar diferentes tipos de datos.
 */
public class Calculator {

    public Calculator() {
    }

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de a y b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Suma un número arbitrario de enteros.
     *
     * @param args Números enteros a sumar.
     * @return La suma de todos los enteros.
     */
    public static int add(int... args) {
        int total = 0;
        for (int arg : args) {
            total += arg;
        }
        return total;
    }

    /**
     * Suma un número decimal con una cantidad variable de números enteros.
     *
     * @param a    Número decimal.
     * @param args Números enteros a sumar.
     * @return La suma de a con todos los enteros.
     */
    public static double add(double a, int... args) {
        double total = a;
        for (int arg : args) {
            total += arg;
        }
        return total;
    }

    /**
     * Suma dos cadenas que representan números enteros.
     *
     * @param a Primer número en formato de cadena.
     * @param b Segundo número en formato de cadena.
     * @return La suma de a y b, o 0 si las cadenas no son números válidos.
     */
    public static int add(String a, String b) {
        int result;
        try {
            result = add(Integer.parseInt(a), Integer.parseInt(b));
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    /**
     * Suma tres números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @param c Tercer número entero.
     * @return La suma de a, b y c.
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Suma un número decimal con un número entero.
     *
     * @param a Número decimal.
     * @param b Número entero.
     * @return La suma de a y b.
     */
    public static double add(double a, int b) {
        return a + b;
    }

    /**
     * Suma un número entero con un número decimal.
     *
     * @param a Número entero.
     * @param b Número decimal.
     * @return La suma de a y b.
     */
    public static double add(int a, double b) {
        return a + b;
    }

    /**
     * Suma dos números decimales.
     *
     * @param a Primer número decimal.
     * @param b Segundo número decimal.
     * @return La suma de a y b.
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Suma dos números largos (long).
     *
     * @param a Primer número largo.
     * @param b Segundo número largo.
     * @return La suma de a y b.
     */
    public static long add(long a, long b) {
        return a + b;
    }

    /**
     * Suma un número entero con un carácter, donde el carácter se trata como su valor ASCII.
     *
     * @param a Número entero.
     * @param b Carácter a sumar (tratado como valor ASCII).
     * @return La suma de a y el valor ASCII de b.
     */
    public static int add(int a, char b) {
        return a + b;
    }

    /**
     * Suma un número decimal con un carácter, donde el carácter se trata como su valor ASCII.
     *
     * @param a Número decimal.
     * @param b Carácter a sumar (tratado como valor ASCII).
     * @return La suma de a y el valor ASCII de b.
     */
    public static double add(double a, char b) {
        return a + b;
    }
}
