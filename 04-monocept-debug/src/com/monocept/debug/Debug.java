package com.monocept.debug;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=10;
		int number2=20;
		
		int sum=addition(number1,number2);
		
		double average=calculateAverage(sum);
		
		System.out.println("Average: "+average);

	}
	
	private static int addition(int number1, int number2) {
		System.out.println("Inside Addition");
		System.out.println("ouside Addition");
		
		return number1+number2;
	}
	private static double calculateAverage(int sum) {
		return sum/2;
	}

}
