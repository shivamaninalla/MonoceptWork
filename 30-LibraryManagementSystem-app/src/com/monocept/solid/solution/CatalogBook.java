package com.monocept.solid.solution;

import java.util.ArrayList;

import com.monocept.solid.solution.BookSolution;

public class CatalogBook implements ICatalogBook{
	
	private ArrayList<BookSolution> bookSolution;
	
	public ArrayList<BookSolution> getBooks(){
		return bookSolution;
	}
	
	
	public CatalogBook() {
		super();
		this.bookSolution = new ArrayList<>();
	}
	public CatalogBook(ArrayList<BookSolution> bookSolution) {
		super();
		this.bookSolution = bookSolution;
	}

	@Override
	public void catalogBook(BookSolution book) {
		bookSolution.add(book);
		//System.out.println(books);
	}


	


	





	


	

}
