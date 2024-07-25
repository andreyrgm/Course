public class Main {
    public static void main(String[] args) {
        demonstrateStringToPrimitive();
        demonstratePrimitiveToString();
        demonstratePrimitiveCasting();
    }

    /**
     * Demuestra la conversión de cadenas a tipos de datos primitivos.
     */
    private static void demonstrateStringToPrimitive() {
        String strNum = "50";
        int intNum = Integer.parseInt(strNum);
        System.out.println("intNum = " + intNum);

        String strReal = "98765.43";
        double doubleReal = Double.parseDouble(strReal);
        System.out.println("doubleReal = " + doubleReal);

        String strLogic = "true";
        boolean booleanLogic = Boolean.parseBoolean(strLogic);
        System.out.println("booleanLogic = " + booleanLogic);
    }

    /**
     * Demuestra la conversión de tipos de datos primitivos a cadenas.
     */
    private static void demonstratePrimitiveToString() {
        int intNum2 = 100;
        String strNum2 = Integer.toString(intNum2);
        System.out.println("strNum2 = " + strNum2);

        strNum2 = String.valueOf(intNum2);
        System.out.println("strNum2 = " + strNum2);

        double doubleReal2 = 1.23456;
        String strReal2 = Double.toString(doubleReal2);
        System.out.println("strReal2 = " + strReal2);

        strReal2 = String.valueOf(1.23456f);
        System.out.println("strReal2 = " + strReal2);
    }

    /**
     * Demuestra la conversión (casting) entre diferentes tipos de datos primitivos.
     */
    private static void demonstratePrimitiveCasting() {
        int i = 22768;

        short s = (short) i;
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);

        char c = (char) i;
        System.out.println("c = " + c);

        float f = i;
        System.out.println("f = " + f);
    }
}
