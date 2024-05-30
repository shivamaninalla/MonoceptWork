package com.monocept.model;

public class Account {
	private long accountNumber;
	private String accountType;
	private String accountHolderName;
	private double accountBalance;
	
	public void setAccountNumber(long accountNumber1) {
		accountNumber=accountNumber1;
	}
	public void setAccountType(String accountType1) {
		accountType=accountType1;
	}
	public void setAccountHolderName(String accountHolderName1) {
		accountHolderName=accountHolderName1;
	}
	public void setAccountBalance(double accountBalance1) {
		accountBalance=accountBalance1;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	

}
