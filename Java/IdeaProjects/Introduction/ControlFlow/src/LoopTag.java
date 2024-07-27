public class LoopTag {
    public static void main(String[] args) {
        // Etiqueta tag1: Bucle for con un bucle while anidado
        System.out.println("=== Tag tag1: Work and rest days ===");
        tag1:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Day " + i + ": weekend break!");
                    continue tag1;
                }
                System.out.println("Day " + i + ", working at " + j + "hrs.");
                j++;
            }
        }

        // Etiqueta tag2: Bucle for con un bucle while anidado
        System.out.println("\n=== Tag tag2: Print coordinates except for i = 2 ===");
        tag2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue tag2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }

        // Etiqueta tag3: Bucle for anidado
        System.out.println("\n\n=== Tag tag3: Break the loop when i = 2 ===");
        tag3:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break tag3;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
