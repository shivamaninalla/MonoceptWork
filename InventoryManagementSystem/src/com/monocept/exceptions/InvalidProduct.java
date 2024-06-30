package com.monocept.exceptions;

public class InvalidProduct extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid product id";
	}

}
