package com.cognixia.jump.threads;

public class NumThreadDriver {

	public static void main(String[] args) {
		
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());
		
		int count = 8;
		Thread[] threads = new Thread[count];
		
		for(int i = 0; i < count; i++) {
			threads[i] = new NumThread();
			
			// DO NOT explicitly call the .run() method
			threads[i].start();
		}

	}

}
