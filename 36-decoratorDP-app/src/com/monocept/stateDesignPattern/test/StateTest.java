package com.monocept.stateDesignPattern.test;

import com.monocept.stateDesignPattern.model.ElevatorContext;

public class StateTest {

	public static void main(String[] args) {
		
		 System.out.println("Initial state: Idle");
		 ElevatorContext elevator = new ElevatorContext();
		 
	        elevator.pressUpButton();
	        elevator.reachFloor();

	        elevator.pressDownButton();
	        elevator.reachFloor();

	        elevator.pressDownButton();
	        elevator.reachFloor();

	        elevator.pressUpButton();
	        elevator.reachFloor();

	}

}
