package com.monocept.observerAccount.test;

import com.monocept.observerAccount.model.Account;
import com.monocept.observerAccount.model.EmailNotifier;
import com.monocept.observerAccount.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account account=new Account(1, "Shivamani", 1000);
		account.registerNotifier(new EmailNotifier());
		account.registerNotifier(new SmsNotifier());
		account.withdraw(200);
		System.out.println("------");
		account.deposit(10000);

	}

}
