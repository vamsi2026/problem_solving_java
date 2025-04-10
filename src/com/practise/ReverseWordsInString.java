package com.practise;

/**
 * This class demonstrates reversing the order of words in a given string. It
 * splits the input string into an array of words, then iterates through the
 * array in reverse order to reconstruct the sentence.
 * 
 * Example: Input: "MY NAME IS VAMSI" Output: "VAMSI IS NAME MY"
 * 
 */
public class ReverseWordsInString {

	private static StringBuilder reverseWords(String name) {
		String[] str = name.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			sb.append(str[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb;
	}

	public static void main(String[] args) {

		String name = "MY NAME IS VAMSI";
		StringBuilder sb = reverseWords(name);

		System.out.println(sb.toString());
	}

}
