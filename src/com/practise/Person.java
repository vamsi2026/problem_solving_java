package com.practise;

//Defining a Record with fields 'name' and 'age'
public record Person(String name, int age) {

	public Person {
		if (age < 18) {
			throw new IllegalArgumentException("Person is not eligible to vote");
		}
	}
	
	public int fun(int n) {
		return n;
	}

}
