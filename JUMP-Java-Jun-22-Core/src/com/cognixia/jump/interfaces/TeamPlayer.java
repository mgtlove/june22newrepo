package com.cognixia.jump.interfaces;

public interface TeamPlayer {

	void playOffense();
	
	void playDeffense();
	
	void move();
	
	static void getStats() {
		System.out.println("Here are the game's stats: ");
	}
	
	default void sub() {
		System.out.println("Player subbed.");
	}
	
}
