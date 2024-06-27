package com.monocept.creational.factory.test;

import java.util.Scanner;

import com.monocept.creational.factory.model.AccountFactory;
import com.monocept.creational.factory.model.IAccount;
import com.monocept.creational.factory.model.SavingsAccounttt;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		boolean x=true;
		while(x) {
			System.out.println("1.SavingsAccount\n2.CurrentAccount\3.Exit");
			System.out.println("Enter yoour choice");
			int number=scanner.nextInt();
			switch(number) {
			
			case 1:System.out.println("You choosen savings account");
			save(scanner);
			break;
			case 2:System.out.println("You choosen current account");
			break;
			case 3:System.out.println("You got exit");
			x=false;
			}
		}

	}

	private static void save(Scanner scanner) {
		System.out.println("1.Create New savings Account\n2.Debit\n3.credit");
		System.out.println("Enter your choice");
		int n=scanner.nextInt();
		switch(n) {
		case 1: createNewSave(scanner);
		break;
		case 2:debitAmount();
		break;
		case 3: creditAmount();
		
		}
		
	}

	private static void creditAmount() {
		// TODO Auto-generated method stub
		
	}

	private static void debitAmount(Scanner scanner) {
		System.out.println("Enter account number: ");
		int a=scanner.nextInt();
		System.out.println("You choosed debit");
		System.out.println("Enter amount:");
		int amount=scanner.nextInt();
		if()
		
	}

	private static void createNewSave(Scanner scanner) {
		IAccount iAccount;
		iAccount=AccountFactory.getIAccount("savings");
		if(iAccount instanceof SavingsAccounttt) {
			System.out.println("Enter Account Number: ");
			int a=scanner.nextInt();
			((SavingsAccounttt) iAccount).setAccountNumber(a);
			System.out.println("Enter account name: ");
			String name=scanner.next();
			((SavingsAccounttt) iAccount).setName(name);
			System.out.println("Enter balance: ");
			double balance=scanner.nextDouble();
			((SavingsAccounttt) iAccount).setBalance(balance);
			
		}
		
	}

}
