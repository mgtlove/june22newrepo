package com.cognixia.jump.interfaces;

public class Player implements BallPlayer, TeamPlayer {
	
	private String name;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void playOffense() {
		
		System.out.println("playing offense!");
		
	}

	@Override
	public void playDeffense() {
		
		System.out.println("playing defense!");
		
	}

	@Override
	public int move(int x, int y) {
		
		return x + y;
	}

	@Override
	public void move() {
		
		System.out.println("player is movin!");
		
	}

	@Override
	public void dribble() {
		
		System.out.println("player is dribbling!");
		
	}

	@Override
	public void shoot() {
		
		System.out.println("shoots the ball!");
		
	}

	@Override
	public void pass() {
		
		System.out.println("What a pass!");
		
	}

	@Override
	public void receive() {
		
		System.out.println("pass the player " + this.name + " received!");
		
	}


	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	

}
