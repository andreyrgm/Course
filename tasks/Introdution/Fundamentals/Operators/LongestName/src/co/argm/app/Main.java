package co.argm.app;

import javax.swing.*;

import static java.lang.System.out;

/**
 * Obtener el nombre más largo de tres personas, según los siguientes requerimientos:
 * <p>
 * - Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos
 * usando la clase JOptionPane y el método showInputDialog().
 * - Calcular e imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres).
 * (Imprimir solo uno de los tres, el de más caracteres en el nombre.)
 * <p>
 * Podría usar .split(" ") del objeto String para separar nombre y apellido en un arreglo, y con el índice cero
 * accedemos al nombre de la persona.
 * <p>
 * Restricción: no usar loops en el desarrollo de la tarea.
 */
public class Main {
    public static void main(String[] args) {
        String person1 = JOptionPane.showInputDialog("Write the first and last name of the first person.");
        String person2 = JOptionPane.showInputDialog("Write the first and last name of the second person.");
        String person3 = JOptionPane.showInputDialog("Write the first and last name of the third person.");

        String max = (person1.split(" ")[0].length() < person2.split(" ")[0].length()) ? person2 : person1;
        max = (person3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : person3;

        out.println("the person with the longest name " + max);
    }
}
