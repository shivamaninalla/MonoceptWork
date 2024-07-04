package com.monocept.stateDesignPattern.model;

public class MovingDownState implements IState{
	
	@Override
    public void pressUpButton(ElevatorContext context) {
        System.out.println("Elevator can't move up while going down.");
    }

    @Override
    public void pressDownButton(ElevatorContext context) {
        System.out.println("Elevator is already moving down.");
    }

    @Override
    public void reachFloor(ElevatorContext context) {
        System.out.println("Elevator reached the desired floor while moving down.");
        context.setState(new IdleState());
    }

}
