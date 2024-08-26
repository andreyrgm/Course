import static java.lang.System.exit;
import static java.lang.System.out;

/**
 * Clase que maneja los argumentos pasados por línea de comandos.
 */
public class Argument {
    public static void main(String[] args) {
        if (args.length == 0) {
            out.println("You must enter arguments or parameters.");
            exit(-1);  // Salir con código de error
        }

        for (int i = 0; i < args.length; i++) {
            out.println("Argument n° " + (i + 1) + ": " + args[i]);
        }
    }
}
