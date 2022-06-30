package com.cognixia.jump.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	
	private Player player;
	// an example singleton
	private Deck deck;
	private int gamesWon;
	private int gamesLost;
	private int totalGames;
	
	public BlackJack() {
		
		this.deck = Deck.getDeck();
		this.gamesWon = 0;
		this.gamesLost = 0;
		this.totalGames = 0;
		
		// anonymous class to create player
		this.player = new Player() {
			
			private int points = 0;
			private List<Card> hand = new ArrayList<Card>();

			@Override
			public int getPoints() {
				return points;
			}

			@Override
			public void addPoints(int pointsToAdd) {
				this.points += pointsToAdd;
			}

			@Override
			public void addToHand(Card card) {
				hand.add(card);				
			}

			@Override
			public void showHand() {
				System.out.println("Player hand:");
				
				for(Card c : hand) {
					System.out.println(c);
				}
			}

			@Override
			public void reset() {
				this.points = 0;
				hand.clear();
			}
			
		};
	}
	
	public Card deal() {
		return deck.dealCard();
	}
	
	
	private int points(Card card) {
		
		// local inner class
		class CardValue {
			int cardPoints(Card card) {
				
				Card.Type.Value cardValue = card.getValue();
				
				switch(cardValue) {
				case ACE:
					return 1;
				case TWO:
					return 2;
				case THREE:
					return 3;
				case FOUR:
					return 4;
				case FIVE:
					return 5;
				case SIX:
					return 6;
				case SEVEN:
					return 7;
				case EIGHT:
					return 8;
				case NINE:
					return 9;
				case TEN:
				case JACK:
				case QUEEN:
				case KING:
					return 10;
				default:
					return 0;
				}
			}	
		}
		
		CardValue cv = new CardValue();
		
		return cv.cardPoints(card);
	}
	
	
	public void playRound() {
		
		Card card = deal();
		
		System.out.println("Dealt " + card);
		
		player.addToHand(card);
		
		int pointsEarned = points(card);
		player.addPoints(pointsEarned);
		
		System.out.println("Player has " + player.getPoints() + " point(s).");
		
	}
	
	public boolean bust() {
		
		if(player.getPoints() > 21) {
			return true;
		}
		
		return false;
	}
	
	public void playGame(Scanner sc) {
		
		if(totalGames > 0) {
			player.reset();
			deck.resetDeck();
		}
		
		System.out.println("Deal first hand...");
		playRound();
		
		System.out.println("\nDeal second hand...");
		playRound();
		
		while(true) {
			
			System.out.println("\nDeal another hand? (y/n)");
			String ans = sc.nextLine().trim().toLowerCase();
			
			if(ans.equals("n")) {
				break;
			}
			
			System.out.println("\nDealing...");
			playRound();
			
			if(bust()) {
				System.out.println("\nYou lost! :(");
				gamesLost++;
				break;
			}
		}
		
		if(!bust()) {
			
			int dealerHand = new Random().nextInt(21);
			System.out.println("\nDealer's hand is " + dealerHand);
			
			if(dealerHand > player.getPoints()) {
				System.out.println("\nYou lost! :(");
				gamesLost++;
			}
			else if (dealerHand == player.getPoints()) {
				System.out.println("\nTied!");
			}
			else {
				System.out.println("\nYou won! :)");
				gamesWon++;
			}
			
			totalGames++;
		}
		
		
		System.out.println("\n------------------------");
		System.out.println("Toal: " + totalGames + ", Won: " + gamesWon 
							+ ", Lost: " + gamesLost);
		System.out.println("------------------------");
	}
	
	
	
	

}

