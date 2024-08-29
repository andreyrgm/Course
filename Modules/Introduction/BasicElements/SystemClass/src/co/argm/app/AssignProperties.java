package co.argm.app;

import java.io.FileInputStream;
import java.util.Properties;

import static java.lang.System.*;

/**
 * Ejemplo de carga y asignación de propiedades utilizando la clase Properties.
 */
public class AssignProperties {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("Modules/Introduction/BasicElements/SystemClass/src/" +
                "co/argm/app/config.properties")) {

            Properties p = new Properties(getProperties());
            p.load(file);

            p.setProperty("my.custom.property", "My value saved in properties object");

            setProperties(p);

            Properties ps = getProperties();
            out.println("Custom property: " + ps.getProperty("my.custom.property"));
            out.println("Server port: " + System.getProperty("config.port.server"));
            out.println("Author name: " + System.getProperty("config.author.name"));
            out.println("Author email: " + System.getProperty("config.author.email"));
            out.println("Environment text: " + System.getProperty("config.text.ambient"));
            out.println("Other property: " + System.getProperty("other"));

            ps.list(out);
        } catch (Exception e) {
            err.println("Error loading properties file: " + e.getMessage());
            exit(1);
        }
    }
}
