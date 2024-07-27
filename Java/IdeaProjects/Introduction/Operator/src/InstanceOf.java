public class InstanceOf {
    public static void main(String[] args) {
        // Crear diferentes tipos de objetos
        Object text = "Hello WorldCreating an object of the String class... how about it!";
        Number num = Integer.valueOf(7); // Integer object
        Number flo = Float.valueOf(3.14f); // Float object

        // Verificar si 'text' es una instancia de String
        Boolean bool = text instanceof String;
        System.out.println("Text is type String = " + bool);

        // Verificar si 'text' es una instancia de Object
        bool = text instanceof Object;
        System.out.println("Text is type Object = " + bool);

        // Verificar si 'text' es una instancia de Integer
        bool = text instanceof Integer;
        System.out.println("Text is type Integer = " + bool);

        // Verificar si 'num' es una instancia de Integer
        bool = num instanceof Integer;
        System.out.println("Number is type Integer = " + bool);

        // Verificar si 'num' es una instancia de Number
        bool = num instanceof Number;
        System.out.println("Number is type Number = " + bool);

        // Verificar si 'num' es una instancia de Object
        bool = num instanceof Object;
        System.out.println("Number is type Object = " + bool);

        // Verificar si 'num' es una instancia de Long
        bool = num instanceof Long;
        System.out.println("Number is type Long = " + bool);

        // Verificar si 'flo' es una instancia de Double
        bool = flo instanceof Double;
        System.out.println("Number is type Double = " + bool);

        // Verificar si 'flo' es una instancia de Float
        bool = flo instanceof Float;
        System.out.println("Number is type Float = " + bool);

        // Verificar si 'flo' es una instancia de Integer
        bool = flo instanceof Integer;
        System.out.println("Number is type Integer = " + bool);

        // Verificar si 'flo' es una instancia de Number
        bool = flo instanceof Number;
        System.out.println("Number is type Number = " + bool);

        // Verificar si 'bool' es una instancia de Boolean
        bool = bool instanceof Boolean;
        System.out.println("Boolean is type Boolean = " + bool);
    }
}
