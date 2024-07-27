public class While {
    public static void main(String[] args) {
        // Bucle while que cuenta de 0 a 5
        System.out.println("=== While loop that counts from 0 to 5 ===");
        int i = 0;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Bucle while controlado por una condición booleana
        System.out.println("\n=== While loop controlled by a boolean condition ===");
        i = 0;
        boolean test = true;
        while (test) {
            if (i == 7) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // Bucle do-while que se ejecuta al menos una vez
        System.out.println("\n=== Do-while loop that executes at least once ===");
        test = false;
        do {
            System.out.println("Executed at least once");
        } while (test);

        // Bucle do-while controlado por una condición booleana
        System.out.println("\n=== Do-while loop controlled by a boolean condition ===");
        test = true;
        i = 0;
        do {
            if (i == 10) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (test);
    }
}
