package com.sushank.constructor_di.model;

public class Answer {
	private String answer;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answer=" + answer + "]";
	}
	
	
}
