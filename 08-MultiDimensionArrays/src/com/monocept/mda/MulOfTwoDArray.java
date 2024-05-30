package com.monocept.mda;

import java.util.Scanner;

public class MulOfTwoDArray {

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
		
		
		
		int arrayMul[][];
		arrayMul=new int[rows][columns];
		
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
				for(int n=0;n<rows;n++) {
					arrayMul[i][j]+=array1[i][n]*array2[n][j];
				}
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arrayMul[i][j]+"\t");
			}
			System.out.println(" ");
		}
		

	}

}
