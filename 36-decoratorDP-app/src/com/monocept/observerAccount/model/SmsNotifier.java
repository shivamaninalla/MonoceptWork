package com.monocept.observerAccount.model;

public class SmsNotifier implements INotifiers{

	@Override
	public void notifyUser(Account account) {
		System.out.println("This is SMS Notification");
		System.out.println("Your Name: "+account.getName());
		System.out.println("The current balance: "+account.getBalance());
		
	}

}
