package com.sushank.SpringAOP;

public class CustomerImpl implements Customer{

	public void addCustomer() {
		System.out.println("Add customer");
		
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue");
		return "Hello World";
	}

	public void addCustomerReturnException() throws Exception {
		System.out.println("addCustomerReturnException");
		
	}

	public void addCustomerAround() {
		System.out.println("addCustomerAround");
		
	}
	
}
