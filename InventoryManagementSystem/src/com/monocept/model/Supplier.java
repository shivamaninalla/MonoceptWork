package com.monocept.model;

import java.io.Serializable;

public class Supplier implements Serializable{
	private String supplierID;
	private String name;
	private long mobileNumber;
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID( String supplierID) {
		this.supplierID = supplierID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Supplier(String supplierID, String name, long mobileNumber) {
		super();
		this.supplierID = supplierID;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Supplier [supplierID=" + supplierID + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}
	public Supplier() {
		super();
	}
	

}
