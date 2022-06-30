package com.cognixia.jump.threads;

public class SyncThread extends Thread {

	private static int counter = 0;
	
	private static int counter2 = 0;
	
	private static volatile int volCounter = 0;
	
	// sync method example
	public static synchronized void increment() {
		counter++;
	}
	
	public static synchronized void newIncrement() {
		counter++;
		System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
	}
	
	// sync block
	public static void incrementBlock() {
		counter2++;
		System.out.println(" Counter 2 - Thread " + Thread.currentThread().getId() + ": " + counter2);
		
		synchronized(SyncThread.class) {
			counter++;
			System.out.println("Counter 1 - Thread " + Thread.currentThread().getId() + ": " + counter);
		}
	}
	
	public static void volIncrement() {
		volCounter++;
		System.out.println("Volatile Counter- Thread " 
		+ Thread.currentThread().getId() + ": " + volCounter);
	}
	
	@Override
	public void run() {
		System.out.println("Start Thread: " + Thread.currentThread().getId());
		
		int loopCount = 50;
		
		for(int i = 0; i < loopCount; i++) {
			
			// Option 1
//			increment();
//			System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
			
			// Option 2
//			newIncrement();
			
			// Option 3
//			incrementBlock();
			
			// Option 4 ~ volatile
			volIncrement();
		}
	}
}
