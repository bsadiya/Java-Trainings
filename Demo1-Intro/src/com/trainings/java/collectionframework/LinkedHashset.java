package com.trainings.java.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(1);
		lhs.add(2);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		
		
		System.out.println(lhs.add(7));
		System.out.println(lhs.add(4));
		
		System.out.println(lhs);
		
		LinkedHashSet<String> lhss = new LinkedHashSet<>();
		
		lhss.add("One");
		lhss.add("Two");
		lhss.add("Three");
		lhss.add("Four");
		lhss.add(null);
		lhss.add(null);
		lhss.add("One");
		lhss.add(null);
		lhss.add("Five");
		
		System.out.println(lhss.add("TEN"));
		System.out.println(lhss);
		
		

	}

}
