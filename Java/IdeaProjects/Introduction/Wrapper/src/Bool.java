public class Bool {
    public static void main(String[] args) {
        // Declaración y asignación de valores Integer
        Integer num1 = 1;
        Integer num2 = 2;

        // Comparación de valores Integer para obtener un booleano primitivo
        boolean boolPrim = num1 > num2; // false

        // Creación de objetos Boolean a partir de un booleano primitivo y un String
        Boolean boolObject = Boolean.valueOf(boolPrim);
        Boolean boolObject2 = Boolean.valueOf("false");
        Boolean boolObject3 = true; // Autoboxing de boolean a Boolean

        // Imprimir valores booleanos
        System.out.println("boolPrim = " + boolPrim);
        System.out.println("boolObject = " + boolObject);
        System.out.println("boolObject2 = " + boolObject2);

        // Comparar referencias de objetos Boolean
        System.out.println("Are (boolObject and boolObject2) the same object?" + (boolObject == boolObject2));
        System.out.println("Are (boolObject and boolObject3) the same object?" + (boolObject == boolObject3));
        System.out.println("Are (boolObject2 and boolObject3) the same object?" + (boolObject2 == boolObject3));

        // Comparar valores de objetos Boolean
        System.out.println("Do (boolObject and boolObject2) have the same value? " + boolObject.equals(boolObject2));

        // Convertir objeto Boolean a booleano primitivo
        boolean boolPrim2 = boolObject2.booleanValue();
        System.out.println("boolPrim2 = " + boolPrim2);
    }
}
