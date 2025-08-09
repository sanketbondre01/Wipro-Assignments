package com.wipro.sanket.quizappmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sanket.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.sanket.quizappmonorepo.entities.Quiz;
import com.wipro.sanket.quizappmonorepo.entities.Response;
import com.wipro.sanket.quizappmonorepo.service.QuizService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/create")
	public Quiz createQuiz(@RequestParam String category,@RequestParam String level,@RequestParam String title) {
		return quizService.createQuiz(category,level,title);
	}
	
	@GetMapping("/getQuizById/{id}")
	public List<QuestionWrapper> getQuizQuestions(@PathVariable Long id){
		return quizService.getQuizQuestions(id);
	}
	
	@PostMapping("/submitQuiz/{id}")
	public Integer submitQuiz(@PathVariable Long id,@RequestBody List<Response> responses) {
		return quizService.calculatedResult(id, responses);
	}
	
}