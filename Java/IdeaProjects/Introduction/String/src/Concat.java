public class Concat {
    public static void main(String[] args) {
        String course = "Java Programming";
        String teacher = "Andrés Guzmán";

        // Concatenación usando el operador '+'
        String detail = course + " with the instructor " + teacher;
        System.out.println(detail);

        int numA = 10;
        int numB = 5;

        // Concatenación de cadenas con la suma de enteros
        System.out.println(detail + (numA + numB));  // Primero suma los números, luego concatena el resultado con la cadena

        // Concatenación de enteros con cadenas
        System.out.println(numA + numB + detail);    // Primero suma los números y luego concatena el resultado con la cadena

        // Concatenación usando el método 'concat'
        String detail2 = course.concat(" with ").concat(teacher);
        System.out.println("detail2 = " + detail2);
    }
}
