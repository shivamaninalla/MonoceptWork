package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Account account1=new Account();
		
		System.out.println("Enter Account Number: ");
		long accountNumber1=scanner.nextLong();
		System.out.println("Enter Account Type: ");
		String accountType1=scanner.next();
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName1=scanner.next();
		System.out.println("Enter Account Balance: ");
		double accountBalance1=scanner.nextDouble();
		
		account1.setAccountHolderName(accountHolderName1);
		account1.setAccountNumber(accountNumber1);
		account1.setAccountBalance(accountBalance1);
		account1.setAccountType(accountType1);
		
		System.out.println("Account Number: "+account1.getAccountNumber());
		System.out.println("Account Number: "+account1.getAccountHolderName());
		System.out.println("Account Number: "+account1.getAccountType());
		System.out.println("Account Number: "+account1.getAccountBalance());
		
		
		
		Account account2=new Account();
		
		System.out.println("Enter Account Number: ");
		long accountNumber2=scanner.nextLong();
		System.out.println("Enter Account Type: ");
		String accountType2=scanner.next();
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName2=scanner.next();
		System.out.println("Enter Account Balance: ");
		double accountBalance2=scanner.nextDouble();
		
		
		account2.setAccountHolderName(accountHolderName2);
		account2.setAccountNumber(accountNumber2);
		account2.setAccountBalance(accountBalance2);
		account2.setAccountType(accountType2);
		
		System.out.println("Account Number: "+account2.getAccountNumber());
		System.out.println("Account Number: "+account2.getAccountHolderName());
		System.out.println("Account Number: "+account2.getAccountType());
		System.out.println("Account Number: "+account2.getAccountBalance());
		
		
	}

}
