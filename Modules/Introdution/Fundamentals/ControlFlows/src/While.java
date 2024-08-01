import static java.lang.System.*;

/**
 * Ejemplo de uso de las estructuras de control 'while' y 'do-while' en Java.
 */
public class While {
    public static void main(String[] args) {
        out.println("Example 1: 'while' loop that prints values of i from 0 to 5");
        int i = 0;
        while(i <= 5){
            out.println("i = " + i);
            i++;
        }

        out.println("\nExample 2: 'while' loop with condition changing inside the loop");
        i = 0;
        boolean test = true;

        while(test){
            if(i == 7){
                test = false; // Cambia la condición para salir del bucle
            }
            out.println("i = " + i);
            i++;
        }

        out.println("\nExample 3: 'do-while' loop that executes at least once");
        test = false;
        do {
            out.println("Runs at least once");
        } while (test); // La condición es falsa, pero el bloque se ejecuta una vez

        out.println("\nExample 4: 'do-while' loop with condition changing inside the loop");
        test = true;
        i = 0;

        do {
            if(i == 10){
                test = false; // Cambia la condición para salir del bucle
            }
            out.println("i = " + i);
            i++;
        } while (test); // El bucle continúa mientras test sea true
    }
}
