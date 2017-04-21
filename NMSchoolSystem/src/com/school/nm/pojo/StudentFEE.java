package com.school.nm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_FEE_TABLE")
public class StudentFEE {
	@Id
	@Column(name="RECEIPT_NUMBER")
	private long receiptNumber;
	@Column(name="FEE")
	private double fees;
	@Column(name="FEE_SUBMIT_DATE")
	private String feeSubmitDate;
	@Column(name="FEE_SUBMIT_STATUS")
	private String feeStatus;
	@Column(name="FEE_DUE_DATE")
	private String feeDueDate;
	@Column(name="PENDING_FEE")
	private double pendingFee;
	
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getFeeSubmitDate() {
		return feeSubmitDate;
	}
	public void setFeeSubmitDate(String feeSubmitDate) {
		this.feeSubmitDate = feeSubmitDate;
	}
	public String getFeeStatus() {
		return feeStatus;
	}
	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}
	public String getFeeDueDate() {
		return feeDueDate;
	}
	public void setFeeDueDate(String feeDueDate) {
		this.feeDueDate = feeDueDate;
	}
	public void setPendingFee(double pendingFee) {
		this.pendingFee = pendingFee;
	}
	public double getPendingFee() {
		return pendingFee;
	}
	public long getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(long receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	
	
	

}
