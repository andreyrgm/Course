package co.argm.app.service;

import co.argm.app.Exam;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Clase que proporciona datos de ejemplo para las pruebas.
 */
public class Data {
    public static final List<Exam> EXAMS = asList(new Exam(5, "Matemáticas"), new Exam(6, "Lenguaje"),
            new Exam(7, "Historia"));

    public static final List<String> QUESTIONS = asList("Aritmética", "Integrales", "Derivadas", "Trigonometría",
            "Geometría");

    public static final Exam EXAM = new Exam("Física");
}
