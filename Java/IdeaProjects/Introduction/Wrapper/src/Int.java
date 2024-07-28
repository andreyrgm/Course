public class Int {
    public static void main(String[] args) {
        // Declaración y asignación de un valor primitivo int
        int intPrimitive = 32768;

        // Conversión de int a Integer usando valueOf (autoboxing)
        Integer intObject = Integer.valueOf(intPrimitive);
        Integer intObject2 = intPrimitive; // Autoboxing implícito

        // Imprimir los valores de Integer
        System.out.println("intObject = " + intObject);

        // Conversión de Integer a int (unboxing)
        int num = intObject.intValue();
        System.out.println("num = " + num);
        int num2 = intObject2; // Unboxing implícito
        System.out.println("num2 = " + num2);

        // Conversión de String a Integer usando valueOf
        String LCDTvValue = "67000";
        Integer value = Integer.valueOf(LCDTvValue);
        System.out.println("value = " + value);

        // Conversión de Integer a Short
        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);

        // Conversión de Integer a Byte
        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);

        // Conversión de Integer a Long
        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);
    }
}
