package com.trainings.java.collectionframework;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayCapacityDemo {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> al = new ArrayList<Integer>(5);
		for (int i = 0; i < 10; i++) {
			al.add(i);
			System.out.println("size=" + al.size() + " capacity=" + getcapacity(al));
		}
	}
	
//			size=1 capacity=5
//			size=2 capacity=5
//			size=3 capacity=5
//			size=4 capacity=5
//			size=5 capacity=5
//			size=6 capacity=7
//			size=7 capacity=7
//			size=8 capacity=10
//			size=9 capacity=10
//			size=10 capacity=10


	static int getcapacity(ArrayList l) throws Exception {
		Field f = ArrayList.class.getDeclaredField("elementData");
		f.setAccessible(true);
		return ((Object[]) f.get(l)).length;
	}
}
