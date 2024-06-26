package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,22,33);
		
		numbers.stream().forEach((x)->System.out.println(x));
		
		List<Integer> numberStream=numbers.stream().filter((x)->x%2!=0).collect(Collectors.toList());
		
		numberStream.forEach((x)->System.out.println(x));
		
		int addition=numbers.stream().reduce(0, (sum,x)->sum+x);
		
		List<Integer> multipliers=numbers.stream().map((x)->x*5).collect(Collectors.toList());
		
		System.out.println("Numbers after multiplying with 5");
		
		multipliers.forEach((x)->System.out.println(x));
		
		numbers.stream().sorted().limit(3).
		forEach((x)->System.out.println(x));

	}

}
