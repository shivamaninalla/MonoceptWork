package com.monocept.isp.violation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour=new Labour();
		labour.StartWork();
		labour.StopWork();
		labour.eat();
		labour.drink();
		
		IWorker robo=new Robot();
		robo.StartWork();
		robo.StopWork();
		labour.eat();
		labour.drink();

	}

}
