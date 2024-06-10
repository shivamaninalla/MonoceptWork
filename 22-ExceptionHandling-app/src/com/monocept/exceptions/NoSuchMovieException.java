package com.monocept.exceptions;

public class NoSuchMovieException extends RuntimeException{
	
	public String getMessage() {
		return "No such movie is Available.";
		
	}

}
