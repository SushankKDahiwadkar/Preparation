package com.sushank.constructor_di.model;

import java.util.List;
import java.util.Map;

public class User {
	private long userId;
	private String userName;
	private String emailId;
	private Address permanentAddress;
	private List<String> userTags;
	private List<Address> addresses;
	private Map<String, String> securityQuestions;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId) {
		super();
		this.userId = userId;
	}

	public User(Address address) {
		super();
		this.permanentAddress = address;
	}

	public User(long userId, String userName, String emailId, Address address, List<String> userTags,
			List<Address> addresses, Map<String, String> securityQuestions) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.permanentAddress = address;
		this.userTags = userTags;
		this.addresses = addresses;
		this.securityQuestions = securityQuestions;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<String> getUserTags() {
		return userTags;
	}

	public void setUserTags(List<String> userTags) {
		this.userTags = userTags;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Map<String, String> getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(Map<String, String> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", permanentAddress="
				+ permanentAddress + ", userTags=" + userTags + ", addresses=" + addresses + ", securityQuestions="
				+ securityQuestions + "]";
	}
	
	
}
