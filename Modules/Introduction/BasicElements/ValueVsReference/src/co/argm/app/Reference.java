package co.argm.app;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el paso por referencia en Java.
 */
public class Reference {
    public static void main(String[] args) {
        int[] ages = {10, 11, 12};

        out.println("We start the main method");
        printAges(ages);

        out.println("Before calling the test method");
        updateAges(ages);

        out.println("After calling the test method");
        printAges(ages);

        out.println("End the main method with the modified array data!");
    }

    /**
     * Imprime los valores del arreglo de años.
     *
     * @param ages El arreglo de años a imprimir.
     */
    public static void printAges(int[] ages) {
        for (int age : ages) {
            out.println("age = " + age);
        }
    }

    /**
     * Aumenta cada valor del arreglo de años en 20.
     *
     * @param ages El arreglo de años a actualizar.
     */
    public static void updateAges(int[] ages) {
        out.println("We start the updateAges method");
        for (int i = 0; i < ages.length; i++) {
            ages[i] += 20;
        }
        out.println("End the updateAges method");
    }
}
