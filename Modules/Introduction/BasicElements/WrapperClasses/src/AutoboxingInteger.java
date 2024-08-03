import static java.lang.System.out;

/**
 * Ejemplo de autoboxing y manejo de objetos Integer en Java.
 */
public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        out.println("Example 1: Calculate the sum of even numbers using autoboxing");
        int sum = 0;
        for (var num : integers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        out.println("Sum of even numbers = " + sum);

        out.println("\nExample 2: Repeating the calculation of the sum of even numbers");
        sum = 0;
        for (var num : integers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        out.println("Addition of even numbers (repeated) = " + sum);
    }
}
