package com.microservices.customer.model;

import javax.persistence.Embeddable;

@Embeddable
public class CustAddress {

	private String city;
	private String state;
	private String country;
	private String pinCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public CustAddress(String city, String state, String country, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public CustAddress() {

	}

}
