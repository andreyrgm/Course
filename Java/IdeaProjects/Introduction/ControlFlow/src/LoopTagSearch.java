public class LoopTagSearch {
    public static void main(String[] args) {
        // Declaración de la frase y la palabra a buscar
        String phrase = "pickled Peter Piper picked a peck of pickledpickled pepperspickled";
        String word = "pickled";

        // Longitud de la palabra y límites de búsqueda en la frase
        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;

        // Inicialización del contador de ocurrencias
        int quantity = 0;

        // Búsqueda de la palabra en la frase usando etiquetas (tags)
        search:
        for (int i = 0; i <= maxPhrase; ) {
            int k = i;
            for (int j = 0; j < maxWord; j++) {
                // Si los caracteres no coinciden, continuar con la siguiente posición en la frase
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue search;
                }
            }
            // Incrementar el contador de ocurrencias y avanzar el índice en la frase
            quantity++;
            i = i + maxWord;
        }

        // Imprimir el resultado
        System.out.println("Found " + quantity + " times the word \"" + word + "\" in the phrase");
    }
}
