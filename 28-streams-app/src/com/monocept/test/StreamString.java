package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Jayesh","Nimesh","Mahesh","Ramesh","Aditya");
		
		System.out.println("First three students sorted in ascending order");
		List<String> sortedOrder=list.stream().sorted().limit(3).collect(Collectors.toList());
		sortedOrder.forEach((x)->System.out.println(x));
		
		System.out.println("First three students sorted in ascending order if it contains 'a' ");
		List<String> containsA=list.stream().filter((x)->x.toLowerCase().contains("a")).sorted().limit(3).collect(Collectors.toList());
		
		containsA.forEach((x)->System.out.println(x));
		
		System.out.println("Students in descending order");
		List<String> descendingOrder=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		descendingOrder.forEach((x)->System.out.println(x));
		
		System.out.println("First three characters of all names");
		List<String> firstCharacter=list.stream().map(x->x.substring(0, 1)).collect(Collectors.toList());
		firstCharacter.forEach((x)->System.out.println(x));
		
		System.out.println("Names of students that contains less than or equal to 4 characters");
		System.out.println("");
		List<String> stringsSmaller=list.stream().filter(x->x.length()<=4).collect(Collectors.toList());
		stringsSmaller.forEach((x)->System.out.println(x));

	}

}
