package com.monocept.CommandDesignPattern.model;

public class OnCommand implements ICommand {

	private TelevisionReciever tv;

	public OnCommand(TelevisionReciever tv) {
		super();
		this.tv = tv;
	}

	public TelevisionReciever getTv() {
		return tv;
	}

	public void setTv(TelevisionReciever tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();

	}

}
