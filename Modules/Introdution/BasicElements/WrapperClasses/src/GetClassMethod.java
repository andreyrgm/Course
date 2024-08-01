import java.lang.reflect.Method;

import static java.lang.System.out;

/**
 * Ejemplo que muestra cómo usar reflexión en Java para obtener información sobre clases y métodos.
 */
public class GetClassMethod {
    public static void main(String[] args) {
        String text = "Hi, how are things!";
        var strClass = text.getClass();

        out.println("Example 1: String class information");
        out.println("Full class name: " + strClass.getName());
        out.println("Simple class name: " + strClass.getSimpleName());
        out.println("Class package name: " + strClass.getPackageName());
        out.println("Class String: " + strClass);

        out.println("\nExample 2: Methods of the String class");
        for (Method method : strClass.getMethods()) {
            out.println("String method: " + method.getName());
        }

        Integer num = 34;
        var intClass = num.getClass();
        Class<?> objClass = intClass.getSuperclass().getSuperclass();

        out.println("\nExample 3: Information about the Integer class and its superclasses");
        out.println("Integer parent class: " + intClass.getSuperclass());
        out.println("Integer parent parent class: " + objClass);

        out.println("\nExample 4: Methods of the Object class");
        for (Method method : objClass.getMethods()) {
            out.println("Object Method: " + method.getName());
        }
    }
}
