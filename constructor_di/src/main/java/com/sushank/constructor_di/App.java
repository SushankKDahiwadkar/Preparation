package com.sushank.constructor_di;

import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sushank.constructor_di.model.BankDetails;
import com.sushank.constructor_di.model.Employee;
import com.sushank.constructor_di.model.Question;
import com.sushank.constructor_di.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Resource resource = new ClassPathResource("spring.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);*/
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	User user = (User) context.getBean("user");
    	//System.out.println(user.toString());
    	
    	Set<Entry<String, String>> entrySet = user.getSecurityQuestions().entrySet();
    	
    	for (Entry<String, String> entry : entrySet) {
    		//System.out.println(entry.getKey() + ":" + entry.getValue());
    	}
    	
    	Question question = (Question) context.getBean("question");
    	//System.out.println(question);
    	
    	Question question2 = (Question) context.getBean("question2");
    	//System.out.println(question2);
    	
    	//Setter Injection
    	
    	User user10 = (User) context.getBean("user10");
    	//System.out.println(user10);
    	
    	Employee employee = (Employee) context.getBean("employee");
    	System.out.println(employee);
    	
    	BankDetails bankDetails = (BankDetails) context.getBean("bankDetail");
    	//System.out.println(bankDetails);
    }
}
