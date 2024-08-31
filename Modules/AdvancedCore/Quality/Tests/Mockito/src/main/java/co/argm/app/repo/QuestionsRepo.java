package co.argm.app.repo;

import java.util.List;

/**
 * Repositorio para gestionar las preguntas de los exámenes.
 */
public interface QuestionsRepo {

    /**
     * Encuentra todas las preguntas asociadas a un examen dado su ID.
     *
     * @param id el ID del examen.
     * @return una lista de preguntas asociadas al examen.
     */
    List<String> find(int id);

    /**
     * Guarda una lista de preguntas en el repositorio.
     *
     * @param questions la lista de preguntas a guardar.
     */
    void saveAll(List<String> questions);
}
