package com.cognixia.jump.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

// An overview of various selected Java Collections from the Collectiosn framework
// ** rember the diagram **
// The Collection Interface has Set, List, Queue, Deque, but NO LINK to Map
// Map Interface is separate

public class CollectionsDriver {

	public static void main(String[] args) {
		
		// List
		List<Integer> intList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		List<Short> shortList = new Vector<>();
		

		
		intList.add(1);
		intList.add(50);
		intList.add(1, 30);
		
		System.out.println(intList);
		System.out.println(intList.get(2));
		
		Integer value = 50;
		intList.remove(Integer.valueOf(50));
		
		List<Integer> linkedListInt = new LinkedList<>(intList);
		
		System.out.println(intList);
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		} 
		
		
		
		System.out.println(linkedListInt);
		
		// Set
		System.out.println("Set Example");
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Red");
		hashSet.add("Blue");
		hashSet.add("green");
		hashSet.add("Red");
		
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		Iterator it = hashSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		// Queue
		Queue<Integer> linkedQ = new LinkedList<>(linkedListInt);
		
		
		// Map
		Map<String, Integer> coins = new HashMap<>();
		
		coins.put("Quarter", 25);
		
		System.out.println(coins);
		
		for (String s : coins.keySet()) {
			System.out.println(coins.get(s));
		}
		
		// Placeholder for Generics
		

	}

}
