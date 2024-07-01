package com.monocept.strategy.model;

public class OperationStrategy implements IOperation{
	
	private IOperation iOperation;

	public OperationStrategy(IOperation iOperation) {
		super();
		this.iOperation = iOperation;
	}
	
	

	public IOperation getiOperation() {
		return iOperation;
	}



	public void setiOperation(IOperation iOperation) {
		this.iOperation = iOperation;
	}



	@Override
	public int doOperation(int a, int b) {
		
		return iOperation.doOperation(a, b);
	}



	@Override
	public String description() {
		// TODO Auto-generated method stub
		return iOperation.description();
	}

}
