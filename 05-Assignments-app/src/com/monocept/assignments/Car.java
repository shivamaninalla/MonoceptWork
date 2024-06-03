package com.monocept.assignments;

public class Car extends FourWheeler{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [CarName: "+getCompanyName()+" , CarMileage: "+getMileage()+", CarPrice: "+getPrice()+"]";
	}



	
	
	
	

}
