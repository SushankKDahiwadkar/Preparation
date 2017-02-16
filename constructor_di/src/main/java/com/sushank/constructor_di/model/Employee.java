package com.sushank.constructor_di.model;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int employeeId;
	private String employeeName;
	private BankDetails bankDetails;
	
	/*public Employee() {
		super();
		System.out.println("Employee Created");
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, BankDetails bankDetails) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.bankDetails = bankDetails;
	}*/
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	@Required
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", bankDetails=" + bankDetails
				+ "]";
	}
	
}
