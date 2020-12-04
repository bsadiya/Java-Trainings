package com.trainings.java.collectionframework;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie>{

	/*
	 * @Override public int compare(Object o1, Object o2) {
	 * 
	 * return 0; }
	 */

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getName().length() < m2.getName().length()) {
			return 1;
		}
		else if(m1.getName().length() > m2.getName().length()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
