package co.argm.app;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para buscar un nombre en un arreglo de cadenas.
 */
public class SearchString {
    public static void main(String[] args) {
        String[] strings = new String[4];
        Scanner sc = new Scanner(in);

        out.println("Enter 4 names:");
        for (int i = 0; i < strings.length; i++) {
            out.print("Name " + (i + 1) + ": ");
            strings[i] = sc.next();
        }

        out.println("\nEnter name to search: ");
        String find = sc.next();

        int position = -1; // Posición del nombre en el arreglo, -1 indica que no se ha encontrado
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equalsIgnoreCase(find)) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            out.println("Name not found");
        } else {
            out.println("Name found in position: " + position);
        }
    }
}
