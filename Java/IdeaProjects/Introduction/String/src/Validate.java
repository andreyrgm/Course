public class Validate {
    public static void main(String[] args) {
        String course = null;

        // Verificar si la cadena es nula
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        // Asignar un valor a la cadena si es nula
        if (isNull) {
            course = "Java programming";
        }

        // Verificar si la cadena está vacía usando el método length()
        boolean isEmpty = course.length() == 0;
        System.out.println("isEmpty = " + isEmpty);

        // Verificar si la cadena está vacía usando el método isEmpty()
        boolean isEmpty2 = course.isEmpty();
        System.out.println("isEmpty2 = " + isEmpty2);

        // Verificar si la cadena contiene solo espacios en blanco usando el método isBlank()
        boolean isBlank = course.isBlank();
        System.out.println("isBlank = " + isBlank);

        // Si la cadena no está vacía ni contiene solo espacios en blanco, imprimir en mayúsculas y dar la bienvenida
        if (!isBlank) {
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course ".concat(course));
        }
    }
}
