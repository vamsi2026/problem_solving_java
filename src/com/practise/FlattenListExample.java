package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Question: How do you transform List<List<Integer>> into List<Integer> using Java 8?
 *
 * This program demonstrates how to flatten a nested list (List<List<Integer>>) into 
 * a single list (List<Integer>) using Java 8 Streams.
 * 
 * - The `flatMap()` method is used to convert each sublist into a stream of elements.
 * - The `collect(Collectors.toList())` gathers the flattened elements into a new list.
 * 
 * Example:
 * Input: [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *
 * Time Complexity: O(N) - Each element is processed once.
 * Space Complexity: O(N) - A new list is created to store the flattened elements.
 */
public class FlattenListExample {

	public static void main(String[] args) {

		// Flatten List<List<Integer>> to List<Integer>
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(1, 2, 3, 4),
				Arrays.asList(5, 6, 7, 8),
				Arrays.asList(9, 10, 11, 12));

		List<Integer> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(collect); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

	}
}
