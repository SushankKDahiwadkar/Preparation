package com.sushank.SpringAOP;

public interface Customer {
	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerReturnException() throws Exception;
	
	void addCustomerAround();
}
