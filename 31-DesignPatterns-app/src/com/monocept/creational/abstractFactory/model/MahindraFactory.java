package com.monocept.creational.abstractFactory.model;

public class MahindraFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return new Mahindra();
		
	}

}
