package com.surya.example.ex;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExeptionHandler {
	
	@ExceptionHandler(USER_NOT_FOUND_EXCEPTON.class)
	public ResponseEntity<ErrrorMessage> handleUserNotFoundException(USER_NOT_FOUND_EXCEPTON userNotFoundException){
		ErrrorMessage errorMessage = new ErrrorMessage();
		return new ResponseEntity<ErrrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
}
