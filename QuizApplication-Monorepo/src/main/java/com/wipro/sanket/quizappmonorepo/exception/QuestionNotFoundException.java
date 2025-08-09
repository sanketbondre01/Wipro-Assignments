package com.wipro.sanket.quizappmonorepo.exception;

@SuppressWarnings("serial")
public class QuestionNotFoundException extends RuntimeException{

	public QuestionNotFoundException(String message) {
		super(message);
	}
	
}