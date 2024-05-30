package com.techlabs.loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int factorial=1;
		for(int i=number;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
