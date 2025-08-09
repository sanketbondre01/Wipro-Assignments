package com.wipro.sanket.quizappmonorepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.saket.quizappmonorepo.entities.Question;
import com.wipro.sanket.quizappmonorepo.exception.QuestionNotFoundException;
import com.wipro.sanket.quizappmonorepo.repo.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question addNewQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(Long id) {
		return questionRepository.findById(id).get();
	}

	@Override
	public void deleteQuestionById(Long id) {
		questionRepository.deleteById(id);
	}

	@Override
	public Question patchUpdateQuestionById(Long id, Question question) {
		Question existedQuestion = questionRepository.findById(id).orElseThrow(()->new QuestionNotFoundException("Question with that id is not present"+id));
		if (question.getQuestionTitle() != null) {
		    existedQuestion.setQuestionTitle(question.getQuestionTitle());
		}
		if (question.getOption1() != null) {
		    existedQuestion.setOption1(question.getOption1());
		}
		if (question.getOption2() != null) {
		    existedQuestion.setOption2(question.getOption2());
		}
		if (question.getOption3() != null) {
		    existedQuestion.setOption3(question.getOption3());
		}
		if (question.getOption4() != null) {
		    existedQuestion.setOption4(question.getOption4());
		}
		if (question.getCorrectAnswer() != null) {
		    existedQuestion.setCorrectAnswer(question.getCorrectAnswer());
		}
		if (question.getDifficulty() != null) {
		    existedQuestion.setDifficulty(question.getDifficulty());
		}
		if (question.getCategory() != null) {
		    existedQuestion.setCategory(question.getCategory());
		}
		return questionRepository.save(existedQuestion);
	}

	@Override
	public Page<Question> findAllQuestionPage(Pageable pageable) {
		return questionRepository.findAll(pageable);
	}
}