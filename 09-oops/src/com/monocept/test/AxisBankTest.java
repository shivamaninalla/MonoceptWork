package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.AccountType;
import com.monocept.model.AxisBank;

public class AxisBankTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AxisBank accounts[]=new AxisBank[3];
		
		for(int i=0;i<accounts.length;i++) {
			accounts[i]=new AxisBank();
			System.out.println("Enter Account Number: ");
			accounts[i].setAccountNumber(scanner.nextInt());
			System.out.println("Enter Account Name: ");
			accounts[i].setName(scanner.next());
			System.out.println("Enter Account Balance: ");
			accounts[i].setBalance(scanner.nextDouble());
			System.out.println("Enter Account Type: For savings: Press1 and for current: press 2");
			int accountType=scanner.nextInt();
			if(accountType==1)
				accounts[i].setAccountType(AccountType.Savings);
			if(accountType==2)
				accounts[i].setAccountType(AccountType.Current);
			
			
		}
		for(int i1=0;i1<accounts.length;i1++) {
			System.out.println(accounts[i1]);
			System.out.println("");
		}
		

	}

	
	

}
