package com.trainings.java.collectionframework;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.offer("First");
		pq.offer("Second");
		pq.offer("Third");
		pq.offer("Fourth");
		
		pq.poll();
		System.out.println(pq);

	}

}
