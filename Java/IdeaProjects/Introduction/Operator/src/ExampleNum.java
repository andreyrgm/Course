import java.util.Scanner;

public class ExampleNum {
    public static void main(String[] args) {
        int max = 0;

        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese los cuatro números
        System.out.println("Enter num");
        int num = sc.nextInt();

        System.out.println("Enter a 2nd num");
        int num2 = sc.nextInt();

        System.out.println("Enter a 3rd num");
        int num3 = sc.nextInt();

        System.out.println("Enter 4th num");
        int num4 = sc.nextInt();

        // Determinar el número más grande usando el operador ternario
        max = (num > num2) ? num : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        // Mostrar los números ingresados y el número más grande
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("The largest number is: " + max);
    }
}
