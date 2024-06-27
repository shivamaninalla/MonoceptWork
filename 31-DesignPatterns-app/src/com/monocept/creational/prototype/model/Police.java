package com.monocept.creational.prototype.model;

public class Police {
	
	private String name;
	private int mobileNumber;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Police(String name, int mobileNumber, String designation) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.designation = designation;
	}
	
		
	public Police getClone() {
		return new Police(name,mobileNumber,designation);
	}
	@Override
	public String toString() {
		return "Police [name=" + name + ", mobileNumber=" + mobileNumber + ", designation=" + designation + "]";
	}

}
