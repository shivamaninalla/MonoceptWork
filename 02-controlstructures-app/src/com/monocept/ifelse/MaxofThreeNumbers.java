package com.monocept.ifelse;

import java.util.Scanner;

public class MaxofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		if(number1>number2 && number1>number3) {
			System.out.println("Number1 is greater");
			
		}
		else if(number2>number1 && number2>number3) {
			System.out.println("Number2 is greater");
		}
		else {
			System.out.println("Number3 is greater");
		}

	}

}
