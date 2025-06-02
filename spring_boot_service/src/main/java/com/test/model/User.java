package com.test.model;

public class User {

	private int id;
	private String userFullName;
	private long mobileNumber;
	private String emailId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userFullName=" + userFullName + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + "]";
	}
	
	
	
}
