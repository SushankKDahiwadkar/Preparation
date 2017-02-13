package com.sushank.constructor_di.model;

import java.util.Map;

public class Question {
	private int questionNo;
	private String question;
	private Map<User, Answer> userAnswer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(Map<User, Answer> userAnswer) {
		super();
		this.userAnswer = userAnswer;
	}
	
	public Question(int questionNo, String question) {
		super();
		this.questionNo = questionNo;
		this.question = question;
	}
	
	public Question(int questionNo, String question, Map<User, Answer> userAnswer) {
		super();
		this.questionNo = questionNo;
		this.question = question;
		this.userAnswer = userAnswer;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<User, Answer> getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(Map<User, Answer> userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", question=" + question + ", userAnswer=" + userAnswer + "]";
	}
	
	
	
}
