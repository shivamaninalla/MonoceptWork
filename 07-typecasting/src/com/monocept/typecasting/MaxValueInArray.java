package com.monocept.typecasting;

import java.util.Scanner;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];
		array=new int[11];
		int sum=0;
		int max=0;
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<array.length;i++) {
			System.out.println("Enter value "+i+": ");
			array[i]=scanner.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The maximum value is: "+max);

	}

}
