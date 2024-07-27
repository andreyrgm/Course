public class Unary {
    public static void main(String[] args) {
        // Ejemplo con un valor negativo
        int i = -5;
        int j = +i; // j = (1) * i => -5
        System.out.println("j = " + j);

        int k = -i; // k = (-1) * i => 5
        System.out.println("k = " + k);

        // Ejemplo con un valor positivo
        i = 6;
        j = +i; // j = (1) * i => 6
        System.out.println("j = " + j);

        k = -i; // k = (-1) * i => -6
        System.out.println("k = " + k);
    }
}
