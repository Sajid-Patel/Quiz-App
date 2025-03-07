package com.telusko.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.quizapp.Question;
import com.telusko.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCatagory(String catagory) {

		return questionDao.findByCatagory(catagory);
	}

}
