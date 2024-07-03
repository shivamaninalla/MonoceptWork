package com.monocept.strategy.model;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFU implements IEvictionStrategy {

	@Override
	public void doOperation(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder) {
		
		String minEntry = frequencyCount(map,readingOrder);
		

		map.remove(minEntry);

	}

	public static String frequencyCount(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder) {
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String element : readingOrder) {

			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
		}

		int minFrequency = map.get(readingOrder.getFirst());
		String minFrequencyElement = null;

		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			int frequency = entry.getValue();
			if (frequency < minFrequency) {
				minFrequency = frequency;
				minFrequencyElement = entry.getKey();
			}
		}

		return minFrequencyElement;

	}

	@Override
	public void description() {
		System.out.println("LFU");

	}

}
