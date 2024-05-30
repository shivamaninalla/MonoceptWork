package com.monocept.model;

public class ComplexNumber {
	
	private int real;
	private int imagenary;
	
	public ComplexNumber() {
		this(4,3);
	}
	public ComplexNumber(int real,int imagenary) {
		this.real=real;
		this.imagenary=imagenary;
	}
	public void setReal(int real) {
		this.real=real;
	}
	public int getReal() {
		return real;
	}
	public void setImagenary(int imagenary) {
		this.imagenary=imagenary;
	}
	public int getImagenary() {
		return imagenary;
	}
	public String Addition(ComplexNumber number1, ComplexNumber number2) {
		int additionReal= number1.real+number2.real;
		int additionImagenary=number1.imagenary+number2.imagenary;
		return additionReal+"+i"+additionImagenary;
	}

}
