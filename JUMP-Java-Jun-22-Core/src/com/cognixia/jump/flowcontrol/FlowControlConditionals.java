package com.cognixia.jump.flowcontrol;

import java.util.Scanner;

public class FlowControlConditionals {

	public static void main(String[] args) {
		
		//simple program to check user input for a give range and criteria
		// set up a Scanner to receive user input.
		Scanner input = new Scanner(System.in);
		
		//prompt the user for integer input
		System.out.println("Please enter an integer value: ");
		
		// First logical program
		// read the input and store to a variable String
		int readInput = input.nextInt();
		
		// Make flow control for finding positive, even number, and showing results based on input
		if(readInput > 0) {
			
			if(readInput % 2 == 0) {
				System.out.println("Your input of: " + readInput + " was even and positive");
			}
			else {
				System.out.println("Your input of: " + readInput + " was odd and positive.");
			}
			
		}
		// less than or equal to 0
		else {
			System.out.println("Not a positive number inputed.");
		}
		
		// Alternate Flow Control Logic
		if(readInput > 0 && readInput % 2 == 0) {
			System.out.println("Congrats!  A positive and even value entered.");
		}
		else if (readInput > 0) {
			System.out.println("An odd, positive number was entered.");
		}
		else {
			System.out.println("Your value did not meet crieria of positive and even.");
		}
		
		// With Switch Case
		
		Scanner switchInput = new Scanner(System.in);
		
		System.out.println("Press w for withdrawl or d for deposit");
		
		String menuInput = switchInput.nextLine();
		
		switch(menuInput) {
		default: System.out.println("Must enter d or w.");
		break;
		case "w": 
		case "W": System.out.println("You chose to withdraw.");
		break;
		case "D":
		case "d": System.out.println("You chose to deposit.");
		break;
		
		}
		
	}
	

}
