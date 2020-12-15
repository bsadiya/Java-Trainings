package com.trainings.java.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashSet<RSTEmployee> emps = new HashSet<>(); // No dups, No order
		
		
		emps.add(new RSTEmployee(1001, "Sadiya"));
		emps.add(new RSTEmployee(1002, "Raju"));
		emps.add(new RSTEmployee(1003, "Shyam"));
		emps.add(new RSTEmployee(1004, "Sai"));
		emps.add(new RSTEmployee(1001, "Sadiya"));
		
		Iterator<RSTEmployee> itr = emps.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}

