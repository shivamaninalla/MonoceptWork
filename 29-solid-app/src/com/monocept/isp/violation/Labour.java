package com.monocept.isp.violation;

public class Labour implements IWorker{

	@Override
	public void StartWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour starts working");
		
	}

	@Override
	public void StopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stops working");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour is drinking");
		
	}

}
