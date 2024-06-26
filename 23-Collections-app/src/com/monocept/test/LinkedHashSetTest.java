package com.monocept.test;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
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
		
		System.out.println(set);
		System.out.println(set.size());
		
		
		

	}

}
