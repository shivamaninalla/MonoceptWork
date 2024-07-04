package com.monocept.stateDesignPattern.model;

public class IdleState implements IState {

	@Override
    public void pressUpButton(ElevatorContext context) {
        System.out.println("Elevator is moving up.");
        context.setState(new MovingUpState());
    }

    @Override
    public void pressDownButton(ElevatorContext context) {
        System.out.println("Elevator is moving down.");
        context.setState(new MovingDownState());
    }

    @Override
    public void reachFloor(ElevatorContext context) {
        System.out.println("Elevator is idle.");
    }

}
