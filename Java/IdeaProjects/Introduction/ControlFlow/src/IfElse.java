public class IfElse {
    public static void main(String[] args) {
        double average = 5.8;
        // Llamar al método para evaluar el promedio
        evaluateAverage(average);
    }

    // Método para evaluar y mostrar el promedio
    private static void evaluateAverage(double average) {
        if (average >= 6.5) {
            System.out.println("Congratulations, excellent average");
        } else if (average >= 6) {
            System.out.println("Very good average");
        } else if (average >= 5.5) {
            System.out.println("Good average");
        } else if (average >= 5) {
            System.out.println("Regular, you need to try a little harder!");
        } else if (average >= 4) {
            System.out.println("Insufficient, you need to study more!");
        } else {
            System.out.println("Reprobate!");
        }

        System.out.println("Your average is " + average);
    }
}
