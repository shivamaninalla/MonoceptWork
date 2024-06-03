package com.monocept.assignments;

public class SavingsAccount extends Account{
	private double minimumBalance;
	
	
	public SavingsAccount() {
		super();
	}



	public SavingsAccount(double minimumBalance,int accountNumber, String name, double balance) {
		super(accountNumber,name,balance);
		this.minimumBalance = minimumBalance;
	}
	
	



	public double getMinimumBalance() {
		return minimumBalance;
	}



	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}



	public boolean debit(SavingsAccount savingsAccount,double amount) {
		
		if(amount>savingsAccount.getBalance()) {
			
			System.out.println("Insufficient balance");
			return false;
		}
		savingsAccount.setBalance(savingsAccount.getBalance() - amount);
		
		if(savingsAccount.getBalance()<minimumBalance) 
			System.out.println("Please maintain minimum balance");
		
		System.out.println("Balance in your Account: "+savingsAccount.getBalance());
		
		return true;
	}
	
	
	

	public void displaySavingsAccount(SavingsAccount savingsAccount) {
		System.out.println("Your Account Details: ");
                System.out.println("Your Account Number: "+savingsAccount.getAccountNumber());    
                System.out.println("Your Name: "+savingsAccount.getName());
                System.out.println("Your Balance: "+savingsAccount.getBalance());
	}

}
