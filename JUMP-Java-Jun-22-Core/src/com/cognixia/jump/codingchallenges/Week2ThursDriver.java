package com.cognixia.jump.codingchallenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Week2ThursDriver {

	public static void main(String[] args) {

		int x = -7;
		int y = 5;
		String test = "Cognixia JUMP Program";

		swapIntsWithNoThirdVar(x, y);

		System.out.println(factorialIter(x));

		System.out.println(factorialIter(x));

		System.out.println(vowellCountOfString(test));

		System.out.println(vowellOccurances(test));

	}

	public static void swapIntsWithNoThirdVar(int first, int second) {

		int x = first;
		int y = second;

		System.out.println("Swap Two Numbers, without 3rd variable:");
		System.out.println("Starting with: x = " + x + " y = " + y);

		System.out.println(" We do:\n" + "		x = x + y;\n" + "		y = x - y;\n" + "		x = x - y;\n");

		x = x + y; // x = 3, y = 5
		y = x - y; // x = 8, y = 5
		x = x - y; // x = 8, y = 3
					// x = 5, y = 3

		System.out.println("Ending with: x = " + x + " y = " + y + "\n");

	}

	public static int factorialIter(int input) {

		System.out.println("Factorial of " + input);
		if (input < 0)
			System.out.println("Factorials are defined for positive integers.");
		if (input == 0)
			return 1;

		int fact = input;

		for (int i = input; i > 1; i--) {

			fact *= i - 1;
		}

		return fact;
	}

	public static int factorialRecursive(int input) {

		System.out.println("Factorial of " + input);
		if (input < 0)
			System.out.println("Factorials are defined for positive integers.");

		if (input == 0 || input == 1)
			return 1;

		return factorialRecursive(input - 1);

	}

	public static long vowellCountOfString(String input) {
		// There are many ways to solve this!!
		// ie. regex, Pattern and Matcher
		// Switch cases, for loops and ifs, etc.

		System.out.println("Vowel Count of: " + input);
		long count = 0;

		String[] letters = input.split("");

		count = Stream.of(letters).map(l -> l.toLowerCase()).filter(l -> l.matches("(a|e|i|o|u)")).count();

		return count;
	}

	public static Map<String, Integer> vowellOccurances(String input) {

		System.out.println("Vowels and occurances in: " + input);

		return Arrays.stream(input.split(""))
				.map(String::toLowerCase)
				.filter(l -> l.matches("(a|e|i|o|u)"))
				.collect(Collectors.groupingBy(value -> value, Collectors.summingInt(count -> 1)));

	}

}
