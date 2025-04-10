package com.practise;

import java.util.stream.IntStream;

/**
 * This program finds the position (row, column) of a target element (7) in a 2D array using Java 8 Streams.
 * 
 * - The `IntStream.range(0, arr.length)` creates a stream over row indices.
 * - The `flatMap()` iterates over columns, filtering for the target element.
 * - The first occurrence of the target is returned as an array {row, column}.
 * - If not found, it returns {-1, -1}.
 * 
 * Time Complexity: O(N * M) - Each element in the 2D array is visited once in the worst case.
 * Space Complexity: O(1) - No extra space is used apart from a constant-sized output array.
 */
public class Array2DEX {

	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 5, 7 }, { 2, 4, 6, 8 }, { 9, 10, 122, 12 } };

		IntStream.range(0, arr.length) // Stream over row indices i
				.boxed() // converts int to Integer
				.flatMap(i -> IntStream.range(0, arr[i].length) // Stream over column indices(j)
						.filter(j -> arr[i][j] == 7) // Find target element
						.mapToObj(j -> new int[] { i, j })) // convert indices to array
				.findFirst() // Get first occurrence
				.orElse(new int[] { -1, -1 }); // Default if not found

	}

}
