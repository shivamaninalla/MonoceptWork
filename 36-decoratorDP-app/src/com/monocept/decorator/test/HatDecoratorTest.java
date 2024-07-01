package com.monocept.decorator.test;

import com.monocept.decorator.model.GoldenHat;
import com.monocept.decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		StandardHat sta=new StandardHat();
		GoldenHat g=new GoldenHat(sta);
		System.out.println(g.description());

	}

}
