package com.trainings.java.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("three");
		
		System.out.println(ts);
		
		TreeSet<Integer> tsi = new TreeSet<>();
//		tsi.add(null);
		tsi.add(1);
		
		TreeSet<Movie> tsm = new TreeSet<>(new MovieNameComparator());
		tsm.add(new Movie(3, "ABCSdfsf"));
		tsm.add(new Movie(5, "BCDzsds"));
		tsm.add(new Movie(2, "EFGse"));
		tsm.add(new Movie(4, "IJK"));
		
		System.out.println(tsm);
		
		Iterator<Movie> itr = tsm.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
