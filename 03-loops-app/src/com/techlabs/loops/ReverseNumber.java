package com.techlabs.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		int reverse=0;
		while(number!=0) {
			int remainder=number%10;
			reverse= reverse*10+remainder;
			number=number/10;
		}
		System.out.println("Reversed Number: "+reverse);

	}

}
