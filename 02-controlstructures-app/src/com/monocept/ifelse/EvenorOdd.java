package com.monocept.ifelse;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		if(number%2==0) {
			System.out.println("Number is Even");
			
		}
		else
			System.out.println("Number is odd");

	}

}
