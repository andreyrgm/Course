import static java.lang.System.out;

/**
 * Ejemplo de obtención de la extensión de un archivo a partir de su nombre en una cadena.
 */
public class Example {
    public static void main(String[] args) {

        String file = "some.image.pdf";

        int i = file.lastIndexOf(".");

        out.println("file.length() = " + file.length());

        out.println("file.substring(i + 1) = " + file.substring(i + 1));
    }
}
