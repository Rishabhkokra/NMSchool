package com.nmsms.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Subject {
	@Column(name="SUBJECT_NAME")
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	

}
