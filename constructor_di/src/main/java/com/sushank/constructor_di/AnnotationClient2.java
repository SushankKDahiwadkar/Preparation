package com.sushank.constructor_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sushank.constructor_di.model.Country;

public class AnnotationClient2 {

	public static void main(String arString[]) {
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Country country = ctx.getBean(Country.class);
		System.out.println(country);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(Country.class);
		context.refresh();
		
		Country country1 = context.getBean(Country.class);
		System.out.println(country1);
		
	}
}
