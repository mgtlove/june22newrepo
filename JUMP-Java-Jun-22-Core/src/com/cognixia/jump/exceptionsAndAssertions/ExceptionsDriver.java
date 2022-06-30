package com.cognixia.jump.exceptionsAndAssertions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDriver {

	public static void main(String[] args) {
		
		try {

			int[] input = getUserInput();
			if(input[0] <= 0) {
				throw new PositiveInputsOnlyException();
			}
			// assertions must be enabled.  Typically not included in your code here,
			// but rather in separate unit tests.
			assert input[0] % 2 == 0 : "odd number for first input.";
			int result = divideByInput(input[0]);
			System.out.println("You succesfully input:" + input[0] + " 10 / " + input[1] + " = " + result);
			
		} catch(InputMismatchException e) {
			System.out.println("Please enter only an integer!");
		} catch(ArithmeticException e) {
			System.out.println("Please enter non 0 integer values!");
		} catch (PositiveInputsOnlyException e) {
			
			System.out.println(e.getMessage());
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}

	public static int divideByInput(int input) throws ArithmeticException {
		int result = 10 / input;
		return result;
	}

	// Example method propogating the InputMismatch down the line
	public static int[] getUserInput() throws InputMismatchException {
		
		int[] returnArr = new int[2];
		// try with resources will handle the userReader.close() for us
		try(Scanner userReader = new Scanner(System.in);
				Scanner reader2 = new Scanner(System.in);) {
			System.out.println("Please enter an integer:");
			int input = userReader.nextInt();
			int input2 = reader2.nextInt();
			// You won't see this print if exceptions are thrown
			//return input;
			returnArr[0] = input;
			returnArr[1] = input2;
			
		} // try with resources does not have to have a catch
		
//		try (Scanner userReader1 = new Scanner(System.in);) {
//			System.out.println("Another int: ");
//			int input2 = userReader1.nextInt();
//			returnArr[1] = input2;
//		}
		return returnArr;
	}

}
