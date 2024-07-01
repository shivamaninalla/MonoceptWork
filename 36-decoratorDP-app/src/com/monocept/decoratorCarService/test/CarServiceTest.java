package com.monocept.decoratorCarService.test;

import com.monocept.decoratorCarService.model.CarInspection;
import com.monocept.decoratorCarService.model.OilChange;
import com.monocept.decoratorCarService.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInspection car=new CarInspection();
		OilChange oil=new OilChange(car);
		System.out.println(oil.getCost());
		WheelAlign wheel=new WheelAlign(car);
		System.out.println(wheel.getCost());
		

	}

}
