package com.cognixia.jump.coreExamples;

import java.util.Scanner;

// Sample code to show reading input from a user via console
public class UserInput {

	// main method is where the program starts
	public static void main(String[] args) {
		
		// data type variable name = initialization or instatiation
		// Scanner is our data type, variable name is input.
		// The input variable will act as our user input and create the reading tool to get the data.
		Scanner input = new Scanner(System.in);
		
		// Prompting the user for input
		System.out.println("Enter a value: ");
		
		// reading the input and storing to a String data type called storedInput
		String storedInput = input.nextLine();

		// print the received input
		System.out.println("Your input was: " + storedInput);
		
		//Bonus on + sign when printing (string concatenation and arithmetic)
		System.out.println(1 + 1);
		System.out.println('1' + 1);
		System.out.println('1' + '1');
		System.out.println("1" + "1");
		System.out.println("1" + 1);
		System.out.println(1 + "1");
	}

}
