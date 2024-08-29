package co.argm.app;

import java.util.Map;

import static java.lang.System.getenv;
import static java.lang.System.out;

/**
 * Ejemplo de obtención y listado de variables de entorno del sistema.
 */
public class EnvironmentVars {
    public static void main(String[] args) {
        Map<String, String> env = getenv();
        out.println("System environment variables: " + env);

        out.println("-- Listing system variables --");
        for (Map.Entry<String, String> entry : env.entrySet()) {
            out.println(entry.getKey() + " => " + entry.getValue());
        }

        String username = getenv("USERNAME");
        out.println("Username: " + username);

        String javaHome = getenv("JAVA_HOME");
        out.println("JAVA_HOME: " + javaHome);

        String tempDir = getenv("TEMP");
        out.println("TEMP directory: " + tempDir);

        String path = getenv("PATH");
        out.println("PATH: " + path);

        String path2 = env.get("Path");
        out.println("Path (alternative): " + path2);
    }
}
