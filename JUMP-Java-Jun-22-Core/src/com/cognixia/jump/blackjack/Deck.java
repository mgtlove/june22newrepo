package com.cognixia.jump.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Deck {
	
	// store our cards
	private List<Card> cards = new ArrayList<Card>();
	
	// static composition of self, object is first step to our singleton
	// we set to null and static gives access to all class instances
	private static Deck deck = null;
	
	// set constructor to private so no one outside of class can
	// instantiate it
	private Deck() {
		
	}
	
	public static Deck getDeck() {
		
		// if null (not set), create single instance of deck
		if(deck == null) {
			deck = new Deck();
			deck.buildDeck();
		}
		
		return deck;
	}
	
	private void buildDeck() {	
		if (cards.isEmpty()) {
			for (Card.Type.Suit suit : Card.Type.Suit.values()) {

				for (Card.Type.Value value : Card.Type.Value.values()) {

					cards.add(new Card(value, suit));
				}

			}
		}
	}
	
	public void showDeck() {
		System.out.println("The " + cards.size() + " remaining cards in the deck are:");
		for(Card c : cards) {
			System.out.println(c);
		}
	}
	
	public Card dealCard() {
		
		if(deck != null) {
			
			// get random card from deck
			Card deal = cards.get(new Random().nextInt(cards.size()));
			
			// remove card from deck
			cards.remove(deal);
			
			// return card
			return deal;
		}
		
		return null;
	}
	
	public void resetDeck() {
		cards.clear();
		buildDeck();
	}

}

