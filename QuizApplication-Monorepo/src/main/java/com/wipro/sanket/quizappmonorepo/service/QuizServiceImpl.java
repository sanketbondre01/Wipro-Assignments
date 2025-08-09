package com.wipro.sanket.quizappmonorepo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.sanket.quizappmonorepo.entities.Question;
import com.wipro.sanket.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.sanket.quizappmonorepo.entities.Quiz;
import com.wipro.sanket.quizappmonorepo.entities.Response;
import com.wipro.sanket.quizappmonorepo.repo.QuestionRepository;
import com.wipro.sanket.quizappmonorepo.repo.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Generates constructor for final fields
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository = null;
    private final QuestionRepository questionRepository = null;

    @Override
    public Quiz createQuiz(String category, String level, String title) {
        List<Question> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category, level);
        Quiz quiz = new Quiz();
        quiz.setQuiszTitle(title);
        quiz.setQuestions(questions);
        return quizRepository.save(quiz);
    }

    @Override
    public List<QuestionWrapper> getQuizQuestions(Long id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + id));

        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for (Question q : quiz.getQuestions()) {
            questionsForUser.add(
                new QuestionWrapper(
                    q.getId(),
                    q.getQuestionTitle(),
                    q.getOption1(),
                    q.getOption2(),
                    q.getOption3(),
                    q.getOption4()
                )
            );
        }
        return questionsForUser;
    }

    @Override
    public Integer calculateResult(Long id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + id));

        int rightAnswerScore = 0;

        for (Response response : responses) {
            for (Question question : quiz.getQuestions()) {
                if (question.getId().equals(response.getId())) { // Use equals() for Long
                    if (question.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
                        rightAnswerScore++;
                    }
                    break; // No need to keep checking after match
                }
            }
        }
        return rightAnswerScore;
    }

	@Override
	public Integer calculatedResult(Long id, List<Response> responses) {
		// TODO Auto-generated method stub
		return null;
	}
}
