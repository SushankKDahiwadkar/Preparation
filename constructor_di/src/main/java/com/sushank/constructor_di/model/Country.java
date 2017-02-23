package com.sushank.constructor_di.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Country {

	private String name;
	private int noOfState;
	
	
	
	@Bean
	public Country country() {
		return new Country();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfState() {
		return noOfState;
	}

	public void setNoOfState(int noOfState) {
		this.noOfState = noOfState;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", noOfState=" + noOfState + "]";
	}
}
