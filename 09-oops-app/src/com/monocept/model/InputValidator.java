package com.monocept.model;

import java.util.Scanner;

public class InputValidator {
	
	private static boolean validate(String input, int minLength, int maxLength) {
		if(input==null || input=="" || input.length()<minLength || input.length()>maxLength)
			return false;
		return true;
	}
	public static boolean userNameCheck(String userName) {
		return validate(userName, 3, 20);
		
	}
	public static boolean passwordCheck(String password) {
		return validate(password,5,30);
	}
	public static boolean emailCheck(String email) {
		if(!validate(email,5,50))
			return false;
		if(email.contains("@") && email.contains("."))
			return true;
		return false;
			
	}
	public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String userName=scanner.next();
		System.out.println("Enter Password: ");
		String password=scanner.next();
		System.out.println("Enter Email: ");
		String email=scanner.next();
		boolean u=userNameCheck(userName);
		boolean p= passwordCheck(password);
		boolean e=emailCheck(email);
		System.out.println(u);
		System.out.println(p);
		System.out.println(e);
		if(display(u,p,e))
			System.out.println("Valid");
		if(!display(u,p,e))
			System.out.println("InValid");

	}
	private static boolean display(boolean u, boolean p, boolean e) {
		if(u==true&p==true&e==true) 
			
			return true;
		
			
		
		return false;
	}

}

