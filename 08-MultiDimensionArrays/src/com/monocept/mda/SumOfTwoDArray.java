package com.monocept.mda;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("enter number of rows: ");
		
		int rows=scanner.nextInt();
		
		System.out.println("enter number of columns: ");
		
		int columns=scanner.nextInt();
		
		int array1[][];
		array1=new int[rows][columns];
		
		int array2[][];
		array2=new int[rows][columns];
		
		
		
		int arraySum[][];
		arraySum=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array1[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array2[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arraySum[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arraySum[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		

	}

}
