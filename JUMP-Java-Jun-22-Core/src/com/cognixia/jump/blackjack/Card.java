package com.cognixia.jump.blackjack;


import com.cognixia.jump.blackjack.Card.Type.Suit;
import com.cognixia.jump.blackjack.Card.Type.Value;

public class Card {
	
	// static class holds our enums for card values
	// grouping our data
	public static class Type {
		
		public enum Value {
			ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
		}
		
		public enum Suit {
			DIAMONDS, HEARTS, CLUBS, SPADES
		}
	}
	
	private Type.Value value;
	private Type.Suit suit;

	public Card(Value value, Suit suit) {
		super();
		this.value = value;
		this.suit = suit;
	}

	public Type.Value getValue() {
		return value;
	}

	public Type.Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return value + " OF " + suit;
	}
}

