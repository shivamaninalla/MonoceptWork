package com.monocept.strategy.test;

import com.monocept.strategy.model.AddOperation;
import com.monocept.strategy.model.MultiplyOperation;
import com.monocept.strategy.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		OperationStrategy op=new OperationStrategy(new AddOperation());
		System.out.println(op.description());
		System.out.println(op.doOperation(3, 4));
		
		System.out.println("----------------------");
		
		op.setiOperation(new MultiplyOperation());
		System.out.println(op.description());
		System.out.println(op.doOperation(0, 9));

	}

}
