package com.trainings.java.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		
		System.out.println(hs.add(7));
		System.out.println(hs.add(4));
		
		System.out.println(hs);
		
		
		HashSet<String> hss = new HashSet<>();
		
		hss.add("One");
		hss.add("Two");
		hss.add("Three");
		hss.add("Four");
		hss.add(null);
		hss.add(null);
		hss.add("One");
		hss.add(null);
		hss.add("One");
		
		System.out.println(hss);
		
		
	
		
		Iterator<String> itr = hss.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		HashSet<Movie> moviehs = new HashSet<>();
		moviehs.add(new Movie(1, "ABC"));
		moviehs.add(new Movie(1, "ABC"));
		moviehs.add(new Movie(1, "ABC"));
		moviehs.add(new Movie(1, "ABC"));
		
		System.out.println(moviehs);
		
		
		
		
		
		
	}

}
