package com.monocept.model;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;

public class BankAccountClass {
	
	private double amount;
	private double balance;

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void deposit(double amount){
		balance+=amount;
		System.out.println("Your balance is: "+balance);
	}
	public boolean withDrawl(double amount) throws InsufficientFundsException, NegativeAmountException {
		if(amount<0) {
			throw new NegativeAmountException();
		}
		checkBalance(amount);

		return true;
	}
	private boolean checkBalance(double amount) throws InsufficientFundsException {
		if(balance<amount) {
			throw new InsufficientFundsException();
			}
		balance-=amount;
		System.out.println("Your amount is withdrawl");
		System.out.println("Remaining balance: "+balance);
		return true;
	}

}
