import static java.lang.System.out;

/**
 * Ejemplo de uso de Integer y conversiones entre diferentes tipos numéricos en Java.
 */
public class IntegerWrapper {
    public static void main(String[] args) {
        int primitiveInt = 32768;

        out.println("Example 1: Creating Integer Objects from Primitive Type");
        Integer intObject = Integer.valueOf(primitiveInt); // Usando valueOf para crear el objeto Integer
        Integer intObject2 = primitiveInt; // Autoboxing, crea un nuevo Integer
        out.println("intObject = " + intObject);

        out.println("\nExample 2: Converting Integer to int primitive type");
        int num = intObject; // Unboxing automático
        out.println("num = " + num);

        out.println("\nExample 3: Converting Integer to int primitive type using intValue()");
        int num2 = intObject.intValue(); // Método intValue() para obtener el valor primitivo
        out.println("num2 = " + num2);

        out.println("\nExample 4: Conversion from String to Integer");
        String LCDTVValue = "67000";
        Integer value = Integer.valueOf(LCDTVValue); // Conversión de String a Integer
        out.println("value = " + value);

        out.println("\nExample 5: Converting Integer to Other Numeric Types");
        Short shortObject = intObject.shortValue(); // Conversión a Short
        out.println("shortObject = " + shortObject);

        Byte byteObject = intObject.byteValue(); // Conversión a Byte
        out.println("byteObject = " + byteObject);

        Long longObject = intObject.longValue(); // Conversión a Long
        out.println("longObject = " + longObject);
    }
}
