package com.monocept.model;

public class Account {
	private static int numberOfAccounts;
	private int accountNumber;
	private String name;
	private double balance;
	
	public void createAccount(int accountNumber, String name, double balance) {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		numberOfAccounts++;
		System.out.println("Person Number: "+numberOfAccounts);
		
	}
	
	public void display() {
		System.out.println("Number of Accounts created: "+numberOfAccounts);
	}

}
