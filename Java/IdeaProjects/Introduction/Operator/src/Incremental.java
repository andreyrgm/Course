public class Incremental {
    public static void main(String[] args) {
        // Pre-incremento: ++i incrementa y luego asigna
        int i = 1;
        int j = ++i; // i se incrementa a 2, luego j se asigna a 2
        System.out.println("Pre-increment:");
        System.out.println("i = " + i); // i = 2
        System.out.println("j = " + j); // j = 2

        // Post-incremento: i++ asigna y luego incrementa
        i = 2;
        System.out.println("\nPost-incremento:");
        System.out.println("Initial value of i = " + i); // i = 2
        j = i++; // j se asigna a 2, luego i se incrementa a 3
        System.out.println("i = " + i); // i = 3
        System.out.println("j = " + j); // j = 2

        // Pre-decremento: --i decrementa y luego asigna
        i = 3;
        j = --i; // i se decrementa a 2, luego j se asigna a 2
        System.out.println("\nPre-decrement:");
        System.out.println("i = " + i); // i = 2
        System.out.println("j = " + j); // j = 2

        // Post-decremento: i-- asigna y luego decrementa
        i = 4;
        j = i--; // j se asigna a 4, luego i se decrementa a 3
        System.out.println("\nPost-decremento:");
        System.out.println("i = " + i); // i = 3
        System.out.println("j = " + j); // j = 4

        // Demostración adicional de pre-incremento y post-incremento en el mismo valor de j
        System.out.println("\nAdditional demonstration:");
        System.out.println("j = " + (++j)); // j se incrementa a 5 y luego se imprime: 5
        System.out.println("j = " + (j++)); // j se imprime como 5 y luego se incrementa a 6
        System.out.println("j = " + j); // j se imprime como 6
    }
}
