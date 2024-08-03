import static java.lang.System.*;

/**
 * Ejemplo para comparar el rendimiento de diferentes formas de concatenar cadenas en Java.
 */
public class TestEfficiency {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a; // Variable para concatenar usando concat() y operador +=
        StringBuilder sb = new StringBuilder(a); // StringBuilder para concatenaciones eficientes

        long start = currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // Descomentar una de las siguientes líneas para probar diferentes métodos de concatenación
            // c = c.concat(a).concat(b).concat("\n"); // Método 1: usando concat()
            // c += a + b + "\n"; // Método 2: usando operador +=
            sb.append(a).append(b).append("\n"); // Método 3: usando StringBuilder
        }

        gc();

        long end = currentTimeMillis();
        out.println("Time elapsed: " + (end - start) + " ms");

        out.println("Result with concat() or += operator: " + c);
        out.println("Result with StringBuilder: " + sb.toString());

        exit(0); // Salir del programa
    }
}
