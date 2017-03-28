package com.sushank.springjdbctransaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sushank.springjdbctransaction.model.Address;
import com.sushank.springjdbctransaction.model.Customer;
import com.sushank.springjdbctransaction.service.CustomerManager;
import com.sushank.springjdbctransaction.service.CustomerManagerImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		CustomerManager customerManager = ctx.getBean("customerManager", CustomerManagerImpl.class);
		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(3);
		customer.setName("Pankaj");
		Address address = new Address();
		address.setId(3);
		address.setCountry("India");
		// setting value more than 20 chars, so that SQLException occurs
		address.setAddress("Albany Dr");
		customer.setAddress(address);
		return customer;
	}
}
