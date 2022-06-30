package com.cognixia.jump.collections;

// Looking at generics in methods
// using the Object class
// and using VarArgs (...)

public interface Calculator {

	// This method is pretty limited to its input set and data types
//	static double sum(double x, double y) {
//		return x + y;
//	}
//	
//	// Method Overloading
//	static int sum(int x, int y, int z) {
//		return x + y + z;
//	}
	
	// generics with  T
//	static <N> Integer sum(N input1, N input2) {
//		Integer x = Integer.parseInt(input1.toString());
//		Integer y = Integer.parseInt(input2.toString());
//		
//		return x + y;
//	}
	
//	static <N extends Number> double product(N... inputs) {
//		double product = 1;
//		double[] doubleInputs = new double[inputs.length];
//		
//		for(int i = 0; i < inputs.length; i++) {
//			doubleInputs[i] = inputs[i].doubleValue();
//		}
//		
//		for (double num : doubleInputs) {
//			product *=num;
//		}
//		
//		return product;
//	}
	
	static <N extends Number> double product(N[] input) {
		double product = 1;
		for (N num : input) {
			product *= num.doubleValue();
		}
		return product;
	}
	
	// Ojbect allows variable inputs (not primitives) with limitations of 
	// using operators i.e. +, *, /
	static void printObjects(Object input1, Object input2) {

		System.out.println(input1);
		System.out.println(input2);
		
	}
	
	// an example of varargs, which are 1 or more of the parameter type
	// varargs must be last parameter in your method signature
	static Double sum(Double...inputs) {
		
		Double sum = 0.0;
		for(Double num : inputs) {
			sum+=num;
		}
		
		return sum;
	}
	
}
