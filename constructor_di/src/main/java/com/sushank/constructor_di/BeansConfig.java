package com.sushank.constructor_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sushank.constructor_di.model.Country;

@Configuration
public class BeansConfig {
	//
	//@Bean
	public Country getCountry() {
		return new Country();
	}
}
