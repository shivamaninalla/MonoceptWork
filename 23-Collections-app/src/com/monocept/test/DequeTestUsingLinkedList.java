package com.monocept.test;

import java.util.LinkedList;

public class DequeTestUsingLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> deque=new LinkedList<Integer>();
		deque.add(5);
		deque.addFirst(1);
		deque.addFirst(1);
		deque.add(4, 10);
		System.out.println(deque);

	}

}
