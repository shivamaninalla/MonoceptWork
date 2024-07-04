package com.monocept.stateDesignPattern.model;

public interface IState {
	
	void pressUpButton(ElevatorContext context);
    void pressDownButton(ElevatorContext context);
    void reachFloor(ElevatorContext context);

}
