package com.monocept.exceptions;

public class CapacityFullException extends RuntimeException{
	
	public String getMessage() {
		return "The Memory is not sufficient to Add movies";
		
	}
	
	

}
