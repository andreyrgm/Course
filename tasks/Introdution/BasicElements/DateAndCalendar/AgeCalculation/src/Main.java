import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 *
 * <p>Convierte la fecha de nacimiento en formato de cadena (String) a un objeto {@link java.util.Date}
 * y calcula la edad en años con base en la fecha actual.</p>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        out.println("Please enter your date of birth (dd-MM-yyyy): ");
        String dateOfBirthInput = sc.next();

        try {
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthInput, formatter);
            LocalDate currentDate = LocalDate.now();

            int age = Period.between(dateOfBirth, currentDate).getYears();
            out.println("You are " + age + " years old.");
        } catch (DateTimeParseException e) {
            out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        }
    }
}
