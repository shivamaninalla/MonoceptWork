package com.monocept.solid.solutionTest;

import java.util.Random;
import java.util.Scanner;

import com.monocept.solid.solution.BookSolution;
import com.monocept.solid.solution.BorrowBookUser;
import com.monocept.solid.solution.CatalogBook;
import com.monocept.solid.solution.ICatalogBook;
import com.monocept.solid.solution.IRegister;
import com.monocept.solid.solution.RegisterUser;
import com.monocept.solid.solution.ReturnBook;
import com.monocept.solid.solution.UserSolution;

public class SolutionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		
		UserSolution user=new UserSolution();
		BookSolution book=new BookSolution();
		
		RegisterUser registerUser=new RegisterUser();
	//	CatalogBook catalogBook=new CatalogBook();
		ICatalogBook catalogBook1=new CatalogBook();
		BorrowBookUser borrowBookUser=new BorrowBookUser();
		Random random=new Random();
		ReturnBook returnBook=new ReturnBook();
		IRegister iRegister=new RegisterUser();
		
		boolean x=true;
		while(x) {
			System.out.println("1.User registration\n2.Add a book\n3.Borrow a book\n4.Return a book\n5.List of books\n6.List of Users\n7.Exit");
			System.out.println("Enter your choice: ");
			int c=scanner.nextInt();
			switch(c) {
			case 1: userRegistration(scanner, random, user, iRegister);
			break;
			case 2: addBook(scanner, book, catalogBook1);
			break;
			case 3:bookBorrow(scanner,user,book, registerUser, catalogBook1, borrowBookUser);
			break;
			case 4:bookReturn(scanner, user, book, registerUser, catalogBook1, returnBook);
			break;
			case 5:listofBooks(book, catalogBook1);
			break;
			case 6:listofUsers(registerUser);
			break;
			case 7:System.out.println("You got exit");
			x=false;
			
			}
		}
		
		
	
		
		
		
	
		
		

	}

	

	private static boolean bookReturn(Scanner scanner, UserSolution user, BookSolution book, RegisterUser registerUser, ICatalogBook catalogBook, ReturnBook returnBook) {
		System.out.println("Enter user name: ");
		String name=scanner.next();
		UserSolution checkUser1=checkUser(name,user, registerUser);
		if(checkUser1!=null) {
			System.out.println("Enter the book name: ");
			String booky=scanner.next();
			for(BookSolution books:catalogBook.getBooks()) {
				if(booky.equals(books.getTitle()) && books.isBorrowed()==true) {
					returnBook.returnBook(checkUser1,books);
					return true;
				}
			}
			System.out.println("You havent borrowed that book");
			
		}
		
		return false;
		
	}

	private static boolean bookBorrow(Scanner scanner, UserSolution user, BookSolution book, IRegister registerUser, ICatalogBook catalogBook, BorrowBookUser borrowBookUser) {
		System.out.println("Enter user name: ");
		String name=scanner.next();
		
		UserSolution c=checkUser(name, user, registerUser);
        if(c!=null) {
		System.out.println("Enter title of book you want: ");
		String b=scanner.next();

		for(BookSolution books:catalogBook.getBooks()) {
			if(b.equals(books.getTitle()) && books.isBorrowed()==false) {
				System.out.println("Book is present and you borrowed");
				borrowBookUser.borrowBook(books, c);
				return true;
			}
		}
		 
		System.out.println("Sorry book is not present");
		
			
		
        }
       
		return false;
	}

	private static UserSolution checkUser(String name, UserSolution user,IRegister registerUser) {

		for(UserSolution registerUser1:registerUser.getUsers()) {
			if(name.equals(registerUser1.getName())) {
				System.out.println("You are verified");
				
				return registerUser1;
			}
			
		}
		System.out.println("You are not verified");
		return null;
		
	}

	private static void listofBooks(BookSolution book, ICatalogBook catalogBook) {
		System.out.println(catalogBook.getBooks());
		
	}

	private static void addBook(Scanner scanner,BookSolution book, ICatalogBook catalogBook1) {
		System.out.println("Enter title of the book: ");
		String name=scanner.next();
		System.out.println("Enter author of the book: ");
		String author=scanner.next();
		BookSolution book1=new BookSolution(name,author,false);
		catalogBook1.catalogBook(book1);
		
	}

	private static void listofUsers(IRegister user) {
		System.out.println(user.getUsers());
		
	}

	private static void userRegistration(Scanner scanner,Random random,UserSolution user,IRegister registerUser) {
		System.out.println("Enter your name: ");
		String name=scanner.next();
		int ide=random.nextInt(6);
		String s="monocept";
		String id=String.format("%s%d",s,ide);
		UserSolution registerUser1=new UserSolution(name,id);

		registerUser.registerUser(registerUser1);
		
		
		
	}

}
