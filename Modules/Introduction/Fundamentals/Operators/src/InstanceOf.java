import static java.lang.System.out;

/**
 * Ejemplo del uso del operador instanceof con tipos genéricos en Java.
 */
public class InstanceOf {
    public static void main(String[] args) {

        Object text = "Creating an object of class String... how about it!";
        Number num = 7; // 7 como instancia de Integer

        boolean b1 = text instanceof String;
        out.println("text is of type String = " + b1); // true

        b1 = text instanceof Object;
        out.println("text is of type Object = " + b1); // true

        b1 = text instanceof Integer;
        out.println("text is of type Integer = " + b1); // false

        b1 = num instanceof Integer;
        out.println("num is of type Integer = " + b1); // true

        b1 = num instanceof Number;
        out.println("num is of type Number = " + b1); // true

        b1 = num instanceof Object;
        out.println("num is of type Object = " + b1); // true

        b1 = num instanceof Long;
        out.println("num is of type Long = " + b1); // false

        b1 = num instanceof Double;
        out.println("num is of type Double = " + b1); // false

        Number decimal = Float.valueOf(45.54f);

        b1 = decimal instanceof Double;
        out.println("decimal is of type Double = " + b1); // false

        b1 = decimal instanceof Float;
        out.println("decimal is of type Float = " + b1); // true

        b1 = decimal instanceof Integer;
        out.println("decimal is of type Integer = " + b1); // false

        b1 = decimal instanceof Number;
        out.println("decimal is of type Number = " + b1); // true
    }
}
