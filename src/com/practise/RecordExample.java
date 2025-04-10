package com.practise;

/**
 * This program demonstrates Java Records.
 * - A Record is a special class in Java (introduced in Java 14 as a preview, stable in Java 16).
 * - It is a concise way to create immutable data carriers.
 * - Records automatically generate constructor, getters, `toString()`, `hashCode()`, and `equals()`.
 * 
 * Time Complexity: O(1) (Creating and accessing record fields is constant time)
 * Space Complexity: O(1) (Each record instance has fixed memory usage)
 */

public class RecordExample {

	public static void main(String[] args) {
		
		Person person = new Person("vamsi", 27);
		
		System.out.println("Name: "+ person.name());
		System.out.println("Age: "+ person.age());
		System.out.println("Function calling: "+ person.fun(person.age()));
		
		System.out.println("Person Details: " +person);

	}

}
