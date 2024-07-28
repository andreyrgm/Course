/**
 * La clase Autoboxing demuestra el uso de autoboxing y unboxing en Java.
 */
public class Autoboxing {
    public static void main(String[] args) {
        // Inicialización de un array de Integer usando autoboxing
        Integer[] integers = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Suma de números pares usando unboxing explícito
        int sum = 0;
        for (Integer integer : integers) {
            if (integer.intValue() % 2 == 0) {
                sum += integer.intValue();
            }
        }
        System.out.println("Sum with explicit unboxing = " + sum);

        // Suma de números pares usando unboxing implícito (autoboxing)
        sum = 0;
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        System.out.println("Sum with autoboxing = " + sum);
    }
}
