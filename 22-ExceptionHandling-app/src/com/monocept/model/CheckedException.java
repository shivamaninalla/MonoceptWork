package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		FileReader fileReader = null;
		
		fileReader = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\workspace\\22-ExceptionHandling-app\\src\\com\\monocept\\model\\Demo1.txt");
		
		
		System.out.println(fileReader);
		
		
		
//		String str1="abc";
//		int number1=Integer.parseInt(str1);
//		System.out.println(number1);
	
		//System.out.println("please enter number2");
		//int number2=scanner.nextInt();
		
throw new NullPointerException();
	}

	

}
