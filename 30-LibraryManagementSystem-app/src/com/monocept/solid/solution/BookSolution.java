package com.monocept.solid.solution;

public class BookSolution {
	
	private String title;
	private String author;
	private boolean isBorrowed;
	
	public BookSolution() {
		super();
	}
	
	public BookSolution(String title, String author, boolean isBorrowed) {
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
	
	public BookSolution(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookSolution [title=" + title + ", author=" + author + ", isBorrowed=" + isBorrowed + "]";
	}

}
