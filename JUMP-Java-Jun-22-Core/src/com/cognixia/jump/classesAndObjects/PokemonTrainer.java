package com.cognixia.jump.classesAndObjects;

// To showcase Compostion as a "has a" relationship between classes
public class PokemonTrainer {

	//attributes
	int rank;
	//both of the below are examples of composition!! 
	String name;
	Pikachu pikachu;
	
	//constructors
	PokemonTrainer() {}

	public PokemonTrainer(int rank, String name, Pikachu pikachu) {
		super();
		this.rank = rank;
		this.name = name;
		this.pikachu = pikachu;
	}

	
	//methods
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pikachu getPikachu() {
		return pikachu;
	}

	public void setPikachu(Pikachu pikachu) {
		this.pikachu = pikachu;
	}
	
	private void helper() throws Throwable {
		Pikachu pk = new Pikachu();
		
		pk = new Pikachu("Pikachu", 20.0, "new Pika");
		
		pk.finalize();
		
		System.out.println("Here's pikachu: " + pk);
	}
	
	public void showPikachu() throws Throwable {
		helper();
	}
	
}
