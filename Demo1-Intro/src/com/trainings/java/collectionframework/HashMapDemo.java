package com.trainings.java.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		System.out.println(new EMPTest().hashCode());
		
		HashSet<RSTEmployee> emps = new HashSet<>(); // No dups, No order
		
		RSTEmployee fresher = new RSTEmployee(1005, "Sanju");
		

		System.out.println("Hashcode for fresher: "+fresher.hashCode());
		emps.add(fresher);
		System.out.println(emps.add(fresher));
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

class EMPTest{
	
}
