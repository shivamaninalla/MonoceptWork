package com.monocept.creational.factory.model;

public class SavingsAccounttt implements IAccount{
	
	private int accountNumber;
	private String name;
	private double balance;
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}
	public SavingsAccounttt() {
		super();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	public SavingsAccounttt(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}
	
	

}
