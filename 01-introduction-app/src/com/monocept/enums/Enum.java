package com.monocept.enums;

enum Planet{
	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	int number;
	
	Planet(int number){
		this.number=number;
	}
	
	
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet myPlanet=Planet.MARS;
		
		canILive(myPlanet);
		

	}
	
	static void canILive(Planet myPlanet) {
		
		switch(myPlanet) {
		case EARTH:
			System.out.println("You can live here");
			System.out.println("This is planet #"+myPlanet.number);
			break;
		default:
			System.out.println("You cant live here");
			System.out.println("This is planet #"+myPlanet.number);
			break;
		}
	}

}
