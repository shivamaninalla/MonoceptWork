package com.monocept.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(3,"mani");
		
		map.put(1,"Shiva");
		
		map.put(1, "hi");
		
		map.ceilingEntry(5);
		
		System.out.println(map);
		
		System.out.println(map.floorKey(41));
		
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		
		for(Map.Entry entry:entries) {
			System.out.println(entry.getKey()+"...."+entry.getValue());
		}
		

	}

}
