package com.monocept.adapter.model;

public class Choclate implements IItems{
	
	private String name;
	private int mrp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public Choclate(String name, int mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return name;
		
	}

	@Override
	public int  getItemPrice() {
		// TODO Auto-generated method stub
		return mrp;
	}

}
