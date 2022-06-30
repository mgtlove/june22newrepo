package com.cognixia.jump.threads;

public class NumRunnalbeDriver {

	public static void main(String[] args) {
		
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());
		
		// How many threads we make
		int count = 3;
		
		Thread[] threads = new Thread[count];
		
		for (int i = 0; i < threads.length; i++) {
			Runnable runnable = new NumRunnable();
			
			threads[i] = new Thread(runnable);
			
			// we still need the .start() to build the thread which then will also look for
			// the .run() method to know what to executie during the thread lifecycle
			threads[i].start();
		}

	}

}
