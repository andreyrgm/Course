package Example;

import static java.lang.System.out;

/**
 * Clase que busca cuántas veces una palabra específica aparece en una frase.
 */
public class LoopTagsSearch {
    public static void main(String[] args) {

        String phrase = "Peter Piper picked a peck of pickled peppers.";
        String word = "peck";

        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;

        int quantity = 0; // Contador de coincidencias

        search:
        for (int i = 0; i <= maxPhrase; ) {
            int k = i;
            // Bucle para comparar cada carácter de la palabra con la sub secuencia de la frase
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++; // Avanza al siguiente carácter en la frase
                    continue search; // Salta al siguiente ciclo del bucle 'buscar'
                }
            }
            quantity++; // Incrementa el contador si se encontró una coincidencia
            i = i + maxWord; // Salta la longitud de la palabra encontrada para evitar contar solapamientos
        }

        out.println("Found = " + quantity + " times the word '" + word + "' in the phrase");
    }
}
