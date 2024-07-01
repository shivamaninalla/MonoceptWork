package com.monocept.decoratorCarService.model;

public abstract class CarServiceDecorator implements ICarService{
	
	private ICarService iCarservice;
	

	public CarServiceDecorator(ICarService iCarservice) {
		super();
		this.iCarservice = iCarservice;
	}


	public ICarService getiCarervice() {
		return iCarservice;
	}


	public void setiCarervice(ICarService iCarservice) {
		this.iCarservice = iCarservice;
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return iCarservice.getCost();
	}
	
	

}
