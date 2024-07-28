import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {
        String text = "Hi how are things!";

        // Obtener la clase del objeto String
        Class<?> strClass = text.getClass();

        // Imprimir información sobre la clase
        System.out.println("Full name of the class: " + strClass.getName());
        System.out.println("Simple name of the class: " + strClass.getSimpleName());
        System.out.println("Package name of the class: " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        // Imprimir nombres de los métodos de la clase String
        for (Method method : strClass.getMethods()) {
            System.out.println("Method: " + method.getName());
        }

        // Trabajar con la clase Integer
        Integer num = 34;
        Class<?> intClass = num.getClass();
        Class<?> objClass = intClass.getSuperclass().getSuperclass();

        // Imprimir información sobre las superclases
        System.out.println("Integer Superclass: " + intClass.getSuperclass());
        System.out.println("Superclass of Integer superclass: " + objClass);

        // Imprimir nombres de los métodos de la clase Integer
        for (Method method : intClass.getMethods()) {
            System.out.println("Method: " + method.getName());
        }
    }
}
