package co.argm.app.service;

import co.argm.app.Exam;

import java.util.Optional;

/**
 * Servicio para gestionar los exámenes y sus preguntas.
 */
public interface ExamService {

    /**
     * Busca un examen por su nombre.
     *
     * @param name el nombre del examen.
     * @return un Optional que contiene el examen si se encuentra, o vacío en caso contrario.
     */
    Optional<Exam> find(String name);

    /**
     * Encuentra un examen por su nombre e incluye sus preguntas.
     *
     * @param name el nombre del examen.
     * @return el examen con sus preguntas.
     */
    Exam findQuestions(String name);

    /**
     * Guarda un examen y sus preguntas en el repositorio.
     *
     * @param exam el examen a guardar.
     * @return el examen guardado.
     */
    Exam save(Exam exam);
}
