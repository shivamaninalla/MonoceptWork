package com.monocept.solid.solution;

import java.util.ArrayList;

import com.monocept.solid.solution.BookSolution;
import com.monocept.solid.solution.UserSolution;

public class BorrowBookUser {

	private BorrowBookSolution borrowBookSolution;

	public BorrowBookUser(BorrowBookSolution borrowBookSolution) {
		super();
		this.borrowBookSolution = borrowBookSolution;

	}

	public BorrowBookUser() {
		this.borrowBookSolution = new BorrowBookSolution(new BookSolution()); // Initialize with a new BookSolution
																				// instance
	}

	public void borrowBook(BookSolution book, UserSolution user) {

		borrowBookSolution.borrowBook(user, book);

		System.out.println(book);

	}

}
