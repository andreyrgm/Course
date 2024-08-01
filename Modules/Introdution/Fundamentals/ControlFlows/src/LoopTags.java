import static java.lang.System.*;

/**
 * Ejemplo de uso de sentencias de bucle con etiquetas en Java.
 */
public class LoopTags {
    public static void main(String[] args) {
        out.println("Example 1: Loop with label 'loop'");
        loop:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                // Si i es 6 o 7, imprimir mensaje y continuar al siguiente ciclo del bucle 'loop'
                if (i == 6 || i == 7) {
                    out.println("Day " + i + ": weekend break!");
                    continue loop;
                }
                // Imprimir mensaje de trabajo y aumentar el contador j
                out.println("Day " + i + ", working at " + j + "hrs. ");
                j++;
            }
        }

        out.println("\nExample 2: Loop with label 'loop2'");
        loop2:
        for (int i = 0; i < 5; i++) {
            out.println();
            int j = 0;
            while (j < 5) {
                // Si i es 2, continuar al siguiente ciclo del bucle 'loop2'
                if (i == 2) {
                    continue loop2;
                }
                // Imprimir valores de i y j
                out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }

        out.println("\n\nExample 3: Loop with label 'loop3'");
        loop3:
        for (int i = 0; i < 5; i++) {
            out.println();
            for (int j = 0; j < 5; j++) {
                // Si i es 2, salir del bucle 'loop3'
                if (i == 2) {
                    break loop3;
                }
                // Imprimir valores de i y j
                out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
