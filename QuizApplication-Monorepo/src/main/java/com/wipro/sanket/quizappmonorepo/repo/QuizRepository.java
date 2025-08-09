package com.wipro.sanket.quizappmonorepo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sanket.quizappmonorepo.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}
