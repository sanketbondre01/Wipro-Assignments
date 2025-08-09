package com.wipro.sanket.quizappmonorepo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(QuestionNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleQuestionNotFoundException(QuestionNotFoundException questionNotFoundException){
		ErrorMessage errorMessage = new ErrorMessage();
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
}