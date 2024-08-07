import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Programa para calcular el promedio de notas en matemáticas, historia y lenguaje de los estudiantes.
 */
public class StudentNotes {
    public static void main(String[] args) {
        double addMathNotes = 0, addNotesHistory = 0, addNotesLanguage = 0;
        double[] math = new double[7];
        double[] history = new double[7];
        double[] language = new double[7];

        Scanner sc = new Scanner(in);

        out.println("Enter 7 student notes for math:");
        for (int i = 0; i < math.length; i++) {
            math[i] = sc.nextDouble();
        }

        out.println("Enter 7 student notes for history:");
        for (int i = 0; i < history.length; i++) {
            history[i] = sc.nextDouble();
        }

        out.println("Enter 7 student notes for language:");
        for (int i = 0; i < language.length; i++) {
            language[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            addMathNotes += math[i];
            addNotesHistory += history[i];
            addNotesLanguage += language[i];
        }

        double averageMath = addMathNotes / math.length;
        double averageHistory = addNotesHistory / history.length;
        double averageLanguage = addNotesLanguage / language.length;

        double averageCourse = (averageMath + averageHistory + averageLanguage) / 3;

        out.println("Math class average: " + averageMath +
                "\nHistory class average: " + averageHistory +
                "\nLanguage class average: " + averageLanguage +
                "\nTotal course average: " + averageCourse);

        out.println("Enter the student ID (0 to 6): ");
        int id = sc.nextInt();

        if (id >= 0 && id < 7) {
            double averageStudentNotes = (math[id] + history[id] + language[id]) / 3;
            out.println("Average student No " + id + ": " + averageStudentNotes);
        } else {
            out.println("Invalid student ID.");
        }
    }
}
