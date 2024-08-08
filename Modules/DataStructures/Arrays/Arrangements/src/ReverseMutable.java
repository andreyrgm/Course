import java.util.Arrays;

import static java.lang.System.out;

/**
 * Clase que contiene métodos para invertir un arreglo mutablemente.
 */
public class ReverseMutable {

    /**
     * Invierte el contenido de un arreglo de cadenas de forma mutable.
     *
     * @param array El arreglo a invertir.
     */
    public static void inverseArray(String[] array) {
        int total = array.length;
        // Iterar solo hasta la mitad del arreglo para evitar doble intercambio
        for (int i = 0; i < total / 2; i++) {
            // Intercambia el elemento actual con su contraparte inversa
            String current = array[i];
            String inverse = array[total - i - 1];
            array[i] = inverse;
            array[total - i - 1] = current;
        }
    }

    public static void main(String[] args) {
        String[] products = {
                "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Samsung External SSD Hard Drive",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4th generation",
                "Oxford bicycle"
        };

        int total = products.length;

        Arrays.sort(products);

        inverseArray(products);

        // También se podría usar Collections.reverse(Arrays.asList(products));
        // para invertir el arreglo, pero esto modificaría el arreglo original

        for (int i = 0; i < total; i++) {
            out.println("For index " + i + ": " + products[i]);
        }
    }
}
