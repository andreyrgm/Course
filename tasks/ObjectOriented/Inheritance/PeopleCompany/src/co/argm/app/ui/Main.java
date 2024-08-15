package co.argm.app.ui;

import co.argm.app.model.Manager;

import static java.lang.System.out;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(55555.04, 98, 10000.10, "55.88.44-88", "Andrew",
                "Gomez", "Argm 1728");
        manager.increaseSalary(15);
        manager.setBudget(77000.00);
        out.println(manager);
    }
}
