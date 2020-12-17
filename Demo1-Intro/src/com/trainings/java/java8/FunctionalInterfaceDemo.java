package com.trainings.java.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
//		Anonymous Usage without Lambdas
		
		MyFunctionalInterface myFIEarlier = new MyFunctionalInterface() {

			@Override
			public int method1(int a, int b) {
				System.out.println("Hello!!!");
				return a+b; 
			}
			
		};
		
		
		MyFunctionalInterface myFI = (a,b)-> { 
			System.out.println("Hello!!!");
			return a+b; 
			};
			
			
			MyFunctionalInterface1 myFI1 = () -> System.out.println("Hellooo!!!!");
			
			System.out.println(myFI1); // com.trainings.java.java8.FunctionalInterfaceDemo$$Lambda$2/0x0000000100061840@3abfe836
			myFI1.wishMe();
			
			
			// Predicate:
			Predicate<Integer> p = a -> a>10;
			System.out.println(p.test(11));
			
			// Predicate:
						Predicate<Integer> p1 = a -> a%2==0;
						BiPredicate<Integer,Integer> p2 = (a,b) -> a%b==0;
						System.out.println(p1.test(11));
						
						if(p1.test(20)) {
							System.out.println("Even!!!!");
						}
			
	}

	public int method(int a , int b) {
		return a+b;
	}

	
}

