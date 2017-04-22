package com.nmsms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="PERSONAL_DETAILS")
public class PersonalDetails {
	@Column(name = "FATHER_NAME",nullable=false)
	private String fatherName;
	@Column(name = "MOTHER_NAME",nullable=false)
	private String motherName;
	@Column(name = "DATE_OF_BIRTH",nullable=false)
	private String dob;
	@Id
	@Column(name = "ADHAR_NUM",nullable=false)
	private String adharNo;
	@Column(name = "CONTACT_NUM",nullable=false)
	private String mobNum;
	@Column(name = "GENDER",nullable=false)
	private String gender;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Address.class)
	private Address address;
	@Column(name = "EMAIL_ADDRESS",nullable=false)
	private String email;
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
