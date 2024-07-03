package com.monocept.CommandDesignPattern.model;

public class OffCommand implements ICommand {

	private TelevisionReciever tv;

	public OffCommand(TelevisionReciever tv) {
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
		tv.off();

	}

}
