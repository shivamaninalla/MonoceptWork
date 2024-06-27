package com.monocept.solid.violation;

import java.util.ArrayList;

public class User {
	
	private String name;
	private String userId;
	
	private Book boook;
	
	
	
	
	public User(Book boook) {
		super();
		this.boook = boook;
	}




	static ArrayList<User> list=new ArrayList<User>();
	
	public User() {
		super();
	}
	
	public User(String name, String userId) {
		super();
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void registerUser(User user) {
		list.add(user);
	System.out.println("registartion completed");
		for(User l:list) {
			System.out.println(l);
		}
	}
	
	

	

	

	

	

	public void borrowBook(Book book, User user) {
		
				book.borrowBook(user,book);
				
				
				System.out.println(book);
				
		
				
			
		 
		
		
		
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + "]";
	}
	

}
