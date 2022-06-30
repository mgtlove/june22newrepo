package com.cognixia.jump.interfaces;

public interface BallPlayer {
	
	// public final static is auto assigned to variables
	int maxTravel = 100;

	// methods are abstract, and public
	
	int move(int x, int y);
	
	void move();
	
	void dribble();
	
	void shoot();
	
	void pass();
	
	void receive();
	
}
