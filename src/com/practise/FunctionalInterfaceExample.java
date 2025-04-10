package com.practise;

/**
 * This program demonstrates the use of a Functional Interface in Java 8.
 * - A Functional Interface is an interface with exactly one abstract method.
 * - Here, `MyFunctionalInterface` is a functional interface with a single method `display()`.
 * - A lambda expression is used to implement the interface.
 *
 * Time Complexity: O(1) - Constant time execution of the lambda function.
 * Space Complexity: O(1) - No additional data structures are used.
 */
public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		MyFunctionalInterface obj = () -> System.out.println("Hello");

		obj.display();

	}

}
