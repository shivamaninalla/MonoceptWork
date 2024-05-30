package com.techlabs.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		int i=number/2;
		int sum=0;
		while(i>=1) {
			if(number%i==0) {
				sum+=i;
			}
			i--;
		}
		if(number==sum) {
			System.out.println("Number is Perfect NUmber");
		}
		else {
			System.out.println("Number is Not Perfect Number");
		}

	}

}
