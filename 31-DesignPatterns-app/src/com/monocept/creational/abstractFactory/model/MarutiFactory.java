package com.monocept.creational.abstractFactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public Maruti makeCar() {
		return new Maruti();
		
	}

}
