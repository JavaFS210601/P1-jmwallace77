package com.revature.models;

public class ManagerAcceptDTO {
	private String reimbId;
	private String status;
	private String userId;
	public ManagerAcceptDTO(String status, String userId) {
		super();
		this.status = status;
		this.userId = userId;
	}
	public ManagerAcceptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ManagerAcceptDTO(String reimbId, String status, String userId) {
		super();
		this.reimbId = reimbId;
		this.status = status;
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReimbId() {
		return reimbId;
	}
	public void setReimbId(String reimbId) {
		this.reimbId = reimbId;
	}
	
	
}
