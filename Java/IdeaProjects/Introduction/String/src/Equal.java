public class Equal {
    public static void main(String[] args) {
        String course = "Java programming";
        String course2 = new String("Java programming");

        // Comparación de referencias de objetos
        boolean isEqual = course == course2;
        System.out.println("course == course2 = " + isEqual);

        // Comparación de contenido de cadenas
        isEqual = course.equals(course2);
        System.out.println("course.equals(course2) = " + isEqual);

        String course3 = "Java programming";
        isEqual = course == course3;
        System.out.println("course == course3 = " + isEqual);
    }
}
