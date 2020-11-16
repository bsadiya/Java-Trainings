package com.trainings.java.demo.conditional;

import com.trainings.java.demo.WeekDays;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {

		// Selection Stmts - if, if-else, switch
		
		/*
		 * WeekDays day = WeekDays.SUNDAY; switch(day) { default:
		 * System.out.println("Normal Day!"); case SUNDAY:
		 * System.out.println("Its SUNDAY!!!!!"); break; // Transfer stmts - break,
		 * continue, return, try-catch-finally case FRIDAY:
		 * System.out.println("Its Friday!!!!!"); break;
		 * 
		 * }
		 */
		
		
		// Looping- Stamts: for, forEach, While, Do-while
//		for(ini;Condition;incr/decre){}
		/*
		 * for(int i=0; i<10; i++) { // Transfer stmts - break, continue, return,
		 * try-catch-finally if(i==2) break; System.out.println(i); //
		 * System.out.println("After"); } System.out.println("Out of for loop");
		 */
		
		/*
		 * int j=9; while(j>0) { System.out.println(j); j--; }
		 */
		
		/*
		 * int k=1; do { System.out.println("WithDraw!!"); }while(k>1);
		 */
		
		/*
		 * String names[] = {"Raju", "Sadiya", "Ram", "Sai", "Shyam"}; for(String name :
		 * names) { System.out.println(name); }
		 */
		
		long x=0b001;
		System.out.println(x);
		if(10>2?false:true) {
			System.out.println("if");
		}
		else {
			System.out.println("else");
		}
		
		
	}

}
