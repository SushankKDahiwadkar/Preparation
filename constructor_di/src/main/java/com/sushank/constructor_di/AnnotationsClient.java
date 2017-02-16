package com.sushank.constructor_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sushank.constructor_di.model.Employee;

public class AnnotationsClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
