package com.sushank.EventsSpring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent arg0) {
		System.out.println("Context Started");
	}

}
