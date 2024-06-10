package com.monocept.exceptions;

public class NegativeAmountException extends Exception{
	
	public String getMessage() {
		return "Amount is Negative";
	}

}
