package com.cognixia.jump.threads;

public class SyncThreadDriver {

	public static void main(String[] args) {
		
		int threadCount = 3;
		
		Thread[] threads = new Thread[threadCount];
	
		
		for(int i = 0; i < threadCount; i++) {
			threads[i] = new SyncThread();
			threads[i].start();
			
		}

	}

}
