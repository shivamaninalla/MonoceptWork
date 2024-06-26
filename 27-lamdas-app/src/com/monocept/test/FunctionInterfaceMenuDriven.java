package com.monocept.test;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=false;
		Scanner scanner=new Scanner(System.in);
		while(!x) {
			System.out.println("Enter your choice");
			System.out.println("1.Function\n2.BiFunction\n3.UnaryOperator\n4.BinaryOperator\n5.Exit");
			System.out.println("Enter operation");
			switch(scanner.nextInt()) {
			case 1:System.out.println("Enter string: ");
			String string=scanner.next();
			Function<String,Integer> function1=FunctionInterfaceMenuDriven::kunction;
			int length=function1.apply(string);
			System.out.println(length);
			break;
			
			case 2:System.out.println("Enter 2 strings: ");
			String string1=scanner.next(),string2=scanner.next();
			BiFunction<String,String,Integer> function2=FunctionInterfaceMenuDriven::biFunctionn;
			int length2=function2.apply(string1, string2);
			System.out.println(length2);
			break;
			
			case 3:
			}
		}

	}

	private static Integer kunction(String string1) {
		Function<String,Integer> function=(string)-> { return string1.length();};
		
		return function.apply(string1);
		
		
		
	}
	private static Integer biFunctionn(String string1,String string2) {
            BiFunction<String,String,Integer> function=(string,stringt)-> { return (string1+string2).length();};
		
		return function.apply(string1,string2);
	}

}
