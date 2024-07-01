package com.monocept.strategy.test;

import com.monocept.strategy.model.AddOperation;
import com.monocept.strategy.model.MultiplyOperation;
import com.monocept.strategy.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		OperationStrategy openStrategy=new OperationStrategy(new AddOperation());
		System.out.println(openStrategy.description());
		System.out.println(openStrategy.doOperation(3, 4));
		
		System.out.println("----------------------");
		
		openStrategy.setiOperation(new MultiplyOperation());
		System.out.println(openStrategy.description());
		System.out.println(openStrategy.doOperation(1, 9));

	}

}
