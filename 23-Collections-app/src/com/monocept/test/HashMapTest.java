package com.monocept.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Shiva");
		map.put(2, "Mani");
		map.put(2, "Jai");
		
		System.out.println(map);

	}

}
