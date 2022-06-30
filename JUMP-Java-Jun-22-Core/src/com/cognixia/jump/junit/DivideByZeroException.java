package com.cognixia.jump.junit;

public class DivideByZeroException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DivideByZeroException() {
		super("Cannot divide number by zero");
	}

}
