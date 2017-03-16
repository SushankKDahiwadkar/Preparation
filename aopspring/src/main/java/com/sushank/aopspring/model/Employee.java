package com.sushank.aopspring.model;

public class Employee {
	private String name;
	
	public String getName(){
		return name;
	}
	
	//@Loggable
	public void setName(String na){
		this.name = na;
	}
	
	public void throwException() {
		throw new RuntimeException("Simple Exception");
	}
}
