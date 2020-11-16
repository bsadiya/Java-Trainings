package com.trainings.java.demo;


public class EnumDemo {
//	enum Status { START, PROCESS, END } // Group of Named Constants
//	enum Flags { }
//	enum Account {SAVINGS, CURRENT}
	
	public static void main(String[] args) {
		WeekDays sunDay = WeekDays.SUNDAY;
		System.out.println(sunDay);
		
		// Accessing
		WeekDays days[] = WeekDays.values();
		for(WeekDays day:days) {
			System.out.println("Day: "+ day + "; Ordinal: "+day.ordinal());
		}
	}

}
