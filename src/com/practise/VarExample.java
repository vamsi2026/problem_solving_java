package com.practise;

/**
 * This program demonstrates the use of `var` (local variable type inference) in Java.
 * - `var` was introduced in Java 10.
 * - It allows the compiler to infer the type of local variables at compile time.
 * - `var` can only be used for local variables inside methods, loops, or blocks (not for fields, method parameters, or return types).
 * 
 * Time Complexity: O(1) (Accessing and printing variables takes constant time)
 * Space Complexity: O(1) (Fixed number of primitive and reference variables)
 */
public class VarExample {

	public static void main(String[] args) {
		var name = "vamsi";
		var age = 25;
		var pi= 3.14;
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Pi: "+ pi );

	}

}
