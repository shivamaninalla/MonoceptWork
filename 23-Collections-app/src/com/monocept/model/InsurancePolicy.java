package com.monocept.model;

import java.time.LocalDate;

public class InsurancePolicy {
	
	private int policyNumber;
	private String holderName;
	private double amount;
	private LocalDate creationDate;
	@Override
	public String toString() {
		return "InsurancePolicy [policyNumber=" + policyNumber + ", holderName=" + holderName + ", amount=" + amount
				+ ", creationDate=" + creationDate + "]";
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public InsurancePolicy(int policyNumber, String holderName, double amount, LocalDate date) {
		super();
		this.policyNumber = policyNumber;
		this.holderName = holderName;
		this.amount = amount;
		this.creationDate = date;
	}

	

	

}
