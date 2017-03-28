package com.sushank.jdbctemplate;

import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		JdbcCustomerDAO jdbcCustomerDAO = (JdbcCustomerDAO) ctx.getBean("edao");

		int status = jdbcCustomerDAO.insert(new Customer(10, "wer", 2));

		System.out.println(status);
		*/
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);
		
		//Run some tests for JDBC CRUD operations
				Employee emp = new Employee();
				int rand = new Random().nextInt(1000);
				emp.setId(rand);
				emp.setName("Pankaj");
				emp.setRole("Java Developer");
				
				//Create
				employeeDAO.save(emp);
				
				//Read
				Employee emp1 = employeeDAO.getById(rand);
				System.out.println("Employee Retrieved::"+emp1);
				
				//Update
				emp.setRole("CEO");
				employeeDAO.update(emp);
				
				//Get All
				List<Employee> empList = employeeDAO.getAll();
				System.out.println(empList);
				//Delete
				//employeeDAO.delete(rand);
				//ctx.close();
				System.out.println("Done");
	}
}
