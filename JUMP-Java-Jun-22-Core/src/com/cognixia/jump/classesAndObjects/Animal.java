package com.cognixia.jump.classesAndObjects;

// Standard class of this format is called a Java Bean or a POJO 
// Plain Old Java Object
public class Animal {

	// Attributes (things / characteristics that describe this class)

	private String name;
	private double weight;
	private String sound;
	
	private static int count = 0;

	// Constructors (used to build individualized Objects of this class)
	// no parameter constructor
	public Animal() {
		this.name = "Fixed";
		count++;
	}

	public Animal(String name, double weight, String sound) {
		super();
		this.name = name;
		this.weight = weight;
		this.sound = sound;
		
		count++;
	}

	// Methods (Actions or Verbs)
	// A Method Declared in a class, has a METHOD SIGNATURE
	// METHOD SIGNATURE = *access modifier, data return type (data out), method
	// name, input parameters (data in)
	public void sound() {
		System.out.println(this.name + " makes a " + this.sound);
	}

	public void move() {
		System.out.println("The Animal moves.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", sound=" + sound + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	// Getters and Setters are special methods designed to retrieve values from
	// attributes
	// and to set or assign values to attributes
	// in lieu of use the '=' operatoer or calling object.attribute
	
	

}
