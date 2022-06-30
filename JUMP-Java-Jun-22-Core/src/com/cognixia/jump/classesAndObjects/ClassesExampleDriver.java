package com.cognixia.jump.classesAndObjects;

public class ClassesExampleDriver {

	public static void main(String[] args) {
		
		// data type, variable name, *optional assignment
		Animal cat;
		Animal cat2 = new Animal();
		Animal cat3 = new Animal("Garfield", 40.0, "I hate Mondays.");
		
		Pikachu ozzy = new Pikachu("Ozzy", 20.0, "Pika pika");
		
		Pikachu iChooseYou = new Pikachu();
		
		// we instantiate objects
		// we set aside space in your computers runtime memory for this Class instance (object)
		cat = new Animal();
		
		// not best practice
//		cat.name = "Whiskers";
//		cat2.name = "Felix";
		
//		cat.weight = 10.0;
	
		cat2.setName("New Cat Name here.");
		System.out.println(cat.getName() + " " + cat.getWeight() + "  "+ cat2.getName());
		
//		System.out.println(cat3.name + " " + cat3.weight + " " + cat3.sound);
		
		cat.sound();
		
		cat2.sound();
		
		cat3.sound();
		
		ozzy.sound();
		
		System.out.println(ozzy.sound("Pikachu!"));
		
		ozzy.move();
		
		System.out.println("You have currently made " + Animal.getCount()
		+ " objects of the Animal family.");
	}

}
