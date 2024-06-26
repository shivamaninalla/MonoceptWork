package com.monocept.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		
		set1.add("jaikkk");
		set1.add("d");
		
		HashSet<String> set=new HashSet<String>();
		String str1=new String("abc");
		System.out.println(str1.hashCode());
		
		set.add(str1);
		System.out.println(str1.hashCode());
		String str2=new String("xy");
		System.out.println(str2.hashCode());
		set.add(str2);
		System.out.println(str2.hashCode());
		String str3=new String("jai");
		System.out.println(str3.hashCode());
		set.add("jai");
		System.out.println(str3.hashCode());
		set.add("abc");
		
//		set.add(null);
//	
//		
//		System.out.println(set);
//		System.out.println(set.size());
//		
//		String[] y=set.toArray(new String[0]);
//		for(String c:y) {
//			System.out.println(c);
//		}
//		
//		System.out.println(set.contains("y"));
//		
//		System.out.println(set.isEmpty());
//		
//		System.out.println(set.containsAll(set1));
//		
//		
//		
//		Iterator i=set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		System.out.println("array");
//		
//		String[] stringArray=set.toArray(new String[0]);
//		for(String c:stringArray) {
//			System.out.println(c);
//		}
//		
//		set.addAll(set1);
//		set.remove("jai");
//		
//		set.removeAll(set1);
//		
//		System.out.println("Set");
//		Iterator i1=set.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
	Spliterator<String> num=set.spliterator();
	System.out.println(num);
	
	num.forEachRemaining((n)->System.out.println(n));
	
	System.out.println(set.getClass());
	
	System.out.println(set.toString());
	
	System.out.println(set.stream());
		

	}

	

}
