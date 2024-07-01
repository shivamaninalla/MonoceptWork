package com.monocept.decorator.model;

public abstract class HatDecorator implements IHat{
	private IHat iHat;
	
	

	public IHat getiHat() {
		return iHat;
	}


	public void setiHat(IHat iHat) {
		this.iHat = iHat;
	}


	public HatDecorator(IHat iHat) {
		super();
		this.iHat = iHat;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return iHat.getName();
	}


	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return iHat.getPrice();
	}


	@Override
	public String description() {
		// TODO Auto-generated method stub
		return iHat.description();
	}

	
	

}
