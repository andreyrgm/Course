package co.argm.app.Example;

import javax.swing.*;

import static java.lang.System.out;

/**
 * Ejemplo de uso de un arreglo y bucles for en Java para buscar nombres.
 */
public class ForArray {
    public static void main(String[] args) {

        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lilo", "Bea", "Pato", "Pepa"};
        int count = names.length;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase("Andres") || names[i].equalsIgnoreCase("Pepa")) {
                continue; // Salta la iteración si el nombre es "Andres" o "Pepa"
            }
            out.println(i + ".- " + names[i]);
        }

        String search = JOptionPane.showInputDialog("Enter a name:");
        out.println("search = " + search);

        boolean found = false;
        // Bucle para buscar el nombre ingresado en el arreglo
        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found = true;
                break; // Si el nombre es encontrado, salir del bucle
            }
            out.println("names = " + name);
        }

        if (found) {
            JOptionPane.showMessageDialog(null, search + " it was found!");
        } else {
            JOptionPane.showMessageDialog(null, search + " does not exist in the system!");
        }
    }
}