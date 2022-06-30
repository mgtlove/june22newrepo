package com.cognixia.jump.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	// variables we'll reuse with each of our tests
	private static Calculator calc;
	private static int testCount;
	
	// run once before any of the tests
	@BeforeAll
	public static void setup() {
		
		// initialize values
		calc = new Calculator();
		testCount = 0;
		
		System.out.println("Attributes have been initialized");
	}
	
	// run once after all the tests
	@AfterAll
	public static void cleanup() {
		
		System.out.println("All tests have been run, total tests run is " + testCount);
	}
	
	// run before each test
	@BeforeEach
	public void beforeTest() {
		System.out.println("Running test...");
	}
	
	// run after each test
	@AfterEach
	public void afterTest() {
		testCount++;
		System.out.println("Finished running test, testCount = " + testCount);
	}
	
	

	@Test
	void testAdd() {
		
		// setup
		int num1 = 4;
		int num2 = 6;
		
		// execute
		int actual = calc.add(num1, num2);
		int expected = num1 + num2;
		
		// assert
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSub() {
		
		// setup
		int num1 = 4;
		int num2 = 6;

		// execute
		int actual = calc.sub(num1, num2);
		int expected = num1 - num2;

		// assert
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSumAbsolutes() {
		
		// setup
		int num1 = 4;
		int num2 = 6;

		// execute
		int actual = calc.sumAbsolutes(num1, num2);
		int expected = Math.abs(num1) + Math.abs(num2);

		// assert
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testMult() {

		// setup
		int num1 = 4;
		int num2 = 6;

		// execute
		int actual = calc.mult(num1, num2);
		int expected = num1 * num2;

		// assert
		assertEquals(expected, actual);

	}
	
	@Test
	void testDiv() throws DivideByZeroException {
		
		// setup
		int num1 = 4;
		int num2 = 6;

		// execute
		double actual = calc.div(num1, num2);
		double expected = num1 / num2;

		// assert
		assertEquals(expected, actual);
		
	}
	
	// unlike the previous test, want to make sure when we execute this one
	// the exception will be thrown
	@Test
	void testDivByZero() {
		
		// setup
		int num1 = 4;
		int num2 = 0;

		// execute & assert
		assertThrows(DivideByZeroException.class, () ->{
			calc.div(num1, num2);
		});
		
	}


}










