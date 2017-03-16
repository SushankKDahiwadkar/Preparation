package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Employee employee = new Employee();
        
        //employee.setId(2);
        employee.setFirstName("Sushank2");
        employee.setLastName("Dahiwadkar2");
        
        session.persist(employee);
        
        transaction.commit();
        
        session.close();
        
        System.out.println("Saved Successfully");
    }
}
