package co.argm.app;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

/**
 * Tarea que requiere un menú para administrar productos con opciones:
 * actualizar, eliminar, crear, listar y salir.
 * <p>
 * El menú se implementa en la clase con el método main y puede utilizar
 * Scanner o JOptionPane para mostrar las opciones.
 * <p>
 * Se usa un Map para asociar las opciones con números y un switch o if
 * para ejecutar las operaciones según la opción seleccionada.
 * <p>
 * Cada operación muestra un mensaje indicando el resultado, y se usa un
 * bucle do-while para iterar hasta que se seleccione la opción de salir,
 * mostrando un mensaje final al salir del programa.
 */
public class Main {
    public static void main(String[] args) {
        int indexOption = 0;
        do {
            Map<String, Integer> options = new HashMap<>();
            options.put("Update", 1);
            options.put("Delete", 2);
            options.put("Add", 3);
            options.put("List", 4);
            options.put("Leave", 5);

            Object[] arrayOptions = options.keySet().toArray();
            Object option = JOptionPane.showInputDialog(null,
                    "Select an Operation", "User Maintainer", JOptionPane.INFORMATION_MESSAGE, null, arrayOptions, arrayOptions[0]);

            if (option == null) {
                JOptionPane.showMessageDialog(null, "You must select an operation");
            } else {
                indexOption = options.get(option.toString());

                String message = null;

                switch (indexOption) {
                    case 1 -> {
                        message = "Successfully updated user";
                        JOptionPane.showMessageDialog(null, message);
                        out.println(message);
                    }
                    case 2 -> {
                        message = "Successfully deleted user";
                        JOptionPane.showMessageDialog(null, message);
                        out.println(message);
                    }
                    case 3 -> {
                        message = "User successfully added";
                        JOptionPane.showMessageDialog(null, message);
                        out.println(message);
                    }
                    case 4 -> {
                        message = "Listing users";
                        JOptionPane.showMessageDialog(null, message);
                        out.println(message);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + indexOption);
                }
            }

        } while (indexOption != 5);

        JOptionPane.showMessageDialog(null, "You have exited successfully!");
    }
}
