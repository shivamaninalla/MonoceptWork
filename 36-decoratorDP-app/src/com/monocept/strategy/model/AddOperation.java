package com.monocept.strategy.model;

public class AddOperation implements IOperation{

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Addition Operation";
	}

	

}
