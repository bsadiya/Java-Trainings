package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("node1");
		ll.add("node2");
		ll.add("node3");
		ll.add("node4");
		ll.add("node5");
		
		ll.addFirst("node0");
		ll.addLast("node6");
		
		ll.add(4,"newNode");
		
		ll.remove(5);
		
		ll.add("node1");
		
		ll.removeFirst();
		
		ll.removeFirstOccurrence("node1");
		System.out.println(ll);
		
		for(String s : ll) {
			System.out.println(s.toUpperCase());
		}
		
		System.out.println(ll.get(2));
		
	}

}
