package com.monocept.exceptions;

public class AgeInvalidException extends RuntimeException{
	
	public String getMessage() {
		return "Age is not valid to cast vote";
	}

}
