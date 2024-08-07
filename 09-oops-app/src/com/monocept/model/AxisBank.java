package com.monocept.model;

public class AxisBank {
	private int AccountNumber;
	private String name;
	private double balance;
	private AccountType accountType;
	
	public AxisBank() {
		super();
	}
	public AxisBank(int accountNumber, String name, double balance, AccountType accountType) {
		super();
		AccountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "AxisBank [AccountNumber=" + AccountNumber + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + "]";
	}
	
	

}
