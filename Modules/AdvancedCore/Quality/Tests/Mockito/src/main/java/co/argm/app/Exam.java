package co.argm.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un examen con un identificador, nombre y lista de preguntas.
 */
public class Exam {
    private final String name;
    private int id;
    private List<String> questions;

    public Exam(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public Exam(int id, String name) {
        this.id = id;
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
}
