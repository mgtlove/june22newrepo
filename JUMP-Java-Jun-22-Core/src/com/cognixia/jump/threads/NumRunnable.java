package com.cognixia.jump.threads;

public class NumRunnable implements Runnable {

	// Composition of Thread
	Thread t;
	
	public NumRunnable() {
		t = new Thread();
	}
	
	@Override
	public void run() {
		
		System.out.println("Start Thread " + Thread.currentThread().getId());
		
		Numbers.print(50);
		
	}

}
