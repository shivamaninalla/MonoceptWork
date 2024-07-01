package com.monocept.observerAccount.model;

public class EmailNotifier implements INotifiers{

	@Override
	public void notifyUser(Account account) {
		System.out.println("This is Email Notification");
		System.out.println("Your Name: "+account.getName());
		System.out.println("The current balance: "+account.getBalance());
		
	}
	

}
