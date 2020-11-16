package com.trainings.java.demo;

import java.io.Serializable;

//class WeekDays{
//	public static final WeekDays SUNDAY = new WeekDays();
//	public static final WeekDays MONDAY = new WeekDays(1);
//	public static final WeekDays FRIDAY = new WeekDays("5");
//	public static final WeekDays SATURDAY = new WeekDays();
//		
//}


//V1.5
public enum WeekDays implements Serializable {
	
	//Group of Constants
	SUNDAY(),MONDAY(1),FRIDAY("5"),SATURDAY;
	
	// fields
	private String day;
	
	//Constructors
	WeekDays(){
		System.out.println("No-Arg Enum Constructor!!!");
	}
	
	WeekDays(int one){
		System.out.println("First Day of the Week..");
	}
	
	WeekDays(String two){
		System.out.println("Last working dayy of the Week..");
	}
	
	// Main Method
	public static void main(String[] args) {
		System.out.println("Enum Main");
	}
}
