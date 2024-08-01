import java.util.Scanner;

import static java.lang.System.*;

/**
 * Ejemplo de uso de la sentencia switch en Java para manejar diferentes casos.
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.println("Example 1: Enter the month number between 1 - 12:");
        int month = sc.nextInt();

        String nameMonth = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "indefinite";
        };

        out.println("nameMonth = " + nameMonth);

        out.println("\nExample 2: Evaluation of a character");
        char character = 'z';

        switch(character){
            case '0':
                out.println("The number is zero");
                break;
            case '1':
                out.println("The number is one");
                break;
            case '2':
                out.println("The number is two");
                break;
            case '3':
                out.println("The number is three");
                break;
            case 'a':
                out.println("The character is 'a'");
                break;
            default:
                out.println("Unknown number or character");
        }

        out.println("\nExample 3: Evaluation of a username");
        String name = "juan";
        switch(name){
            case "admin":
                out.println("Hello admin, welcome!");
                break;
            case "andrey":
                out.println("Hello Andrey!");
                break;
            case "pepe":
                out.println("Hello Pepe");
                break;
            default:
                out.println("Unknown user!");
        }
    }
}
