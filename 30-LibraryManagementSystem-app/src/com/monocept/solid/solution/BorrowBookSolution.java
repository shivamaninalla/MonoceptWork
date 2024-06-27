package com.monocept.solid.solution;

import com.monocept.solid.solution.BookSolution;
import com.monocept.solid.solution.UserSolution;

public class BorrowBookSolution {
	private BookSolution bookSolution;
	
	
	
	public BorrowBookSolution(BookSolution bookSolution) {
		super();
		this.bookSolution = bookSolution;
	}



	public void borrowBook(UserSolution user,BookSolution book) {
		book.setBorrowed(true);
		System.out.println(user.getName() +" is borrowed");
		
		
	}

}
