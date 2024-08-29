package co.argm.app;

import static java.lang.System.*;

/**
 * Ejemplo de obtención y visualización de propiedades del sistema.
 */
public class Properties {
    public static void main(String[] args) {
        String username = getProperty("user.name");
        out.println("Username: " + username);

        String home = getProperty("user.home");
        out.println("Home directory: " + home);

        String workSpace = getProperty("user.dir");
        out.println("Working directory: " + workSpace);

        String javaVersion = getProperty("java.version");
        out.println("Java version: " + javaVersion);

        String lineSeparator2 = lineSeparator();
        out.println("Line separator: " + lineSeparator2 + "una nueva línea\n");

        java.util.Properties properties = getProperties();
        properties.list(out);
    }
}
