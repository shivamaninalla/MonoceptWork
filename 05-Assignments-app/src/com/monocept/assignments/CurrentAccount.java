package com.monocept.assignments;

public class CurrentAccount extends Account{
	
	private double overDraftLimit;
	
	
	
	
	public CurrentAccount() {
		
	}
	public CurrentAccount(double overDraftLimit,int accountNumber,String name, double balance) {
		super(accountNumber,name,balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public boolean debit(CurrentAccount currentAccount,double amount) {
		double balance=currentAccount.getBalance();
		if(amount>balance) {
			check(currentAccount, amount);
			return true;
		}
			
	    balance-=amount;
		currentAccount.setBalance(balance);
			
		return false;
	}
	public boolean check(CurrentAccount currentAccount, double amount) {
		
		if(amount>currentAccount.getBalance()+overDraftLimit) {
			System.out.println("Limit reached");
			return false;
		}
	    currentAccount.setBalance(currentAccount.getBalance()-amount);
	    
		overDraftLimit+=getBalance();
		System.out.println("overdraft limit"+overDraftLimit);
		return true;
	}
	
	

	
	public void displayCurrentAccount(CurrentAccount currentAccount) {
		System.out.println("Your Account Details: ");
	    System.out.println("Your Account Number: "+currentAccount.getAccountNumber());    
	    System.out.println("Your Name: "+currentAccount.getName());
	    System.out.println("Your Balance: "+currentAccount.getBalance());
	}
	

}
