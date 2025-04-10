package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This program demonstrates sorting a HashMap by values in ascending order. -
 * Uses a List to store the entries of the HashMap. - Sorts the List using
 * `Comparator.comparing(Map.Entry::getValue)`. - Stores the sorted data into a
 * LinkedHashMap to maintain insertion order.
 *
 * Time Complexity: - Converting HashMap to List: O(N) - Sorting List: O(N log
 * N) (TimSort is used in Collections.sort()) - Inserting into LinkedHashMap:
 * O(N) - Overall: O(N log N)
 *
 * Space Complexity: O(N) (For storing entries in a list and LinkedHashMap)
 */
public class HashMapSort {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<Integer, String>();
//
//		map.put(1, "c");
//		map.put(2, "b");
//		map.put(3, "a");

		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 5);
		map.put("Banana", 2);
		map.put("Cherry", 8);
		map.put("Mango", 3);

		Map<Integer, String> strMap = new HashMap<>();
		strMap.put(1, "d");
		strMap.put(2, "c");
		strMap.put(3, "b");
		strMap.put(4, "a");

		// sorting based on Integer Value
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
		Map<String, Integer> sMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sMap.put(entry.getKey(), entry.getValue());
		}

		// sorting based on String Value
		List<Map.Entry<Integer, String>> strList = new ArrayList<>(strMap.entrySet());
		Collections.sort(strList, Comparator.comparing(Map.Entry::getValue));
		Map<Integer, String> strSortMap = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> entry : strList) {
			strSortMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sMap);
		System.out.println(strSortMap);

		Map<String, Integer> collect = map.entrySet().stream() // Converts the HashMap into a stream of entries.
				.sorted(Map.Entry.comparingByValue()) // sorts the entries based on values in ascending order.
				//Collects the sorted entries into a LinkedHashMap to maintain insertion order.
				.collect(Collectors.toMap(
						Map.Entry::getKey, // Extracts the key
						Map.Entry::getValue, // Extracts the value
						(e1, e2) -> e1, //Handles Key collisions 
						LinkedHashMap::new)); // Ensures insertion order is preserved
		System.out.println(collect);

	}

}
