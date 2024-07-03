package com.monocept.strategy.test;

import com.monocept.strategy.model.FIFO;
import com.monocept.strategy.model.IEvictionStrategy;
import com.monocept.strategy.model.LFU;
import com.monocept.strategy.model.LRU;
import com.monocept.strategy.model.StrategyClass;

public class EvictionStrategyTest {

	public static void main(String[] args) {
		StrategyClass strategyClass = new StrategyClass(new FIFO());
		strategyClass.put("a", 0);
		strategyClass.put("b", 0);
		strategyClass.put("c", 0);
		strategyClass.get("b");
		strategyClass.get("b");
		strategyClass.get("a");
		strategyClass.get("a");
		strategyClass.get("c");
		strategyClass.get("a");
		strategyClass.put("d", 0);

		System.out.println(strategyClass);

		strategyClass = new StrategyClass(new LRU());
		strategyClass.put("a", 0);
		strategyClass.put("b", 0);
		strategyClass.put("c", 0);
		strategyClass.get("b");
		strategyClass.get("b");
		strategyClass.get("a");
		strategyClass.get("a");
		strategyClass.get("c");
		strategyClass.get("a");
		strategyClass.put("d", 0);

		System.out.println(strategyClass);

		strategyClass = new StrategyClass(new LFU());
		strategyClass.put("a", 0);
		strategyClass.put("b", 0);
		strategyClass.put("c", 0);
		strategyClass.get("b");
		strategyClass.get("b");
		strategyClass.get("a");
		strategyClass.get("a");
		strategyClass.get("c");
		strategyClass.get("a");
		strategyClass.put("d", 0);

		System.out.println(strategyClass);

	}

}
