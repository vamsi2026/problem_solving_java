package com.practise;

import java.util.LinkedHashSet;

/**
 * This program demonstrates the use of LinkedHashSet in Java. LinkedHashSet
 * maintains the insertion order and does not allow duplicate elements.
 * 
 * In this example: - Elements are inserted into the LinkedHashSet. - Duplicate
 * values are ignored. - The final set maintains the order of insertion.
 */
public class LinkedHAshsetEx {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10); // Duplicate, won't be added

		System.out.println(set);

	}

}
