package com.monocept.strategy.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public interface IEvictionStrategy {

	public void doOperation(LinkedHashMap<String, Integer> map, LinkedList<String> readingOrder);

	public void description();

}
