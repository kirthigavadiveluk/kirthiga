package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Question {
	private int Qno;
	private String question;
	private String a;
	private String b;
	private String c;
	private String answer;
	public int getQno() {
		return Qno;
	}
	public void setQno(int qno) {
		Qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
