package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso de tipos primitivos y sus propiedades en Java.
 */
public class Primitive {
    public static void main(String[] args) {
        out.println("Example 1: Primitive type byte");
        byte numByte = 127;
        out.println("numByte = " + numByte);
        out.println("Byte type in bytes: " + Byte.BYTES);
        out.println("Byte type in bits: " + Byte.SIZE);
        out.println("Maximum value of a byte: " + Byte.MAX_VALUE);
        out.println("Minimum value of a byte: " + Byte.MIN_VALUE);

        out.println("\nExample 2: Primitive type short");
        short numShort = 32767;
        out.println("numShort = " + numShort);
        out.println("Short type in bytes: " + Short.BYTES);
        out.println("Short type in bits: " + Short.SIZE);
        out.println("Maximum value of a short: " + Short.MAX_VALUE);
        out.println("Minimum value of a short: " + Short.MIN_VALUE);

        out.println("\nExample 3: Primitive type int");
        int numInt = 2147483647;
        out.println("numInt = " + numInt);
        out.println("Int type in bytes: " + Integer.BYTES);
        out.println("Int type in bits: " + Integer.SIZE);
        out.println("Maximum value of an int: " + Integer.MAX_VALUE);
        out.println("Minimum value of an int: " + Integer.MIN_VALUE);

        out.println("\nExample 4: Primitive type long");
        long numLong = 9223372036854775807L;
        out.println("numLong = " + numLong);
        out.println("Long type in bytes: " + Long.BYTES);
        out.println("Long type in bits: " + Long.SIZE);
        out.println("Maximum value of a long: " + Long.MAX_VALUE);
        out.println("Minimum value of a long: " + Long.MIN_VALUE);

        out.println("\nExample 5: Primitive type float");
        float numFloat = 0.00000000015f;
        out.println("numFloat = " + numFloat);
        out.println("Float type in bytes: " + Float.BYTES);
        out.println("Float type in bits: " + Float.SIZE);
        out.println("Maximum value of a float: " + Float.MAX_VALUE);
        out.println("Minimum value of a float: " + Float.MIN_VALUE);

        out.println("\nExample 6: Primitive type double");
        double numDouble = 3.4028235E39;
        out.println("numDouble = " + numDouble);
        out.println("Double type in bytes: " + Double.BYTES);
        out.println("Double type in bits: " + Double.SIZE);
        out.println("Maximum value of a double: " + Double.MAX_VALUE);
        out.println("Minimum value of a double: " + Double.MIN_VALUE);

        out.println("\nExample 7: Primitive type char");
        char character = '\u0040'; // El símbolo @ en Unicode
        char decimal = 64; // Valor decimal de '@'
        out.println("character = " + character);
        out.println("decimal = " + decimal);
        out.println("decimal == character: " + (decimal == character));

        char symbol = '@';
        out.println("symbol = " + symbol);
        out.println("symbol == character: " + (symbol == character));

        char space = '\u0020'; // Carácter de espacio
        char backspace = '\b'; // Carácter de retroceso
        char tab = '\t'; // Carácter de tabulación
        char newline = '\n'; // Carácter de nueva línea
        char carriageRetur = '\r'; // Carácter de retorno de carro

        out.println("Char type in bytes: " + Character.BYTES);
        out.println("Char type in bits: " + Character.SIZE);
        out.println("Minimum char value: " + Character.MIN_VALUE);
        out.println("Maximum char value: " + Character.MAX_VALUE);

        out.println("\nExample 8: Primitive type boolean");
        boolean logicalData = true;
        out.println("logicalData = " + logicalData);

        out.println("\nExample 9: Operations with float and double primitive types");
        double d = 98765.43e-3; // 98.76543
        out.println("d = " + d);

        float f = 1.2345e2f; // 123.45
        out.println("f = " + f);

        logicalData = d < f;
        out.println("logicalData = " + logicalData);

        boolean isEqual = (3 - 2 == 1);
        out.println("isEqual = " + isEqual);
    }
}
