public class RelationalOperator {
    public static void main(String[] args) {
        // Creación de objetos Integer
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1; // num2 referencia al mismo objeto que num1

        // Imprimir valores iniciales
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Comparar referencias de objetos
        System.out.println("Are they the same object? " + (num1 == num2));

        // Asignar un nuevo valor a num2
        num2 = 1000; // Autoboxing, crea un nuevo objeto Integer si el valor es mayor a 127

        // Imprimir valores después de la reasignación
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Comparar referencias de objetos después de la reasignación
        System.out.println("Are they the same object? " + (num1 == num2));

        // Comparar valores de los objetos
        System.out.println("Do they have the same value? " + num1.equals(num2));
        System.out.println("Do they have the same value? " + (num1.intValue() == num2.intValue()));

        // Comparar valores usando operadores relacionales
        num2 = 500;
        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);

        boolean condition2 = num1.intValue() < num2.intValue();
        System.out.println("condition2 = " + condition2);
    }
}
