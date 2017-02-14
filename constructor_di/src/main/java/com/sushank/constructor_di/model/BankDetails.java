package com.sushank.constructor_di.model;

public class BankDetails {
	private long accountNo;
	private String bankName;
	
	public BankDetails() {
		super();
		System.out.println("Bank Details Created");
		// TODO Auto-generated constructor stub
	}
	
	public BankDetails(long accountNo) {
		super();
		System.out.println("Single parameter");
		this.accountNo = accountNo;
	}

	
	public BankDetails(long accountNo, String bankName) {
		super();
		System.out.println("Double parameter");
		this.accountNo = accountNo;
		this.bankName = bankName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankDetails [accountNo=" + accountNo + ", bankName=" + bankName + "]";
	}
	
	
}
