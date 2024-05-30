package com.monocept.mda;

import java.util.Scanner;

public class IncompleteColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows: ");
		
		int rows=scanner.nextInt();
		
		int matrix[][]=new int[3][];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;;j++) {
				matrix[i][j]=scanner.nextInt();
				if(matrix[i][j]==-1) {
					continue;
				}
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			//System.out.println(" ");
		}

	}
//
}
