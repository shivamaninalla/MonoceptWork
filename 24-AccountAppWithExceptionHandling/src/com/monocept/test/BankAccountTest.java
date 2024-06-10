package com.monocept.test;

import java.util.Scanner;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;
import com.monocept.model.BankAccountClass;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		BankAccountClass bankAccount=new BankAccountClass();
		
		System.out.println("Enter the balance you want to set: ");
		double balance1=scanner.nextDouble();
		
		bankAccount.setBalance(balance1);
		
		System.out.println("Enter the amount you want to deposit: ");
		
		double deposit1=scanner.nextDouble();

		bankAccount.deposit(deposit1);
		System.out.println(bankAccount.getBalance());
		
		try {
			System.out.println("Enter amount you want to withdrawl: ");
			double amount=scanner.nextDouble();
			bankAccount.withDrawl(amount);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
