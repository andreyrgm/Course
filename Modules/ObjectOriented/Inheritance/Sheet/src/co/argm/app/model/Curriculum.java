package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un currículum vitae (CV).
 * Contiene la información personal del individuo, su carrera y experiencias.
 */
public class Curriculum extends Sheet {
    private final Person person;
    private final String career;
    private final List<String> experiences;

    public Curriculum(Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Curriculum addExperience(String experience) {
        experiences.add(experience);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Name: ").append(person)
                .append("\nResume: ").append(content)
                .append("\nProfession: ").append(career)
                .append("\nExperiences:");
        for (String experience : experiences) {
            sb.append("\n- ").append(experience);
        }
        return sb.toString();
    }
}
