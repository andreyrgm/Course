import static java.lang.System.out;

/**
 * Ejemplo de uso de operadores incrementales y decreméntales en Java.
 */
public class Incremental {
    public static void main(String[] args) {

        int i = 1;
        int j = ++i; // i se incrementa a 2, luego j toma el valor de i
        out.println("After pre-increment: i = " + i + ", j = " + j);

        i = 2;
        out.println("Initial value of i = " + i);
        j = i++; // j toma el valor de i, luego i se incrementa a 3
        out.println("After post-increment: i = " + i + ", j = " + j);

        i = 3;
        j = --i; // i se decrementa a 2, luego j toma el valor de i
        out.println("After pre-decrement: i = " + i + ", j = " + j);

        i = 4;
        j = i--; // j toma el valor de i, luego i se decrementa a 3
        out.println("After post-decrement: i = " + i + ", j = " + j);

        out.println("Value of j before pre-increment: " + j);
        out.println("Value of j after pre-increment: " + (++j)); // j se incrementa y luego se muestra
        out.println("Value of j after post-increment: " + (j++)); // se muestra j, luego se incrementa
        out.println("Final value of j: " + j); // muestra el valor final de j
    }
}
