package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de uso de operadores de asignación en Java.
 */
public class Assignation {
    public static void main(String[] args) {
        out.println("Example 1: Initial Allocation");
        int i = 5;
        int j = i + 4;
        out.println("Initial value of i = " + i);
        out.println("Initial value of j = " + j);

        out.println("\nExample 2: Assignment Operator +=");
        i += 2; // i = i + 2
        out.println("After i += 2, i = " + i);

        i += 5; // i = i + 5
        out.println("After i += 5, i =" + i);

        out.println("\nExample 3: Assignment operator -=");
        j -= 4; // j = j - 4
        out.println("After j -= 4, j = " + j);

        out.println("\nExample 4: Assignment Operator *=");
        j *= 3; // j = j * 3;
        out.println("After j *= 3, j = " + j);

        out.println("\nExample 5: String concatenation with +=");
        String sqlString = "SELECT * FROM clients AS c";
        sqlString += " WHERE c.name = 'Andrey'";
        sqlString += " AND c.active = 1";
        out.println("Consult SQL generate: " + sqlString);
    }
}
