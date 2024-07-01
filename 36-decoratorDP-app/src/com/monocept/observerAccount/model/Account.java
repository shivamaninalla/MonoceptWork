package com.monocept.observerAccount.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private long accountNumber;
	private String name;
	private double balance;
	private List<INotifiers> notifiers;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
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
	public List<INotifiers> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifiers> notifiers) {
		this.notifiers = notifiers;
	}
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<INotifiers>();
	}
	public void registerNotifier(INotifiers iNotifier) {
		notifiers.add(iNotifier);
	}
	
	public void withdraw(double amount) {
		if(amount<balance) {
			balance-=amount;
		}
		for(INotifiers l:notifiers) {
			l.notifyUser(this);
		}
	}
	
	public void deposit(double amount) {
		balance+=amount;
		for(INotifiers l:notifiers) {
			l.notifyUser(this);
		}
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
