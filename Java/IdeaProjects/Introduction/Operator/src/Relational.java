public class Relational {
    public static void main(String[] args) {
        // Declaración de variables de diferentes tipos
        int i = 3;
        byte j = 7;
        float k = 127e-7f; // 127 * 10^-7
        double l = 2.1413e3; // 2.1413 * 10^3
        boolean m = false;

        // Operadores de igualdad
        boolean b1 = i == j;
        System.out.println("i == j = " + b1); // i igual a j

        boolean b2 = !b1;
        System.out.println("!b1 = " + b2); // No igual a (i igual a j)

        boolean b3 = i != j;
        System.out.println("i != j = " + b3); // i no igual a j

        boolean b4 = m == true;
        System.out.println("m == true = " + b4); // m igual a true

        boolean b5 = m != true;
        System.out.println("m != true = " + b5); // m no igual a true

        // Operadores de comparación
        boolean b6 = i > j;
        System.out.println("i > j = " + b6); // i mayor que j

        boolean b7 = j < i;
        System.out.println("j < i = " + b7); // j menor que i

        boolean b8 = l >= k;
        System.out.println("l >= k = " + b8); // l mayor o igual que k

        boolean b9 = l <= k;
        System.out.println("l <= k = " + b9); // l menor o igual que k
    }
}
