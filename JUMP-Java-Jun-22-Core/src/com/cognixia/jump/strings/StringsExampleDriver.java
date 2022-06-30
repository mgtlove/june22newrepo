package com.cognixia.jump.strings;


// Taking a look at the unique behavior of the String class and its objects
// in java.
// How java handles Strings in memory, with the String Pool.
public class StringsExampleDriver {

	public static void main(String[] args) {
		
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s1";
		String s4 = s1;
		String s5 = new String("s5");
		String s6 = new String("s1");
		String s7 = new String("s1");
		
		// A series of checks for equality with our above Strings
		// we now know that == is going to check memory location equality
		// not actually contents
		// but with the String pool, this SOMETIMES works* 
		System.out.println("Using == for Strings:");
		System.out.println("String s1 == s2? " + (s1==s2));
		System.out.println("String s1 == s3? " + (s1==s3));
		System.out.println("String s1 == s4? " + (s1==s4));
		System.out.println("String s1 == s5? " + (s1==s5));
		System.out.println("String s1 == s6? " + (s1==s6));
		System.out.println("String s6 == s7? " + (s6==s7));
		
		// Using .equals() method
		System.out.println("\nUsing .equals() for Strings:");
		System.out.println("String s1.equals(s2)? " + (s1.equals(s2)));
		System.out.println("String s2.equals(s1)? " + (s2.equals(s1)));
		System.out.println("String s1.equals(s3)? " + (s1.equals(s3)));
		System.out.println("String s1.equals(s4)? " + (s1.equals(s4)));
		System.out.println("String s1.equals(s5)? " + (s1.equals(s5)));
		System.out.println("String s1.equals(s6)? " + (s1.equals(s6)));
		System.out.println("String s6.equals(s7)? " + (s6.equals(s7)));

	}

}
