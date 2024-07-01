package com.monocept.decorator.model;

public class RibonedHat extends HatDecorator{

	public RibonedHat(IHat iHat) {
		super(iHat);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Riboned Hat"+this.getiHat().getName();
	}


	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "Riboned Hat"+this.getiHat().getPrice();
	}


	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Riboned hat"+this.getiHat().description();
	}

}
