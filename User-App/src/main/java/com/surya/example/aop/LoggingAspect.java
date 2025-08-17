package com.surya.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect // tells Spring this is an Aspect class
@Component // registers the bean in Spring context
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.surya.example.controllers.UserController.addUser(..))")
    public void logBeforeAddUser(JoinPoint joinPoint) {
        log.error("logging something before addNewUser Endpoint");
        log.error("which method we are calling! {}", joinPoint.getSignature().getName());
        log.error("logging something before addNewUser Endpoint");
    }
}
