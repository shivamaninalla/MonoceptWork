package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=Arrays.asList(1,2,3,4);
		List<Integer> list2=Arrays.asList(5,6,7,8);
		List<Integer> list3=Arrays.asList(9,10);
		List<Integer> list4=Arrays.asList(11,12);
		
		List<List<Integer>> combinedList=Arrays.asList(list1,list2,list3);
		
		System.out.println(combinedList);
				
		List<Integer> flatMapList=combinedList.stream().
				flatMap(list->list.stream()).collect(Collectors.toList());
		
		flatMapList.forEach(x->System.out.println(x));
		
		List<Integer> multiplyListWithFlatMap=flatMapList.stream().
				flatMap(x->Arrays.asList(x*2).stream()).collect(Collectors.toList());
		multiplyListWithFlatMap.forEach(x->System.out.println(x));
	//	System.out.println(multiplyListWithFlatMap);
		
		
		List<Integer> multiplyListWithMap=flatMapList.stream().
				map(x->x*3).collect(Collectors.toList());
		multiplyListWithMap.forEach(x->System.out.println(x));
		
		
		List<List<Integer>> multiple=Arrays.asList(list1,list2,list3,list4);
		List<Integer> m=multiple.stream().flatMap(x->x.stream()).
				flatMap(x->Arrays.asList(x*2).stream()).collect(Collectors.toList());
		System.out.println(m);
		
		
		
		
		
		
		


	}

}
