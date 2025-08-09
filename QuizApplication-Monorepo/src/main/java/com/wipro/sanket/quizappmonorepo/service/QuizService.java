package com.wipro.sanket.quizappmonorepo.service;

import java.util.List;

import com.wipro.sanket.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.sanket.quizappmonorepo.entities.Quiz;
import com.wipro.sanket.quizappmonorepo.entities.Response;

public interface QuizService {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Long id);

	Integer calculatedResult(Long id, List<Response> responses);

}