import javax.swing.*;

public class Arithmetic {
    public static void main(String[] args) {
        // Inicialización de variables
        int i = 5, j = 4;

        // Suma
        int add = i + j;
        System.out.println("add = " + add);
        System.out.println("i + j = " + (i + j));

        // Resta
        int sub = i - j;
        System.out.println("sub = " + sub);
        System.out.println("i - j = " + (i - j));

        // Multiplicación
        int mul = i * j;
        System.out.println("mul = " + mul);
        System.out.println("i * j = " + (i * j));

        // División
        double div = (double) i / j;  // Conversión explícita a double para obtener una división decimal
        System.out.println("div = " + div);
        System.out.println("i / j = " + div);

        // Módulo
        int mod = i % j;
        System.out.println("mod = " + mod);
        System.out.println("i % j = " + (i % j));

        // Otro ejemplo de módulo
        mod = 8 % 5;
        System.out.println("mod = " + mod);

        // Ingreso de número por el usuario
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter num"));
        if (num % 2 == 0) {
            System.out.println("even number = " + num);
        } else {
            System.out.println("odd number = " + num);
        }
    }
}
