package com.monocept.model;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		
		Scanner scanner=new Scanner(System.in);
		
		createRows(matrix,scanner);
		
		displayMatrix(matrix);
		

	}

	private static void displayMatrix(int[][] matrix) {
		for(int i=0;i<3;i++) {
			displyColumns(i,matrix);
		}
		
	}

	private static void displyColumns(int i, int[][] matrix) {
		for(int j=0;j<3;j++) {
			System.out.print(matrix[i][j]);
		}
		System.out.println(" ");
	}

	private static void createRows(int[][] matrix, Scanner scanner) {
		for(int i=0;i<3;i++) {
			createColumns(i,matrix,scanner);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner scanner) {
		for(int j = 0;j<3;j++) {
			matrix[i][j]=scanner.nextInt();
		}
		
	}

}
