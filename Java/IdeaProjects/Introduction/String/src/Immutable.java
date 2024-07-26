public class Immutable {
    public static void main(String[] args) {
        String course = "Java Programming";
        String teacher = "Andrés Guzmán";

        // Concatenación de cadenas
        String result = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println("course == result: " + (course == result));

        // Transformación de cadena usando el método 'transform'
        String result2 = course.transform(c -> c + " with " + teacher);
        System.out.println("course = " + course);
        System.out.println("result2 = " + result2);

        // Reemplazo de caracteres en una cadena
        String result3 = result.replace("a", "A");
        System.out.println("result = " + result);
        System.out.println("result3 = " + result3);
    }
}
