package com.monocept.typecasting;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array=new int[11];
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=array.length;i++) {
			System.out.println("Enter value "+i+": ");
			array[i]=scanner.nextInt();
			sum+=array[i];
		}
		System.out.println("Sum of elements: "+sum);
		System.out.println(array.length);
		
	}

}
