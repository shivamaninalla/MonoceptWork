package com.monocept.adapter.model;

public class Hat {
	
	private String shortName;
	private String longName;
	private int baseprice;
	private int tax;
	public String getShortName() {
		return shortName;
	}
	public Hat(String shortName, String longName, int baseprice, int tax) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.baseprice = baseprice;
		this.tax = tax;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public int getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	

}
