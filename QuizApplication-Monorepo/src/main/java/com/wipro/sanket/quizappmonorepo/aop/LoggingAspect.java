package com.wipro.sanket.quizappmonorepo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    // Matches the addQuestion method in QuestionController
    @Before("execution(* com.wipro.sanket.quizappmonorepo.controller.QuestionController.addNewQuestion(..))")
    public void logBeforeAddQuestion() {
        log.warn("Logging BEFORE addQuestion endpoint is executed.");
    }

    // Matches all methods in controller package
    @After("execution(* com.wipro.sanket.quizappmonorepo.controller.*.*(..))")
    public void logAfterControllerMethods() {
        log.info("A controller method has completed execution.");
    }
}
