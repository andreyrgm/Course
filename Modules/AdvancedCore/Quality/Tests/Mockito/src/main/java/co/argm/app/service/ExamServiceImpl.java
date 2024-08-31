package co.argm.app.service;

import co.argm.app.Exam;
import co.argm.app.repo.ExamRepo;
import co.argm.app.repo.QuestionsRepo;

import java.util.List;
import java.util.Optional;

/**
 * Implementación del servicio ExamService.
 */
public class ExamServiceImpl implements ExamService {
    private final ExamRepo examRepo;
    private final QuestionsRepo questionsRepo;

    public ExamServiceImpl(ExamRepo examRepo, QuestionsRepo questionsRepo) {
        this.examRepo = examRepo;
        this.questionsRepo = questionsRepo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Exam> find(String name) {
        return examRepo.findAll().stream().filter(exam -> exam.getName().equals(name)).findFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Exam findQuestions(String name) {
        Optional<Exam> examOpt = find(name);
        Exam exam = null;
        if (examOpt.isPresent()) {
            exam = examOpt.get();
            List<String> questions = questionsRepo.find(exam.getId());
            exam.setQuestions(questions);
        }
        return exam;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Exam save(Exam exam) {
        if (!exam.getQuestions().isEmpty()) {
            questionsRepo.saveAll(exam.getQuestions());
        }
        return examRepo.save(exam);
    }
}
