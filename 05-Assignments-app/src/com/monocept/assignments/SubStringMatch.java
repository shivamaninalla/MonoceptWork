package com.monocept.assignments;

import java.util.Scanner;

public class SubStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String original=scanner.nextLine();
		String subString=scanner.nextLine();
		
		int count=original.length()-subString.length();
		
		
		for(int i=0;i<=count;i++) {
			String Found=original.substring(i,(i+subString.length()));
			if(Found.equals(subString)) {
				System.out.println("You Found Substring");
				break;
			}
			
		}
		
		

	}

}
