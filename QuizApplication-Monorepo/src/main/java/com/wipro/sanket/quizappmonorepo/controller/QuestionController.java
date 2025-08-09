package com.wipro.sanket.quizappmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.sanket.quizappmonorepo.entities.Question;
import com.wipro.sanket.quizappmonorepo.service.QuestionService;

import jakarta.validation.Valid;
@EnableAspectJAutoProxy
@RequestMapping("/api/v1/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/addNewQuestion")
	public Question addNewQuestion(@Valid @RequestBody Question question) {
		return questionService.addNewQuestion(question);
	}
	
	@GetMapping("/getAllQuestions")
	public List<QuestionService> getAllQuestions(Question question){
		return questionService.getAllQuestions();
	}
	
	@GetMapping("/getAllQuestionsPage")
    public Page<Question> getAllQuestionPage(Pageable pageable)
    {
    	 return  questionService.findAllQuestionPage(pageable);
    }
	
	@GetMapping("/getQuestionById/{id}")
	public Question getQuestionById(@PathVariable Long id) {
		return questionService.getQuestionById(id);
	}
	
	@DeleteMapping("/deleteQuestionById/{id}")
	public void deleteQuestionById(@PathVariable Long id) {
		questionService.deleteQuestionById(id);
	}
	
	@PatchMapping("/patchUpdateQuestionById/{id}")
	public Question patchUpdateQuestionById(@PathVariable Long id,@RequestBody Question question) {
		return questionService.patchUpdateQuestionById(id,question);
	}
}