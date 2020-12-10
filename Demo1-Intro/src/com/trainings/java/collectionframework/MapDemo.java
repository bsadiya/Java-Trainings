package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); //--> TreeSet and TreeMap
		al.add(1);
		
		HashMap hp = new HashMap();
		
		hp.put(1, "One");
		hp.put(1, "One");
		hp.put(2, "Two");
		hp.put(1, "One");
		
		System.out.println(hp);
		
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		hashMap.put("Dhoni", 100);
		hashMap.put("Dhoni", new Integer(99));
		hashMap.put("Virat", 89);
		hashMap.put(null, 78);
		hashMap.put(null, 67);
		
		System.out.println(hashMap);
		
		
		// get, keyset, values, entryset
		// Print player name
		System.out.println(hashMap.keySet());
		
		// Print all the scores
		System.out.println(hashMap.values());
		
		// score of Dhoni
		System.out.println(hashMap.get("Dhoni"));
		
		System.out.println(hashMap.entrySet());
		
		
	Set<Entry<String, Integer>> entryset = hashMap.entrySet();
	
	
	 Iterator itr = entryset.iterator();
	 while(itr.hasNext()) {
//		 System.out.println(itr.next());
		 
		 System.out.println("********");
		 Map.Entry mapentry = (Map.Entry)itr.next();		 
		 System.out.println(mapentry.getKey());
//		 
//		 Object name = itr.next();
//		 System.out.println(name);
		 
	 }

	}

}
