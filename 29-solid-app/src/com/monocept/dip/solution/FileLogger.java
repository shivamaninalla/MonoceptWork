package com.monocept.dip.solution;

public class FileLogger implements ILogger{

	@Override
	public void log(Exception error) {
		// TODO Auto-generated method stub
		System.out.println("Looged to database: "+error);
		
	}

}
