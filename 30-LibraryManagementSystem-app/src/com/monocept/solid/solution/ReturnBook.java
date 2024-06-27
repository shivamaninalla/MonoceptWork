package com.monocept.solid.solution;

import com.monocept.solid.solution.BookSolution;
import com.monocept.solid.solution.UserSolution;

public class ReturnBook {
	
	private BookSolution bookSolution;
	
	
	public ReturnBook() {
		super();
		this.bookSolution = bookSolution;
	}


	public void returnBook(UserSolution user,BookSolution b) {
		b.setBorrowed(false);
		System.out.println(user+" returned the book");
	}
	

}
