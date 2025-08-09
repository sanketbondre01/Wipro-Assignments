package com.wipro.sanket.quizappmonorepo.entities;

import com.wipro.sanket.quizappmonorepo.enums.Category;
import com.wipro.sanket.quizappmonorepo.enums.Difficulty;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="question_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Question title is required field!")
	private String questionTitle;
	@NotNull
	private String option1;
	@NotNull
	private String option2;
	@NotNull
	private String option3;
	@NotNull
	private String option4;
	
	@NotNull(message = "Correct Answer Should be posted")
	private String correctAnswer;
	@Enumerated(EnumType.STRING)
	private Difficulty difficulty;
	
	@Enumerated(EnumType.STRING)
	private Category category;
}