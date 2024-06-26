package com.monocept.mda;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int rows1 = 0;
        int columns1 = 0;
        int rows2 = 0;
        int columns2 = 0;
		System.out.println("Rule: Number of columns in the first matrix should be equal to the number of rows in the second matrix");
		
		
		while(true) {
			System.out.println("Enter number of rows in first matrix: ");
			rows1=scanner.nextInt();
			
			System.out.println("enter number of columns in first matrix: ");
			columns1=scanner.nextInt();
			
			System.out.println("Enter number of rows in second matrix: ");
			rows2=scanner.nextInt();
			
			System.out.println("Enter number of columns in second matrix: ");
			columns2=scanner.nextInt();
			
			if(columns1!=rows2)
				System.out.println("Please check the rule and give correct dimension");
			else 
				break;
			
		}
		
		
		
		
		int array1[][];
		array1=new int[rows1][columns1];
		
		int array2[][];
		array2=new int[rows2][columns2];
		
		System.out.println("Enter elements in first matrix");
		
		
		int arrayMul[][];
		arrayMul=new int[rows1][columns2];
		
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns1;j++) {
				array1[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter elements in second matrix");
		
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<columns2;j++) {
				array2[i][j]=scanner.nextInt();
			}
		}
		
		
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns2;j++) {
				for(int n=0;n<columns1;n++) {
					arrayMul[i][j]+=array1[i][n]*array2[n][j];
				}
			}
		}
		
		System.out.println("Resultant matrix");
		
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<columns2;j++) {
				System.out.print(arrayMul[i][j]+"\t");
			}
			System.out.println(" ");
		}
		

	}

}
