package com.trainings.java.collectionframework;

import java.util.Comparator;

public class DescRank implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
//		return - i.compareTo(j);
//		return j.compareTo(i);
		return - 10;
	}

}
