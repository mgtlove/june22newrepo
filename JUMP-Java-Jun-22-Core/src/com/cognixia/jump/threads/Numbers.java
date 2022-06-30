package com.cognixia.jump.threads;

// holds logic that we will use in a thread
public class Numbers {

	public static void print(int max) {
		
		for (int i = 0; i < max; i++) {
			System.out.println("Thread " + Thread.currentThread().getId()
					+ ": " + i);
		}
	}
	
}
