package com.practise;

/**
 * This program demonstrates the difference between String literals and String
 * objects in Java.
 * 
 * - `str1` is a String literal stored in the **String Pool** (inside Heap
 * memory). - `str2` is a new String object created in the **Heap memory**,
 * separate from the String Pool. - The `==` operator compares **memory
 * references**, not content. - Since `str1` and `str2` refer to different
 * memory locations, `str1 == str2` returns **false**.
 */
public class StringComparison {

	public static void main(String[] args) {

		String str1 = "vamsi";
		String str2 = new String("vamsi");

		System.out.println(str1 == str2); // Output: false
		System.out.println(str1.equals(str2)); // Output: true (which compares actual content)
	}

}
