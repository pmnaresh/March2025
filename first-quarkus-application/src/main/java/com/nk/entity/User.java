package com.nk.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Naresh kumar
 *
 */

@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_FIRST_NAME")
	private String userFirstName;

	@Column(name = "USER_LAST_NAME")
	private String userLastName;

	@Column(name = "USER_CONTACT_NUMBER")
	private long userContactNumber;

	@Column(name = "USER_ADDRESS")
	private String userAddress;

	@Column(name = "CREATED_TIMESTAMP")
	private Timestamp createdTimeStamp;

	public User() {

	}

	public User(int userId, String userFirstName, String userLastName, long userContactNumber,
			String userAddress, Timestamp createdTimeStamp) {
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userContactNumber = userContactNumber;
		this.userAddress = userAddress;
		this.createdTimeStamp = createdTimeStamp;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public long getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Timestamp getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Timestamp createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	@Override
	public String toString() {
		return "UserResource [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userContactNumber=" + userContactNumber + ", userAddress=" + userAddress + ", createdTimeStamp="
				+ createdTimeStamp + "]";
	}

}
