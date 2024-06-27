package com.monocept.creational.singleton.test;

import com.monocept.creational.singleton.model.Login;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login=Login.getLogin();
		System.out.println(login.getMessage());
		System.out.println(login.hashCode());
		
		Login login2=Login.getLogin();
		System.out.println(login.getMessage());
		System.out.println(login2.hashCode());

	}

}
