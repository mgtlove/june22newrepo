package com.cognixia.jump.arrays;

import java.util.Arrays;

import com.cognixia.jump.classesAndObjects.Pikachu;

public class ArraysExampleDriver {
	

	public static void main(String[] args) {
		
		// data type, variable
		
		// declaring array
			// primitives
		int[] intArray;
		int otherArray[];
		
			// of objects
		Pikachu[] pikachuArray;
		
		// initializing and instantiating array
		intArray = new int[5];
		int[] altIntArray = new int[5];
		
		boolean[] boolArray = new boolean[5];
		
		pikachuArray = new Pikachu[3];
		
		// if you want to plug in values with {} you must declare and insatiate at the same line.
//		otherArray = {1,3,5,7,9};
		int[] intArray3 = {1,3,5,7,9};
		
		Pikachu[] pikachuArray2 = {
			new Pikachu(),
			new Pikachu("Raichu", 50.0, "Whoosh"),
			new Pikachu("Gotta", 30.0, "catch em all.")
		};
		
		// read / write to elements directly
		
			// write
			intArray[2] = 50;
			
			pikachuArray[2] = new Pikachu("Pichu", 10.0, "Zoom");
			// read
			System.out.println(intArray[2]);
			
			System.out.println(pikachuArray[2]);
			
			System.out.println(boolArray[2]);
			
			System.out.println(intArray);
			
			System.out.println(Arrays.toString(intArray));
			
			System.out.println(intArray3[4]);
			
			System.out.println(intArray3[intArray3.length-1]);
			
			String x = "wyz";
			
		
		// looping through array
		
			// for loop
//			for(int i = pikachuArray2.length-1; i >= 0 ; i-=2) {
//				System.out.println(pikachuArray2[i]);
//			}
		
			// for each loop
			// really nice, has restrictions!
			// for each loop, is ALWAYS going to start at the beginning and go though
			// each single space, until the end, from beginning to end.
			
			for(Pikachu p : pikachuArray2) {
				System.out.println(p);
			}
			System.out.println();
			
			for(Pikachu p : pikachuArray2) {
				p = new Pikachu("default", 10.0, "default");
			}
			
			System.out.println();
			for(Pikachu p : pikachuArray2) {
				System.out.println(p);
			}
			
//			for(int i : intArray3) {
//				System.out.println(intArray3[i]);
//			}
			
			
	}

}
