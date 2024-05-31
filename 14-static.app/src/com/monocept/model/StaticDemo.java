package com.monocept.model;

public class StaticDemo {
	
	private int number1;
	
	private static int number2;
	
	public StaticDemo() {
		number1=0;
		number2=0;
	}
	public void increment() {
		number1++;
		number2++;
	}
	public void display() {
		System.out.println("Number1: "+number1);
		System.out.println("Number2: "+number2);
	}
	{
		System.out.println("Non static block");
	}
	static {
		System.out.println("Static block");
	}
	
	

}
