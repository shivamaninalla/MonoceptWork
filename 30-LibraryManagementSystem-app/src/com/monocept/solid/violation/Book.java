package com.monocept.solid.violation;

import java.util.ArrayList;

public class Book {
	
	private String title;
	private String author;
	private boolean isBorrowed;
	public Book(String title, String author, boolean isBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void borrowBook(User user,Book book) {
		book.isBorrowed=true;
		System.out.println(user.getName() +" is borrowed");
		
		
	}
	public Book() {
		super();
	}

	public void returnBook(User user,Book b) {
		b.isBorrowed=false;
		System.out.println(user+" returned the book");
	}
	
	static ArrayList<Book> books = new ArrayList<Book>();
	public void catalogBook(Book book) {
		books.add(book);
		//System.out.println(books);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isBorrowed=" + isBorrowed + "]";
	}

}
