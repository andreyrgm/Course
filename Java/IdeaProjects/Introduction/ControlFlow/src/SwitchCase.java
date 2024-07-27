import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Obtener y mostrar el nombre del mes
        System.out.println("=== Month Name ===");
        System.out.println("Enter the month number between 1 - 12:");
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
            default -> "Undefined";
        };
        System.out.println("Month = " + nameMonth);

        // Evaluar y mostrar el valor de num
        System.out.println("\n=== Evaluation of num ===");
        int num = 'a';
        switch (num) {
            case 0:
                System.out.println("num is zero");
                break;
            case 1:
                System.out.println("num is one");
                break;
            case 2:
                System.out.println("num is two");
                break;
            case 3:
                System.out.println("num is three");
                break;
            case 'a':
                System.out.println("the char is a");
                break;
            default:
                System.out.println("Unknown num or char");
        }

        // Evaluar y mostrar el saludo para el nombre de usuario
        System.out.println("\n=== User Greeting ===");
        String name = "andrey";
        switch (name) {
            case "admin":
                System.out.println("Hello admin, welcome!");
                break;
            case "andrey":
                System.out.println("Hello andrey!");
                break;
            case "pepe":
                System.out.println("Hello pepe!");
                break;
            default:
                System.out.println("Unknown user");
        }
    }
}
