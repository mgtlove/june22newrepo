package com.cognixia.jump.classesAndObjects;

public class StaticExampleClass {
	
	// This class will have a anonymous code block, a static code block, contructor, and static method
	// and in the ExecutionExample class, will call these features, and see how
	// java loads them, and in what order
	// **this was an actual inverview question for a previous student!
	
	public int x = 10;
	
	
	// Static Code Block

	
	// Constructor
	public StaticExampleClass() {
		System.out.println("Constructor Executed.");
	}
	
	public StaticExampleClass(String input) {
		System.out.println("Constructor executed, with input " + input);
	}
	
	// Static Method
	public static void staticMethod() {
		System.out.println("Static Method executed.");
	}
	
	// Anonymous Code Block
	{
		System.out.println("Anonymous Code block executed.");
	}

	static {
		System.out.println("Static Code block executed.");
	}
}
