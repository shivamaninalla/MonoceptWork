package com.monocept.strategy.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRU implements IEvictionStrategy {

	@Override
	public void doOperation(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder) {
		String key = readingOrder.peekFirst();
		map.remove(key);

	}

	@Override
	public void description() {
		System.out.println("LRU");

	}

}
