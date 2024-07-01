package com.monocept.decoratorCarService.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService iCarservice) {
		super(iCarservice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.getiCarervice().getCost()+500;
	}
	
	
	

}
