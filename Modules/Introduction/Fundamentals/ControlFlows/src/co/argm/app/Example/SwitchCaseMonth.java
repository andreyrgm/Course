package co.argm.app.Example;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Clase que determina el número de días de un mes en un año específico.
 */
public class SwitchCaseMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("Enter the month number (1 - 12):");
        int month = sc.nextInt();

        out.println("Enter year (YYYY):");
        int year = sc.nextInt();

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
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                numDays = -1;
                out.println("Invalid month.");
                break;
        }

        if (numDays != -1) {
            out.println("The number of days in the month " + month + " of the year " + year + " is " + numDays);
        }
    }
}