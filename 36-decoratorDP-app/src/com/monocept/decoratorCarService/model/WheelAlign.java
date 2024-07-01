package com.monocept.decoratorCarService.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService iCarservice) {
		super(iCarservice);
		// TODO Auto-generated constructor stub
	}
	
	

	public double getCost() {
		// TODO Auto-generated method stub
		return this.getiCarervice().getCost()+400;
	}
	

}
