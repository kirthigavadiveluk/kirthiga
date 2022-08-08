package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;

public class QuestionService {
	@Autowired
	Question qu;

	public Question getQu() {
		return qu;
	}

	public void setQu(Question qu) {
		this.qu = qu;
	}
	
	
}
