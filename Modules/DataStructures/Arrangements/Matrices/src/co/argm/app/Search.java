package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de búsqueda en una matriz bidimensional.
 */
public class Search {
    public static void main(String[] args) {
        int[][] nums = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int searchItem = 15;
        boolean found = false;

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == searchItem) {
                    out.println("Found " + searchItem + " at coordinates (" + row + ", " + col + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            out.println(searchItem + " was not found in the matrix");
        }
    }
}
