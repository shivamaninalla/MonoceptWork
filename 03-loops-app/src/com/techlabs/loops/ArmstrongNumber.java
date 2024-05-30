package com.techlabs.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		double sum=0;
		int number1=number;
		double result;
		int len=String.valueOf(number).length();
		while(number!=0) {
			int remainder=number%10;
			result=Math.pow(remainder,len);
			sum+=result;
			number/=10;
		}
		if(number1==sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is Not an Armstrong");
			
		

	}

}
