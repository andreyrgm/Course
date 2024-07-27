import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        // Ejemplo de uso del operador ternario
        String var = 7 == 7 ? "If true" : "If false";
        System.out.println("var = " + var);

        double math = 0;
        double sciences = 0;
        double history = 0;

        Scanner sc = new Scanner(System.in);

        // Solicitar las calificaciones del usuario
        System.out.println("Please enter the math grade between 2 - 7");
        math = sc.nextDouble();
        System.out.println("Please enter the science grade between 2 - 7");
        sciences = sc.nextDouble();
        System.out.println("Please enter the history grade between 2 - 7");
        history = sc.nextDouble();

        // Calcular el promedio de las calificaciones
        double average = (math + sciences + history) / 3;
        System.out.println("Average = " + average);

        // Usar el operador ternario para determinar el estado de aprobación
        String state = average >= 5.49 ? "approved" : "failed";
        System.out.println("State = " + state);
    }
}
