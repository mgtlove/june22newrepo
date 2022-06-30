package com.cognixia.jump.exceptionsAndAssertions;

public class PositiveInputsOnlyException extends Exception {
	
	PositiveInputsOnlyException() {
		super("Only input positive numbers please.");
	}

}
