package co.argm.app.repo;

import co.argm.app.Exam;

import java.util.List;

/**
 * Repositorio para la entidad Exam.
 */
public interface ExamRepo {

    /**
     * Obtiene todos los exámenes disponibles.
     *
     * @return una lista de todos los exámenes.
     */
    List<Exam> findAll();

    /**
     * Guarda un examen en el repositorio.
     *
     * @param exam el examen a guardar.
     * @return el examen guardado.
     */
    Exam save(Exam exam);
}
