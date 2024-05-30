package com.monocept.assignments;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		System.out.println("Enter elements: ");
		int array[]=new int[size];
		int max=0,secondMax=0;
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		for(int i=0;i<size;i++) {
			if(array[i]>secondMax && array[i]<max) {
				secondMax=array[i];
			}
		}
		System.out.println("Second largest element: "+secondMax);
		

	}

}
