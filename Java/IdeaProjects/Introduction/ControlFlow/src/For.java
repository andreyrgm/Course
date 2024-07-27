public class For {
    public static void main(String[] args) {
        // Bucle for simple que cuenta de 0 a 10
        System.out.println("=== For loop that counts from 0 to 10 ===");
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // Bucle for que cuenta de 10 a 0
        System.out.println("\n=== For loop that counts from 10 to 0 ===");
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
        // Bucle for que utiliza dos variables, i incrementa y j decrementa
        System.out.println("\n=== For loop with two variables (i increments, j decrements) ===");
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }

        // Bucle for que imprime solo los números pares de 0 a 10
        System.out.println("\n=== For loop that prints only even numbers from 0 to 10 ===");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
