package com.monocept.assignments;

import java.util.Scanner;

public class NeighbourBigElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int array[]=new int[size];
		
		int array1[]=new int[10];
		
		int k=0;
		
		if(size==1) {
			System.out.println(array[0]);
		}
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter element: "+(i+1));
			array[i]=scanner.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			if(i==0) {
				if(array[i]>array[i+1]) {
					array1[k]=array[i];
					k++;
				}
				else {
					continue;
				}
			}
			else if(i==size-1) {
				if(array[i]>array[i-1]) {
					array1[k]=array[i];
				
				}
			}
			else {
				if(array[i]>array[i-1] && array[i]>array[i+1]) {
					array1[k]=array[i];
					k++;
				}
				else {
					continue;
				}
			}
		}
		
		for(int i=0;i<k;i++) {
			System.out.println(array1[i]);
		}
		

	}

}
