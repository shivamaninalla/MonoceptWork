package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		
		account.createAccount(19, "shivamani", 12.9);
		
		account.createAccount(18, "shiva", 188);
		
		account.createAccount(20, "Mani", 220);
		
		account.display();

	}

}
