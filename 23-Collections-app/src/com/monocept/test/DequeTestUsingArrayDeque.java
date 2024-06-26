package com.monocept.test;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeTestUsingArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque=new ArrayDeque<Integer>();
		
		deque.add(1);
		deque.add(2);
		deque.addFirst(0);
		deque.addLast(3);
		System.out.println("First element from front: "+deque.getFirst());
		System.out.println("Last element from front: "+deque.getLast());
		System.out.println(deque.contains(10));
		System.out.println(deque.peek());
		deque.push(20);
		System.out.println(deque.peekLast());
		deque.remove(3);
		
		System.out.println(deque);
		
		Iterator array=deque.iterator();
		while(array.hasNext()) {
			System.out.println(array.next());
		}
		
		Integer arr[]=deque.toArray(new Integer[3]);
		for(Integer elements:arr) {
			System.out.println(elements);
		}

	}

}
