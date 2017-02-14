package com.sushank.constructor_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sushank.constructor_di.model.Employee;

public class BeanScope {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.hashCode());
		
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println(employee1.hashCode());
	}
}
