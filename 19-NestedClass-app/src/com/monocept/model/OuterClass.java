package com.monocept.model;

public class OuterClass {
	int number=0;
	public void display() {
		System.out.println("This is outer class");
	}
	public class InnerClass{
		int number=10;
		public void displayInner() {
			int number=20;
			System.out.println("Inner class: "+number);
			System.out.println("This is inner class");
		}
	}

}
