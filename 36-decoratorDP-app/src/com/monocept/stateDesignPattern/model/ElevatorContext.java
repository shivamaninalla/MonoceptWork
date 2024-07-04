package com.monocept.stateDesignPattern.model;

public class ElevatorContext {
	
	private IState state;

    public ElevatorContext() {
       
        state = new IdleState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void pressUpButton() {
        state.pressUpButton(this);
    }

    public void pressDownButton() {
        state.pressDownButton(this);
    }

    public void reachFloor() {
        state.reachFloor(this);
    }

}
