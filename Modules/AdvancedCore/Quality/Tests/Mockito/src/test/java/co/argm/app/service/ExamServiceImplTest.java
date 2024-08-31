package co.argm.app.service;

import co.argm.app.Exam;
import co.argm.app.repo.ExamRepo;
import co.argm.app.repo.QuestionsRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.util.Optional;

import static co.argm.app.service.Data.*;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Pruebas unitarias para ExamServiceImpl.
 */
@ExtendWith(MockitoExtension.class)
class ExamServiceImplTest {

    @Mock
    ExamRepo repo;

    @Mock
    QuestionsRepo question;

    @InjectMocks
    ExamServiceImpl service;

    @Test
    void find() {
        when(repo.findAll()).thenReturn(EXAMS);
        Optional<Exam> exam = service.find("Matemáticas");
        assertAll(() -> assertTrue(exam.isPresent()),
                () -> assertEquals(5, exam.orElseThrow().getId()),
                () -> assertEquals("Matemáticas", exam.orElseThrow().getName()));
    }

    @Test
    void findEmpty() {
        when(repo.findAll()).thenReturn(emptyList());
        Optional<Exam> exam = service.find("Matemáticas");
        assertFalse(exam.isPresent());
    }

    @Test
    void examQuestions() {
        when(repo.findAll()).thenReturn(EXAMS);
        when(question.find(anyInt())).thenReturn(QUESTIONS);
        Exam exam = service.findQuestions("Matemáticas");
        assertAll(() -> assertEquals(5, exam.getQuestions().size()),
                () -> assertTrue(exam.getQuestions().contains("Aritmética")));
    }

    @Test
    void examQuestionsVerify() {
        when(repo.findAll()).thenReturn(EXAMS);
        when(question.find(anyInt())).thenReturn(QUESTIONS);
        service.findQuestions("Matemáticas");
        assertAll(() -> verify(repo).findAll(),
                () -> verify(question).find(anyInt()));
    }

    @Test
    void saveExam() {
        Exam newExam = EXAM;
        newExam.setQuestions(QUESTIONS);

        when(repo.save(any(Exam.class))).then(new Answer<Exam>() {
            int sequence = 8;

            @Override
            public Exam answer(InvocationOnMock invocation) {
                Exam exam = invocation.getArgument(0);
                exam.setId(sequence++);
                return exam;
            }
        });

        Exam exam = service.save(newExam);
        assertAll(() -> assertEquals(8, exam.getId()),
                () -> assertEquals("Física", exam.getName()),
                () -> verify(repo).save(any(Exam.class)),
                () -> verify(question).saveAll(anyList()));
    }
}
