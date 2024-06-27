package com.monocept.creational.factory.model;

public class AccountFactory {

	private static IAccount iAccount;
	
	public static IAccount getIAccount(String accountName) {
		if("savings".equals(accountName))
			iAccount=new SavingsAccounttt();
		if("current".equals(accountName))
			iAccount=new CurrentAccount();
		
		return iAccount;
	}

}

