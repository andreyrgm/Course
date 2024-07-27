import java.util.Scanner;

public class SwitchCaseMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número del mes y el año
        System.out.println("Enter the month number (1 - 12):");
        int month = sc.nextInt();
        System.out.println("Enter the year (YYYY):");
        int year = sc.nextInt();

        // Calcular el número de días del mes
        int numDays = getNumberOfDays(month, year);

        // Mostrar el número de días o un mensaje de error
        if (numDays == -1) {
            System.out.println("Invalid month number");
        } else {
            System.out.println("Number of days = " + numDays);
        }
    }

    // Método para obtener el número de días en un mes dado el número del mes y el año
    private static int getNumberOfDays(int month, int year) {
        int numDays;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                // Determinar si el año es bisiesto
                numDays = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                break;
            default:
                numDays = -1;
                break;
        }
        return numDays;
    }
}
