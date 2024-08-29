package co.argm.app;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejando decimales en las notas (double).
 * Mostrar el promedio de las notas mayores a 5, el promedio de notas inferiores a 4, y la cantidad de notas 1.
 * Además, mostrar el promedio total.
 * <p>
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
 * los cálculos (contadores, sumas).
 * <p>
 * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */
public class Main {
    public static void main(String[] args) {
        final int NUM_GRADES = 20;
        Scanner sc = new Scanner(in);

        int countGrade1 = 0;
        int countGradesAbove5 = 0;
        int countGradesBelow4 = 0;
        double sumGradesAbove5 = 0;
        double sumGradesBelow4 = 0;
        double totalSum = 0;

        boolean error = false;

        for (int i = 0; i < NUM_GRADES; i++) {
            out.printf("Enter a grade (between 1 and 7) N%d: ", i + 1);
            double grade = sc.nextDouble();

            if (grade == 0) {
                error = true;
                break;
            }

            if (grade == 1) {
                countGrade1++;
            } else if (grade > 5) {
                countGradesAbove5++;
                sumGradesAbove5 += grade;
            } else if (grade < 4) {
                countGradesBelow4++;
                sumGradesBelow4 += grade;
            }

            totalSum += grade;
        }

        if (error) {
            err.println("Error: Grades cannot be 0, the program has terminated.");
            return;
        }

        out.println("The number of grade 1 is: " + countGrade1);

        if (countGradesAbove5 > 0) {
            double averageGradesAbove5 = sumGradesAbove5 / countGradesAbove5;
            out.printf("Average of grades above 5: %.2f%n", averageGradesAbove5);
        } else {
            out.println("Cannot calculate the average of grades above 5");
        }

        if (countGradesBelow4 > 0) {
            double averageGradesBelow4 = sumGradesBelow4 / countGradesBelow4;
            out.printf("Average of grades below 4: %.2f%n", averageGradesBelow4);
        } else {
            out.println("Cannot calculate the average of grades below 4");
        }

        double totalAverageGrades = totalSum / NUM_GRADES;
        out.printf("Total average of grades: %.2f%n", totalAverageGrades);
    }
}
