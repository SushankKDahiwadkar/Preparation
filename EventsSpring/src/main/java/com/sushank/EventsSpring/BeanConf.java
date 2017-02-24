package com.sushank.EventsSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {
	
	@Bean
	public User getUser() {
		return new User();
	}
	
	@Bean
	public ContextStartedEventHandler getContextStartedEventHandler() {
		return new ContextStartedEventHandler();
	}
	
	@Bean
	public ContextStoppedEventHandler getContextStoppedEventHandler() {
		return new ContextStoppedEventHandler();
	}
}
