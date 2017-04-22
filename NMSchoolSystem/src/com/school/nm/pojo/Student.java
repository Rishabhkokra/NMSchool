package com.school.nm.pojo;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLL_NUMBER",nullable=false)
	private long rollNum;
	@Column(name = "STUDENT_NAME",nullable=false)
	private String studentName;
	@Column(name = "CLASS",nullable=false)
	private String standard;
	@Column(name = "IMG_URL")
	private String imgURL;
	
	@Column(name = "DATE_OF_JOIN",nullable=false)
	private String doj;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = PersonalDetails.class)
    private PersonalDetails personalDetails;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = StudentFEE.class)
     private StudentFEE studentFee;
    
    @ElementCollection
    @Embedded
	@Column(name="STUDENT_SUBJECTS")
	private Set<Subject> subjects;
	public long getRollNum() {
		return rollNum;
	}
	public void setRollNum(long rollNum) {
		this.rollNum = rollNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects( Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	
}
