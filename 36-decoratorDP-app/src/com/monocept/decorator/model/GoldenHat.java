package com.monocept.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat iHat) {
		super(iHat);
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden Hat"+this.getiHat().getName();
	}


	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "Golden Hat"+this.getiHat().getPrice();
	}


	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Golden hat"+this.getiHat().description();
	}
	
	

	

}
