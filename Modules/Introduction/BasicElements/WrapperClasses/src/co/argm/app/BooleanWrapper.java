package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso de los tipos primitivos boolean y su clase envoltorio Boolean en Java.
 */
public class BooleanWrapper {
    public static void main(String[] args) {
        Integer num1 = 1;
        Integer num2 = 2;

        boolean booleanPrimitive = num1 > num2;

        out.println("Example 1: Converting from boolean to Boolean");
        Boolean booleanObject = booleanPrimitive;
        Boolean booleanObject2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true; // Autoboxing

        out.println("booleanPrimitive = " + booleanPrimitive);
        out.println("booleanObject = " + booleanObject);
        out.println("booleanObject2 = " + booleanObject2);

        out.println("\nExample 2: Comparison of Boolean Objects");
        out.println("Comparing two Boolean objects with ==: " + (booleanObject2 == booleanObject));
        out.println("Comparing two Boolean objects with equals(): " + booleanObject.equals(booleanObject2));
        out.println("Comparing two Boolean objects (booleanObject2 with objBoolean3) with ==: " + (booleanObject2 == objBoolean3));
        out.println("Comparing two Boolean objects (booleanObject with objBoolean3) with ==: " + (booleanObject == objBoolean3));

        out.println("\nExample 3: Converting from Boolean to boolean");
        boolean booleanPrimitive2 = booleanObject2;
        out.println("booleanPrimitive2 = " + booleanPrimitive2);
    }
}
