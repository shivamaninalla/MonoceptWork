package com.monocept.decorator.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Premium hat";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "200 rs";
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Hat is premium one";
	}

}
