package com.monocept.solid.violation;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		
		User user=new User();
		Book book=new Book();
		
		Random random=new Random();
		
		boolean x=true;
		while(x) {
			System.out.println("1.User registration\n2.Add a book\n3.Borrow a book\n4.Return a book\n5.List of books\n6.List of Users\n7.Exit");
			System.out.println("Enter your choice: ");
			int c=scanner.nextInt();
			switch(c) {
			case 1: userRegistration(scanner, random, user);
			break;
			case 2: addBook(scanner, book);
			break;
			case 3:bookBorrow(scanner,user,book);
			break;
			case 4:bookReturn(scanner, user, book);
			break;
			case 5:listofBooks(book);
			break;
			case 6:listofUsers(user);
			break;
			case 7:System.out.println("You got exit");
			x=false;
			
			}
		}
		
		
	
		
		
		
	
		
		

	}

	private static boolean bookReturn(Scanner scanner, User user, Book book) {
		System.out.println("Enter user name: ");
		String name=scanner.next();
		if(checkUser(name,user)) {
			System.out.println("Enter the book name: ");
			String booky=scanner.next();
			for(Book books:book.books) {
				if(booky.equals(books.getTitle()) && books.isBorrowed()==true) {
					book.returnBook(user,name,books);
					return true;
				}
			}
			
			
		}
		System.out.println("You havent borrowed that book");
		return false;
		
	}

	private static boolean bookBorrow(Scanner scanner, User user, Book book) {
		System.out.println("Enter user name: ");
		String name=scanner.next();
        if(checkUser(name, user)) {
		System.out.println("Enter title of book you want: ");
		String b=scanner.next();
		for(User u:user.list) {
			if(u.getName().equals(name)) {
				 user.borrowBook(book, u,b);
			}
		}
		
		 
		
		
			
		
        }
       
		return false;
	}

	private static boolean checkUser(String name, User user) {

		for(User users:user.list) {
			if(name.equals(users.getName())) {
				System.out.println("You are verified");
				
				return true;
			}
			System.out.println("You are not verified");
		}
		return false;
		
	}

	private static void listofBooks(Book book) {
		System.out.println(book.books);
		
	}

	private static void addBook(Scanner scanner,Book book) {
		System.out.println("Enter title of the book: ");
		String name=scanner.next();
		System.out.println("Enter author of the book: ");
		String author=scanner.next();
		Book book1=new Book(name,author,false);
		book1.catalogBook(book1);
		
	}

	private static void listofUsers(User user) {
		System.out.println(user.list);
		
	}

	private static void userRegistration(Scanner scanner,Random random,User user) {
		System.out.println("Enter your name: ");
		String name=scanner.next();
		int ide=random.nextInt(6);
		String s="monocept";
		String id=String.format("%s%d",s,ide);
		User user1=new User(name,id);
		user1.registerUser(user1);
		
		
		
	}

}
