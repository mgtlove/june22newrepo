package com.cognixia.jump.blackjack;

import java.util.Scanner;

public class PlayBlackJack {
	
	public static void main(String[] args) {
		
		BlackJack blackJack = new BlackJack();
		
		Scanner sc = new Scanner(System.in);
		blackJack.playGame(sc);
		
		
		sc.close();
	}

}
