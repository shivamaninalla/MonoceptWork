package com.techlabs.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		int i=number/2;
		int flag=0;
		while(i>=2) {
			if (number%i==0) {
				
				flag=1;
				break;
			}
			i--;
			
		
		}
		if(flag==1) {
			System.out.println(number+" is not prime");
		}
		else
			System.out.println(number+" is prime");

	}

}
