package com.monocept.assignments;

import java.util.Scanner;

public class PairsAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter size of array: ");
	    int size=scanner.nextInt();
	    int array[]=new int[size];
	    System.out.println("Enter elements: ");
	    int sum=0;
	    int average;
	    for(int i=0;i<size;i++) {
	    	array[i]=scanner.nextInt();
	    	sum+=array[i];
	    }
	    average=sum/size;
	    for(int i=0;i<size;i++) {
	    	
	    	for(int j=0;j<size;j++) {
	    		if(i!=j && array[i]+array[j]==average) {
	    			System.out.println("Pair is: "+array[i]+" "+array[j]);
	    			System.out.println("True");
	    			break;
	    		}
	    		
	    	}
	    }

	}

}
