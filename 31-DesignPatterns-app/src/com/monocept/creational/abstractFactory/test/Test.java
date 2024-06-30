package com.monocept.creational.abstractFactory.test;

import com.monocept.creational.abstractFactory.model.ICarFactory;
import com.monocept.creational.abstractFactory.model.ICars;
import com.monocept.creational.abstractFactory.model.MarutiFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICarFactory marutiFactory=new MarutiFactory();
		ICars maruti=marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		
		

	}

}
