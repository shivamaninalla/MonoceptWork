package com.monocept.strategy.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class StrategyClass implements IEvictionStrategy {

	private IEvictionStrategy iEvictionStrategy;

	private LinkedHashMap<String, Integer> map;

	private LinkedList<String> readingOrder;

	public IEvictionStrategy getiEvictionStrategy() {
		return iEvictionStrategy;
	}

	public StrategyClass(IEvictionStrategy iEvictionStrategy, HashMap<String, Integer> map,
			LinkedList<String> readingOrder) {
		super();
		this.iEvictionStrategy = iEvictionStrategy;
		this.map = new LinkedHashMap<String, Integer>();
		this.readingOrder = new LinkedList<String>();
	}

	public StrategyClass(IEvictionStrategy iEvictionStrategy) {
		super();
		this.iEvictionStrategy = iEvictionStrategy;
		this.map = new LinkedHashMap<String, Integer>();
		this.readingOrder = new LinkedList<String>();
	}

	public void get(String key) {
		if (map.containsKey(key)) {
			int k = map.get(key);
			map.put(key, k + 1);
			readingOrder.add(key);
		}
	}

	public void put(String key, Integer value) {
		if (map.size() >= 3) {
			iEvictionStrategy.doOperation(map, readingOrder);
		}
		map.put(key, value);
		// readingOrder.add(key);
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "StrategyClass [iEvictionStrategy=" + iEvictionStrategy.getClass().getSimpleName() + ", map=" + map
				+ ", readingOrder=" + readingOrder + "]";
	}

	@Override
	public void doOperation(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder) {
		// TODO Auto-generated method stub

	}

}
