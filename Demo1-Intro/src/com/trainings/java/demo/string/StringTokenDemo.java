package com.trainings.java.demo.string;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
//		V1.7 -Java7
		// By default token is "space"
		StringTokenizer stringTokenizer = new StringTokenizer("Helloooooo World!!!!! sfdasdf zfsdfsdfsdf");
		System.out.println(stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		System.out.println("**** With ',' delemeter  ****");
		StringTokenizer sts = new StringTokenizer("Hii,Hello,Hola",",");
		while(sts.hasMoreTokens()) {
			System.out.println(sts.nextToken());
		}

	}

}
