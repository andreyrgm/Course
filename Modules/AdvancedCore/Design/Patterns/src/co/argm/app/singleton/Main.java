package co.argm.app.singleton;

import static java.lang.System.out;

/**
 * Clase principal para demostrar el uso del patrón Singleton en la clase Database.
 */
public class Main {
    public static void main(String[] args) {
        // Crear y obtener instancias de la base de datos
        for (int i = 0; i < 10; i++) {
            Database sin = Database.getInstance();
            out.println("sin = " + sin);
        }

        // Obtener instancias adicionales y verificar si son iguales
        Database sin2 = Database.getInstance();
        Database sin3 = Database.getInstance();
        out.println("sin2 == sin3: " + (sin2 == sin3));
    }
}
