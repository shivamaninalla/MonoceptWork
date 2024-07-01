package com.monocept.decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Standard hat";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "100 rs";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Hat is standard one";
	}

}
