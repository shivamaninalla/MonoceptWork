package com.monocept.CommandDesignPattern.model;

public class RemoteControlInvoker {
	
	private ICommand command;

	public RemoteControlInvoker(ICommand command) {
		super();
		this.command = command;
	}

	public ICommand getCommand() {
		return command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
	public void pressButton() {
		command.execute();
	}

}
