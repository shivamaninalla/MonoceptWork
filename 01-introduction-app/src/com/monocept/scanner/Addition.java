package com.monocept.scanner;

import java.util.Scanner;

public class Addition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int Number1= scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int Number2= scanner.nextInt();
		System.out.println("Enter Third Number: ");
		int Number3=scanner.nextInt();
		
		int sum=Number1+Number2+Number3;
		
		System.out.println("Addition is: "+sum);

	}

}
