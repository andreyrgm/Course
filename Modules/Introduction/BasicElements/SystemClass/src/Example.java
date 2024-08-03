import static java.lang.System.*;

/**
 * Ejemplo para abrir un editor de texto basado en el sistema operativo.
 */
public class Example {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proc;

        try {
            String osName = getProperty("os.name").toLowerCase();
            if (osName.startsWith("windows")) {
                proc = rt.exec("notepad");
            } else if (osName.startsWith("mac")) {
                proc = rt.exec("open -a TextEdit");
            } else if (osName.contains("nux") || osName.contains("nix")) {
                proc = rt.exec("gedit");
            } else {
                throw new UnsupportedOperationException("Unsupported OS: " + osName);
            }

            proc.waitFor(); // Esperar a que el proceso termine
        } catch (Exception e) {
            err.println("Error executing command: " + e.getMessage());
            exit(1);
        }

        out.println("The editor has closed");
        exit(0);
    }
}
