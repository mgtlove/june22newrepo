package com.cognixia.jump.classesAndObjects;

public class Pikachu extends Animal {
	
	// Attributes - (We inherrit name, sounds, and weight)
	
	// Constructor
	public Pikachu() {
		super();
	}
	
	public Pikachu(String name, double weight, String sound) {
		super(name, weight, sound);
	}
	
	// Methods
	
	// Method Overriding
	// Must have inheritence, and the child implements a method from the parent
	// with the EXACT same method signature
	// Example of RUNTIME Polymorphism
	
	@Override
	public void sound() {
		System.out.println("Pikachu's name is: " + this.getName() + " and makes a " + this.getSound() + " sound.");
	}
	
	// Method Overloading
	// Does not REQUIRED inherritence, like overriding does, but it can work with it.
	// Simply put - the method NAME is the same, but some other feature of the 
	// Method signature, is different, such as the return type and/or input parameters
	// Method Overloading is an example of COMPILE TIME Polymorphism
	
	public String sound(String sound) {
		String returnString = this.getName() + "makes a " + this.getSound();
		return returnString;
	}

	@Override
	public String toString() {
		return "Your Pikachu stats: " + super.toString();
	}
	
	// The objects last action before deletion
	// Best practice is NOT to explicitly or manually call this.
	@Override
	public void finalize() throws Throwable{
		System.out.println("Pikachu back to pokeball");
	}

//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		return true;
//	}
	
}
