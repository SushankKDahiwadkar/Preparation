package com.hibernate_annotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Employee employee = new Employee();
    	
    	employee.setId(100);
    	employee.setFirstName("Sushank");
    	employee.setLastName("Dahiwadkar");
    	
    	session.persist(employee);
    	
    	transaction.commit();
    	
    	session.close();
    	
    	System.out.println("Data saved");
    }
}
