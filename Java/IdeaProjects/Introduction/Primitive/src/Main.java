public class Main {
    public static void main(String[] args) {
        demonstrateByte();
        demonstrateShort();
        demonstrateInt();
        demonstrateLong();
        demonstrateFloat();
        demonstrateDouble();
        demonstrateVar();
        demonstrateChar();
        demonstrateBoolean();
        demonstrateDoubleAndFloatComparison();
    }

    /**
     * Demuestra el uso del tipo de dato byte.
     */
    private static void demonstrateByte() {
        byte byteNum = 127;
        System.out.println("byteNum = " + byteNum);
        System.out.println("Byte type corresponds in bytes to " + Byte.BYTES);
        System.out.println("Byte type corresponds in bits to " + Byte.SIZE);
        System.out.println("Max value of a byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of a byte: " + Byte.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato short.
     */
    private static void demonstrateShort() {
        short shortNum = 32767;
        System.out.println("shortNum = " + shortNum);
        System.out.println("Short type corresponds in bytes to " + Short.BYTES);
        System.out.println("Short type corresponds in bits to " + Short.SIZE);
        System.out.println("Max value of a short: " + Short.MAX_VALUE);
        System.out.println("Min value of a short: " + Short.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato int.
     */
    private static void demonstrateInt() {
        int intNum = 2147483647;
        System.out.println("intNum = " + intNum);
        System.out.println("Int type corresponds in bytes to " + Integer.BYTES);
        System.out.println("Int type corresponds in bits to " + Integer.SIZE);
        System.out.println("Max value of an int: " + Integer.MAX_VALUE);
        System.out.println("Min value of an int: " + Integer.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato long.
     */
    private static void demonstrateLong() {
        long longNum = 9223372036854775807L;
        System.out.println("longNum = " + longNum);
        System.out.println("Long type corresponds in bytes to " + Long.BYTES);
        System.out.println("Long type corresponds in bits to " + Long.SIZE);
        System.out.println("Max value of a long: " + Long.MAX_VALUE);
        System.out.println("Min value of a long: " + Long.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato float.
     */
    private static void demonstrateFloat() {
        float floatNum = 3.4028235E38f;
        System.out.println("floatNum = " + floatNum);
        System.out.println("Float type corresponds in bytes to " + Float.BYTES);
        System.out.println("Float type corresponds in bits to " + Float.SIZE);
        System.out.println("Max value of a float: " + Float.MAX_VALUE);
        System.out.println("Min value of a float: " + Float.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato double.
     */
    private static void demonstrateDouble() {
        double doubleNum = 1.7976931348623157E308;
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("Double type corresponds in bytes to " + Double.BYTES);
        System.out.println("Double type corresponds in bits to " + Double.SIZE);
        System.out.println("Max value of a double: " + Double.MAX_VALUE);
        System.out.println("Min value of a double: " + Double.MIN_VALUE);
    }

    /**
     * Demuestra el uso de la palabra clave var para la inferencia de tipos.
     */
    private static void demonstrateVar() {
        var varNum = 1.7976931348623157E308;
        System.out.println("varNum = " + varNum);
    }

    /**
     * Demuestra el uso del tipo de dato char y sus diferentes representaciones.
     */
    private static void demonstrateChar() {
        char character = '\u0040'; // Carácter '@' en Unicode
        char decimal = 64; // Carácter '@' en decimal
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == character: " + (decimal == character));

        char symbol = '@'; // Carácter '@' en ASCII
        System.out.println("symbol = " + symbol);
        System.out.println("symbol == character: " + (symbol == character));

        System.out.println("Character type corresponds in bytes to " + Character.BYTES);
        System.out.println("Character type corresponds in bits to " + Character.SIZE);
        System.out.println("Max value of a character: " + Character.MAX_VALUE);
        System.out.println("Min value of a character: " + Character.MIN_VALUE);
    }

    /**
     * Demuestra el uso del tipo de dato boolean.
     */
    private static void demonstrateBoolean() {
        boolean logicalData = true;
        System.out.println("logicalData = " + logicalData);

        logicalData = 3 - 2 == 1; // Evaluación de una expresión lógica
        System.out.println("isEqual = " + logicalData);
    }

    /**
     * Demuestra la comparación entre valores de tipo double y float.
     */
    private static void demonstrateDoubleAndFloatComparison() {
        double d = 98.76543;
        System.out.println("d = " + d);

        float f = 123.45f;
        System.out.println("f = " + f);

        boolean logicalData = d > f; // Comparación entre double y float
        System.out.println("logicalData = " + logicalData);
    }
}
