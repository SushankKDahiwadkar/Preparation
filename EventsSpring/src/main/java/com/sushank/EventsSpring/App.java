package com.sushank.EventsSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
    	
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
    	context.start();
    	
        User user = context.getBean(User.class);
        System.out.println(user);
        
        context.stop();
        
        
       
    }
}
