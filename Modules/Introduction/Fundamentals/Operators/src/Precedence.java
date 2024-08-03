import static java.lang.System.out;

/**
 * Ejemplo de precedencia de operadores en Java.
 */
public class Precedence {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double average = (i + j + k) / 3d;
        out.println("Example 1: Average using floating division");
        out.println("average = " + average); // 14.0

        average = (i + j + k) / 3d * 10;
        out.println("\nExample 2: Average multiplied by 10");
        out.println("average = " + average); // 140.0

        average = --i + j++ + k / 3d * 10;
        out.println("\nExample 3: Calculation with pre and post increment");
        out.println("average = " + average); // 87.666...

        out.println("i = " + i); // 13
        out.println("j = " + j); // 9
    }
}
