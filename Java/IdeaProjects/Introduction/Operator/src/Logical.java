public class Logical {
    public static void main(String[] args) {
        // Declaración de variables de diferentes tipos
        int i = 3;
        byte j = 3;
        float k = 127e-7f; // 127 * 10^-7
        double l = 2.1413e3; // 2.1413 * 10^3
        boolean m = false;

        // Operadores lógicos AND (&&) y OR (||)
        boolean b1 = i == j && k < l && !m;
        System.out.println("i == j && k < l && !m: " + b1); // Verdadero si todas las condiciones son verdaderas

        boolean b2 = i == j || k < l;
        System.out.println("i == j || k < l: " + b2); // Verdadero si al menos una de las condiciones es verdadera

        boolean b3 = i == j && (k < l || m == true);
        System.out.println("i == j && (k < l || m == true): " + b3); // Verdadero si i == j y al menos una de las otras condiciones es verdadera

        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("(i == j || k < l) && m == true: " + b4); // Verdadero si al menos una de las primeras condiciones es verdadera y m es true

        boolean b5 = (true || true) && false;
        System.out.println("(true || true) && false: " + b5); // Verdadero si true AND false es verdadera

        boolean b6 = true || false && false || false;
        System.out.println("true || false && false || false: " + b6); // Orden de operaciones: AND se evalúa antes de OR

        boolean b7 = ((true || false) && false) || false;
        System.out.println("((true || false) && false) || false: " + b7); // Paréntesis cambian el orden de evaluación
    }
}
