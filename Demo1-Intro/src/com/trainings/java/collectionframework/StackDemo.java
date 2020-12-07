package com.trainings.java.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.add(4);
		if(s.peek() != null) {
			System.out.println("Stack is not Empty!");
		}
		else {
			System.out.println("Stack is  Empty!");
		}
		
		s.add(4);
		s.add(6);
		
		System.out.println(s);
		s.push(1);
		s.add(2);
		
		s.pop();
		System.out.println(s.pop());
		System.out.println(s);

	}

}
