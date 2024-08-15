package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet {
    private final Person person;
    private final String career;
    private final List<String> experiences;

    public Curriculum(Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        experiences = new ArrayList<>();
    }

    public Curriculum addExperience(String experience) {
        experiences.add(experience);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Name: ").append(person).append("and Resume: ").append(content)
                .append("\n").append("Profession: ").append(career).append("\n").append("Experiences: ").append("\n");
        for (String experience : experiences) {
            sb.append("- ").append(experience).append("\n");
        }
        return sb.toString();
    }
}
