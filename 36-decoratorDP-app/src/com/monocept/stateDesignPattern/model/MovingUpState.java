package com.monocept.stateDesignPattern.model;

public class MovingUpState implements IState{
	
	public void pressUpButton(ElevatorContext context) {
        System.out.println("Elevator is already moving up.");
    }

    public void pressDownButton(ElevatorContext context) {
        System.out.println("Elevator can't move down while going up.");
    }

    public void reachFloor(ElevatorContext context) {
        System.out.println("Elevator reached the desired floor while moving up.");
        context.setState(new IdleState());
    }


}
