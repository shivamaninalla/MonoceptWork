package com.monocept.test;

import java.io.Serializable;
import java.util.Scanner;

import com.monocept.assignments.Account;
import com.monocept.assignments.CurrentAccount;
import com.monocept.assignments.SavingsAccount;

public class AccountTest implements Serializable{

	

	public static void main(String[] args) {
		
	
		Scanner scanner=new Scanner(System.in);
		
		 SavingsAccount savingsAccount=new SavingsAccount();
		 CurrentAccount currentAccount=new CurrentAccount();
		 
		 
		
		
		
		while(true) {
			System.out.println("Select Account Type: ");
			System.out.println("Enter 1 for Savings \nEnter 2 for Current \nEnter 3 for Exit");
			int number=scanner.nextInt();
			
		switch(number) {
		case 1: System.out.println("You choose Savings Account");
	    
		        handleSavings(scanner,savingsAccount);
		        break;
		case 2: System.out.println("You choose Current Account");
	            
                
                handleCurrent(scanner,currentAccount);
                break;
		case 3:System.out.println("You got Exit. Thank You!");
		       return ;
		}
		
		
		
		
		
		}

	}

	private static void handleSavings(Scanner scanner, SavingsAccount savingsAccount) {
		System.out.println("Select Operation");
	    System.out.println("Select 1 for Create Account");
        System.out.println("Select 2 for Display Account Details");
        System.out.println("Select 3 for Credit into Account");
        System.out.println("Select 4 for Debit from Account");
        System.out.println("Select 5 for Exit");
        int savings=scanner.nextInt();
		switch(savings) {
		case 1: System.out.println("You selected creating new Account");
		        System.out.println("Please Enter personal Details ");
		        System.out.println("Enter Account Number: ");
		        savingsAccount.setAccountNumber(scanner.nextInt());
			    System.out.println("Enter Account Holder Name: ");
			    savingsAccount.setName(scanner.next());
			    System.out.println("Enter Opening Balance: ");
			    savingsAccount.setBalance(scanner.nextDouble());
			    System.out.println("Enter Mininmum Balance: ");
			    savingsAccount.setMinimumBalance(scanner.nextDouble());
			    handleSavings(scanner, savingsAccount);
	            break;  
		case 2:
			savingsAccount.displaySavingsAccount(savingsAccount);
			handleSavings(scanner, savingsAccount);
			break;
			
		case 3: System.out.println("You selected crediting into Account");
			    System.out.println("Enter amount to credit: ");
			    savingsAccount.credit(scanner.nextDouble());
			    handleSavings(scanner, savingsAccount);
			    break;
			    
		case 4: System.out.println("You selected Debiting from Account");
	            System.out.println("Enter amount to debit: ");
	            double amount1=scanner.nextDouble();
	            savingsAccount.debit(savingsAccount,amount1);
	            handleSavings(scanner, savingsAccount);
	            break;
	            
		case 5:System.out.println("You Exit");
			break;
			    
	
	
	}
		
	}

	private static void handleCurrent(Scanner scanner, CurrentAccount currentAccount) {
		
		System.out.println("Select Operation");
        System.out.println("Select 1 for Create Account");
        System.out.println("Select 2 for Display Account Details");
        System.out.println("Select 3 for Credit into Account");
        System.out.println("Select 4 for Debit from Account");
        System.out.println("Select 5 for Exit");
        int current=scanner.nextInt();
        switch(current) {
		case 1:
			System.out.println("You selected creating new Account");
	        System.out.println("Please Enter personal Details ");
	        System.out.println("Enter Account Number: ");
	        currentAccount.setAccountNumber(scanner.nextInt());
		    System.out.println("Enter Account Holder Name: ");
		    currentAccount.setName(scanner.next());
		    System.out.println("Enter Opening Balance: ");
		    currentAccount.setBalance(scanner.nextDouble());
		    System.out.println("EnterOverDraftLimit: ");
		    currentAccount.setOverDraftLimit(scanner.nextDouble());
		    handleCurrent(scanner,currentAccount);
		    break;
			
		
		case 2:
			   currentAccount.displayCurrentAccount(currentAccount);
			   handleCurrent(scanner,currentAccount);
		       break;
		       
		case 3: System.out.println("You selected crediting into Account");
	            System.out.println("Enter amount to credit: ");
	            currentAccount.credit(scanner.nextDouble());
	            handleCurrent(scanner,currentAccount);
	            break;
	    
		case 4: System.out.println("You selected Debiting from Account");
                System.out.println("Enter amount to debit: ");
                double amount1=scanner.nextDouble();
                currentAccount.debit(currentAccount,amount1);
                handleCurrent(scanner,currentAccount);
                break;
			
		case 5:System.out.println("You Exit");
			break;

		}
		
	}

}
