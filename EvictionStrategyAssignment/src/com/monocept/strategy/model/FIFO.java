package com.monocept.strategy.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class FIFO implements IEvictionStrategy {

	@Override
	public void doOperation(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder) {
		Iterator<String> keyIterator = map.keySet().iterator();
		if (keyIterator.hasNext()) {
			map.remove(keyIterator.next());
		}

	}

	@Override
	public void description() {
		System.out.println("FIFO");

	}

}
