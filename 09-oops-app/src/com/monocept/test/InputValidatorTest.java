package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.InputValidator;

public class InputValidatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputValidator inputValidator=new InputValidator();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String userName=scanner.next();
		System.out.println("Enter Password: ");
		String password=scanner.next();
		System.out.println("Enter Email: ");
		String email=scanner.next();
		
		inputValidator.setUserName(userName);
		inputValidator.setPassword(password);
		inputValidator.setPassword(email);
		
		boolean u=InputValidator.userNameCheck(userName);
		boolean p=inputValidator.passwordCheck( password);
		boolean e=inputValidator.emailCheck(email);
		
		
		display(u,p,e);
			
			
		
		

	}

	private static void display(boolean u, boolean p, boolean e) {
		if(u&p&u) {
			System.out.println("Valid");
			return ;
	}
		System.out.println("InValid");
		
		return ;}

}
