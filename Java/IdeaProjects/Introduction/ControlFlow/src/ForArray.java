import javax.swing.*;

public class ForArray {

    public static void main(String[] args) {
        // Declaración y asignación del array de nombres
        String[] names = {"Andrey", "Pepe", "Maria", "Paco", "Lilo", "Bea", "Pato", "Pepa"};
        int count = names.length;

        // Imprimir nombres en el array excepto "Andrey" y "Pepa"
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase("andrey") || names[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println(i + ") " + names[i]);
        }

        // Solicitar al usuario que ingrese un nombre
        String search = JOptionPane.showInputDialog("Enter a name:");
        System.out.println("search = " + search);

        // Buscar el nombre en el array
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (found) {
            JOptionPane.showMessageDialog(null, search + " was found!");
            System.out.println(search + " was found!");
        } else {
            JOptionPane.showMessageDialog(null, search + " does not exist in the system!");
            System.out.println(search + " does not exist in the system!");
        }
    }
}
