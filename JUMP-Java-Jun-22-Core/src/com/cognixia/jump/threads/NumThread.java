package com.cognixia.jump.threads;

// an example class that can be mulithreaded, by extending the Thread class
public class NumThread extends Thread{

	@Override
	public void run() {
		System.out.println("Start Thread " + Thread.currentThread().getId());
		
		Numbers.print(50);
		
		//this is just good practice
		super.run();
	}
}
