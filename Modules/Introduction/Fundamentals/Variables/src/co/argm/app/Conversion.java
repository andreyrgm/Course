package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de conversiones de tipos en Java.
 */
public class Conversion {
    public static void main(String[] args) {
        out.println("Example 1: Conversion from String to int");
        String numStr = "50";
        int numInt = Integer.parseInt(numStr);
        out.println("numInt = " + numInt);

        out.println("\nExample 2: Converting String to double");
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        out.println("realDouble = " + realDouble);

        out.println("\nExample 3: Conversion from String to boolean");
        String logicalStr = "TruE";
        boolean logicalBoolean = Boolean.parseBoolean(logicalStr);
        out.println("logicalBoolean = " + logicalBoolean);

        out.println("\nExample 4: Conversion from int to String");
        int NumeroInt2 = 100;
        out.println("NumeroInt2 = " + NumeroInt2);
        String NumeroStr2 = Integer.toString(NumeroInt2);
        out.println("NumeroStr2 = " + NumeroStr2);

        out.println("\nExample 5: Using String.valueOf to convert int to String");
        NumeroStr2 = String.valueOf(NumeroInt2 + 10);
        out.println("NumeroStr2 = " + NumeroStr2);

        out.println("\nExample 6: Converting double to String");
        double RealDouble2 = 1.23456e2;
        String RealStr2 = Double.toString(RealDouble2);
        out.println("RealStr2 = " + RealStr2);

        out.println("\nExample 7: Using String.valueOf to convert from float to String");
        RealStr2 = String.valueOf(1.23456e2f);
        out.println("RealStr2 = " + RealStr2);

        out.println("\nExample 8: Conversion from int to short (with possible loss of precision)");
        int i = 22768;
        short s = (short) i;
        out.println("s = " + s);
        out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        out.println("\nExample 9: Conversion from int to long");
        long l = i;
        out.println("l = " + l);

        out.println("\nExample 10: Converting int to char");
        char b = (char) i;
        out.println("b = " + b);

        out.println("\nExample 11: Conversion from int to float");
        out.println("f = " + (float) i);
    }
}
