package com.monocept.strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="ABCD";
		
		String string3=new String("ABCD");
		
		String string2="ABCD";
		System.out.println(string2);
		System.out.println(string2.hashCode());
        System.out.println(string1==string3);
		string2=string2+"DFG";
		System.out.println(string2);
		System.out.println(string2.hashCode());
		
		String s="k";
		s="s";
		System.out.println(s);
		
		
	}

}
