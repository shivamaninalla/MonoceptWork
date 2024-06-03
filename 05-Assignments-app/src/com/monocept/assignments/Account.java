package com.monocept.assignments;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int accountNumber;
	private String name;
	private double balance;
	
	
	
	
	public Account() {
		
	}
	public Account(int accountNumber, String name, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
	
	public void credit(double amount) {
		balance+=amount;
		System.out.println("Amount is credited");
		System.out.println("Your balance is: "+balance);
	}
	
	

}
