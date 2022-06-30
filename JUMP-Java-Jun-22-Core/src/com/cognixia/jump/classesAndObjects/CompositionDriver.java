package com.cognixia.jump.classesAndObjects;

public class CompositionDriver {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu("Fred", 30.0, "Whoosh");
		
		PokemonTrainer ash = new PokemonTrainer(10, "Ash", pikachu);
		
		Animal pikachu2 = new Pikachu("Fred", 30.0, "Whoosh");
		

//		System.out.println(pikachu);
//		
//		int x = 1;
//		int y = 1;
//		System.out.println(x==y);
//		
//		System.out.println(pikachu == pikachu2);
//		System.out.println(pikachu.equals(pikachu2));	
		
		try {
			ash.showPikachu();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
