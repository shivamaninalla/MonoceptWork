package com.monocept.CommandDesignPattern.test;

import com.monocept.CommandDesignPattern.model.ICommand;
import com.monocept.CommandDesignPattern.model.OffCommand;
import com.monocept.CommandDesignPattern.model.OnCommand;
import com.monocept.CommandDesignPattern.model.RemoteControlInvoker;
import com.monocept.CommandDesignPattern.model.TelevisionReciever;

public class ICommandTest {

	public static void main(String[] args) {
		TelevisionReciever tv=new TelevisionReciever();
		ICommand onCommand=new OnCommand(tv);
		RemoteControlInvoker remote=new RemoteControlInvoker(onCommand);
		remote.pressButton();
		
		ICommand ofCommand=new OffCommand(tv);
		remote.setCommand(ofCommand);
		remote.pressButton();

	}

}
