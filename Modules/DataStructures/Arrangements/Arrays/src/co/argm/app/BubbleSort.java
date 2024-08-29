package co.argm.app;

import static java.lang.System.out;

/**
 * Clase que contiene métodos para ordenar un arreglo usando el algoritmo de Bubble Sort.
 */
public class BubbleSort {
    /**
     * Ordena un arreglo de objetos utilizando el algoritmo de Bubble Sort.
     *
     * @param array El arreglo a ordenar.
     */
    public static void sort(Object[] array) {
        int total = array.length;
        int counter = 0; // Contador para seguir el número de comparaciones realizadas

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) array[j + 1]).compareTo(array[j]) > 0) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                counter++;
            }
        }

        out.println("Number of comparisons: " + counter);
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

        sort(products);
        out.println("Sorted products:");
        for (int i = 0; i < products.length; i++) {
            out.println("Index " + i + ": " + products[i]);
        }

        Integer[] nums = new Integer[4];
        nums[0] = 10;
        nums[1] = 7;
        nums[2] = 35;
        nums[3] = -1;

        sort(nums);
        out.println("Sorted numbers:");
        for (int i = 0; i < nums.length; i++) {
            out.println("Index " + i + ": " + nums[i]);
        }
    }
}
