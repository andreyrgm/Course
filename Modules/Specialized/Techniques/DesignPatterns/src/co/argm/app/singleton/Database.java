package co.argm.app.singleton;

import static java.lang.System.out;

/**
 * Clase que implementa el patrón Singleton para la conexión a una base de datos.
 * Asegura que solo haya una instancia de la base de datos en toda la aplicación.
 */
public class Database {
    private static Database instance;

    private Database() {
        out.println("Connecting to some database engine");
    }

    /**
     * Obtiene la instancia única de la clase Database.
     * Si la instancia no existe, se crea una nueva.
     *
     * @return La instancia única de la clase Database.
     */
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
