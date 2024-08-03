import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Ejemplo del uso del operador ternario en Java.
 */
public class Ternary {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "if true" : "if false";
        out.println("variable = " + variable);

        double math, science, history, average;
        String state = "";

        Scanner sc = new Scanner(in);

        math = readNote(sc, "Math");
        science = readNote(sc, "Science");
        history = readNote(sc, "History");

        average = (math + science + history) / 3;
        out.println("average = " + average);

        state = average >= 5.49 ? "Approved" : "Rejected";
        out.println("state = " + state);
    }

    private static double readNote(Scanner sc, String subject) {
        double note;
        do {
            out.printf("Enter the note of %s between 2.0 - 7.0:%n", subject);
            while (!sc.hasNextDouble()) {
                out.println("Invalid entry. Please enter a number.");
                sc.next();
            }
            note = sc.nextDouble();
            if (note < 2.0 || note > 7.0) {
                out.println("The note must be between 2.0 and 7.0. Try again.");
            }
        } while (note < 2.0 || note > 7.0);
        return note;
    }
}
