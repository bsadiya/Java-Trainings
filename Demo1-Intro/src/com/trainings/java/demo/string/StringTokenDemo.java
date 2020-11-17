package com.trainings.java.demo.string;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
//		V1.7 -Java7
		StringTokenizer sts = new StringTokenizer("Hii,Hello,Hola",",");
		if(sts.hasMoreTokens()) {
			System.out.println(sts.nextToken());
		}

	}

}
