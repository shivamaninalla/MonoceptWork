package com.monocept.adapter.model;

public class HatAdapter implements IItems{
	
	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	public Hat getHat() {
		return hat;
	}

	public void setHat(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getLongName()+hat.getShortName();
		
	}

	@Override
	public int getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBaseprice()+hat.getTax();
		
	}

}
