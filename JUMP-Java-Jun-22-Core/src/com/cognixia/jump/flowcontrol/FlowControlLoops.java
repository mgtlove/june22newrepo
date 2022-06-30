package com.cognixia.jump.flowcontrol;

import java.util.Scanner;

public class FlowControlLoops {

	public static void main(String[] args) {
		
		// While Loop
		
		int counter = 0;
		
		while (counter < 10) {
			System.out.println(counter);
			counter++; 
			// counter++ is shorthand for: counter = counter + 1;
		}
		
		// example infinite loop (without exit condition to be met).
//		while (counter < 10) {
//			System.out.println(counter);
//			counter--; 
//			// counter++ is shorthand for: counter = counter + 1;
//		}
		
		
		// Do While Loop - executes at least once, regardless of true or false condition
		// Inside Double quotes, there are shorthand notations to make lines, tabs, etc.
		// \ is the escape character, then the following letter is the action
		// i.e. \n is a new line, \t is a tab when printing.
		System.out.println("\nDo While Example:\t");
		
		int doWhileCount = 11;
		do {
			System.out.println(doWhileCount);
			++doWhileCount;
		}while(doWhileCount < 10);
		
		System.out.println("DoWhileCounter is:\t" + (doWhileCount + 10));
		
		// For Loop
		// In the for loop () we have 3 things:
		// where are you starting? Where is the finish? How do we get there?
		System.out.println("\nFor Loop Example:\t");
		
		for(int i = 10; i > 0; i-=2 ) {
			System.out.println(i);
		}
		
		// good use of while loop
		System.out.println("\nWhile loop variable condition example:");
		Scanner input = new Scanner(System.in);
		boolean check = true;
		
		while(check == true) {
			System.out.println("check is true, still in the loop.");
			System.out.println("Do you want to continue? Yes or no.");
			String userIn = input.nextLine();
			if(userIn.equals("no")) {
				check = false;
			}
			
		}
		
		
		// Nested Loop
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("i is: " + i + " j is: " + j);
			}
		}

	}

}
