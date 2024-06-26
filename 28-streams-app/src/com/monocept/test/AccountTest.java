package com.monocept.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimumBalance=2000;
		int maximumBalance=5000;
		Scanner scanner=new Scanner(System.in);
		List<Account> list=new ArrayList();
		for(int i=1;i<3;i++) {
			System.out.println("Enter account number: ");
			long accountNumber=scanner.nextLong();
			System.out.println("Enter account Name: ");
			String name=scanner.next();
			System.out.println("Enter balance: ");
			double balance=scanner.nextDouble();
			list.add(new Account(accountNumber,name,balance));
		}
		
		
		DoubleStream accountDetailsMinimum=list.stream().mapToDouble(x->x.getBalance()).sorted().limit(1);
		accountDetailsMinimum.forEach(x->System.out.println(x));
		
		
		
		OptionalDouble accountDetailsMaximum=list.stream().mapToDouble(x->x.getBalance()).sorted().max();
	
	accountDetailsMaximum.ifPresent(x->System.out.println(x));
	
	List<String> namesGreaterThanSixCharacters=list.stream().filter(x->x.getName().length()>6).map(x->x.getName()).collect(Collectors.toList());
	namesGreaterThanSixCharacters.forEach(x->System.out.println(x));
	
	double totalBalance=list.stream().mapToDouble(x->x.getBalance()).reduce(0,(c,x)->c+x);
	System.out.println(totalBalance);
		

	}

}
