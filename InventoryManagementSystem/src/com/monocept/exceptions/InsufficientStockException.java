package com.monocept.exceptions;

public class InsufficientStockException extends RuntimeException{
	public String getMessage() {
		return "Stock is insufficient";
	}

}
