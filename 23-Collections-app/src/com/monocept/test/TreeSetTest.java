package com.monocept.test;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		
		String str1=new String("a");
		System.out.println(str1.hashCode());
		
		set.add(str1);
		System.out.println(str1.hashCode());
		String str2=new String("xy");
		System.out.println(str2.hashCode());
		set.add(str2);
		System.out.println(str2.hashCode());
		String str3=new String("81");
		System.out.println(str3.hashCode());
		set.add(str3);
		System.out.println(str3.hashCode());
		set.add("abcdefg");
		
		System.out.println(set);
		System.out.println(set.size());
		
		

	}

}
