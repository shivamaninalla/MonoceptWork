package com.monocept.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

import com.monocept.model.InsurancePolicy;
import com.monocept.model.InsurancePolicyComparator;

public class InsurancePolicyTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many policies: ");
		int size=scanner.nextInt();
		ArrayList<InsurancePolicy> insurancePolicy=new ArrayList<InsurancePolicy>(size);
		System.out.println("Enter Details of Insurance Policy");
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Policy Number: ");
			int policyNumber=scanner.nextInt();
			System.out.println("Enter Policy Holder Name: ");
			String name=scanner.next();
			System.out.println("Enter amount: ");
			double amount=scanner.nextDouble();
			System.out.println("Please enter creation date according to given statements");
			System.out.println("Enter date: ");
            int dat=scanner.nextInt();
            System.out.println("Enter Month: ");
			int month=scanner.nextInt();
			System.out.println("Enter year: ");
			int year=scanner.nextInt();
			LocalDate date=LocalDate.of(year, month, dat);
			insurancePolicy.add(new InsurancePolicy(policyNumber,name,amount,date));
		}
		
		boolean x=true;
		while(x) {
			System.out.println("1.Sort by Name\n2.Sort by Ammount\n3.Sort by Creation date\n4.Exit");
			int number=scanner.nextInt();
			switch(number) {
			case 1: System.out.println("You selected sort by name");
			Collections.sort(insurancePolicy,new InsurancePolicyComparator.InsurancePolicyByName());
			System.out.println(insurancePolicy);
			break;
			case 2: System.out.println("You selectd sort by amount");
			Collections.sort(insurancePolicy,new InsurancePolicyComparator.InsurancePolicyByAmount());
			System.out.println(insurancePolicy);
			break;
			case 3:System.out.println("You selectd sort by creation date");
			Collections.sort(insurancePolicy,new InsurancePolicyComparator.InsurancePolicyByCreationDate());
			System.out.println(insurancePolicy);
			break;
			case 4:System.out.println("You got exit");
			x=false;
			break;

			}
		}

	}

}
