package com.practise;

import java.util.List;
import java.util.Map;

/**
 * This program demonstrates the use of `var` with Java Collections.
 * - `var` is used to infer the types of lists and maps.
 * - `List.of(...)` creates an immutable list.
 * - `Map.of(...)` creates an immutable map.
 * - The program iterates through the collections using `var` in loops.
 * 
 * Time Complexity:
 * - Creating List and Map: O(N) where N is the number of elements.
 * - Iterating through List: O(N)
 * - Iterating through Map: O(M) (where M is the number of key-value pairs)
 * 
 * Space Complexity: O(N + M) (Storage for List and Map elements)
 */
public class VarWithCollection {

	public static void main(String[] args) {
		var list = List.of("vamsi", "krishna", "teeda");
		var map = Map.of(1, "one", 2, "two");

		for (var li : list) {
			System.out.println(li);
		}

		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
