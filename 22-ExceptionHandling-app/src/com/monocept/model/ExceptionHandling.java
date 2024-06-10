package com.monocept.model;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String args[]) {
		try {
		Scanner scanner=new Scanner(System.in);
		int k=Integer.parseInt(args[0]);
		
		int l=Integer.parseInt(args[1]);

		double d=k/l;
		double division=calculateDivision(k,l);
		System.out.println(division);
		}
		
		catch(ArithmeticException e){
			System.out.println("You cannot divide by Zero. Change value of l.");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Wrong number of inputs");
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("Bye");
	}
	private static double calculateDivision(int k,int l) {
		double d=0;
		try {
		d= k/l;
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter other value which is not equal to zero");
		}
		
		
		
		return d;
	}
	

}
