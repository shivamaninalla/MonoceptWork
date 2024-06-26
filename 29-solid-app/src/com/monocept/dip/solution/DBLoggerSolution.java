package com.monocept.dip.solution;

public class DBLoggerSolution implements ILogger{

	@Override
	public void log(Exception error) {
		System.out.println("Looged to database: "+error);
		
	}

}
