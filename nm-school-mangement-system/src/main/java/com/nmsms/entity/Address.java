package com.nmsms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ADDRESS")
public class Address {
	@Column(name = "CITY",nullable=false)
	private String city;
	@Column(name = "STATE",nullable=false)
	private String state;
	@Column(name = "COUNTRY",nullable=false)
	private String country;
	@Column(name = "PIN_CODE",nullable=false)
	private String pin;
	@Column(name = "STREET_ADDRESS",nullable=false)
	private String streetAddress;
	@Id
	@Column(name = "HOUSE_NUMBER")
	private String houseNo;
	
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	
}
