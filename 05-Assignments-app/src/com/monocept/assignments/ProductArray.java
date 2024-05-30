package com.monocept.assignments;

import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int length=scanner.nextInt();
		
		int product=1,k=0;
		
		int array[]=new int[length];
		
		int arr[]=new int[length];
		
		
		
		for(int i=0;i<length;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<length;i++) {
			product=product*array[i];
			
		}
		for(int i=0;i<length;i++) {
			arr[i]=product/array[i];
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

}
