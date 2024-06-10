package com.monocept.model;

public class StaticClass {
	 int k;
	 public void display() {
		 System.out.println("Outer class");
	 }
	 
	 public static class StaticInnerClas {
		
		public static void displayInner() {
			//k=3;
		
			System.out.println("Static inner class");
		}
	}

}
