package com.revature.models;

public class EmployeeSubmitDTO {
	private String firstName;
	private String lastName;
	private String reimbType;
	private String amount;
	private String userId;
	
	public EmployeeSubmitDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeSubmitDTO(String firstName, String lastName, String reimbType, String amount, String userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.reimbType = reimbType;
		this.amount = amount;
		this.userId = userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getReimbType() {
		return reimbType;
	}
	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
