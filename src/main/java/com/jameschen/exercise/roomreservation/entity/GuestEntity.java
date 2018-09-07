package com.jameschen.exercise.roomreservation.entity;

import java.io.Serializable;

public class GuestEntity implements Serializable {

    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;
 	
	public GuestEntity() {
		super();
	}

	public GuestEntity(String firstName, String lastName, String emailAddress, String address, String country, String state, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.address = address;
		this.country = country;
		this.state = state;
		this.phoneNumber = phoneNumber;
	}
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "GuestEntity [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", address=" + address + ", country=" + country + ", state=" + state + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
