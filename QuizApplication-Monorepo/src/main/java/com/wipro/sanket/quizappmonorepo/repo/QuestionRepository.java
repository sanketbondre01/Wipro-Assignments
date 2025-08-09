package com.wipro.sanket.quizappmonorepo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.sanket.quizappmonorepo.entities.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	@Query(value = "SELECT * FROM question_table WHERE category = ?1 AND difficulty = ?2 ORDER BY RANDOM() LIMIT 3", nativeQuery = true)
	List<Question> findRandomQuestionsByCategoryAndLevel(String category, String difficulty);
}