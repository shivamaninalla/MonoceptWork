package com.monocept.creational.factory.test;

import com.monocept.creational.factory.model.CarFactory;
import com.monocept.creational.factory.model.ICar;
import com.monocept.creational.factory.model.Mahindra;
import com.monocept.creational.factory.model.Maruti;
import com.monocept.creational.factory.model.Tata;

public class ICarTest {

	public static void main(String[] args) {
		ICar car;
		
		car=CarFactory.getCar("Maruti");
		car.start();
		car.stop();
		
		car=CarFactory.getCar("Tata");
		car.start();
		car.stop();
		
		car=CarFactory.getCar("Mahindra");
		car.start();
		car.stop();
	}

}
