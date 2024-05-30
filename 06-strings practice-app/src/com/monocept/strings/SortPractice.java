package com.monocept.strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int array[];
		array=new int[5];
		
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			
		}
		
		
		int left=0;
		int right=array.length - 1;
		int i=array.length-1;
		
		
		
		
		int sortedArr[];
		sortedArr=new int[5];
		//sortedArr=[0,0,0,0,0]
		while(left<=right) {
			if(array[left]>array[right]) {
				sortedArr[i]=array[left];
				left++;
			}
			else {
				sortedArr[i]=array[right];
				right--;
			}
			i--;
		}
		System.out.println("Sorted Array: "+Arrays.toString(sortedArr));
	}

	}


