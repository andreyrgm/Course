public class Precedence {
    public static void main(String[] args) {
        double i = 14;
        double j = 8;
        double k = 20;

        // Calcular el promedio de i, j y k
        double average = (i + j + k) / 3;
        System.out.println("average = " + average); // Debería imprimir 14.0

        // Calcular el promedio y multiplicar el resultado por 10
        average = (i + j + k) / 3 * 10;
        System.out.println("average = " + average); // Debería imprimir 140.0

        // Precedencia de operadores: decremento de i, incremento de j y cálculo del promedio
        average = --i + j++ + k / 3 * 10;
        System.out.println("average = " + average); // Debería imprimir 85.6666...
        System.out.println("i = " + i); // Debería imprimir 13.0, debido a --i
        System.out.println("j = " + j); // Debería imprimir 9.0, debido a j++
    }
}
