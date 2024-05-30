package com.techlabs.ifelse;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		if(number>0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
