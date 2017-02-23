package com.JavaBasedSpringConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.JavaBasedSpringConfiguration.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        
        Employee employee = context.getBean(Employee.class);
        
        System.out.println(employee);
    }
}
