package com.cognixia.jump.classesAndObjects;

public class StaticExecutionExample {

	public static void main(String[] args) {
		
		// Constructor
		StaticExampleClass eg = new StaticExampleClass();

		StaticExampleClass.staticMethod();
		
		StaticExampleClass.staticMethod();
		
		StaticExampleClass eg2 = new StaticExampleClass();
		
		StaticExampleClass eg3 = new StaticExampleClass("hello");
	}

}
