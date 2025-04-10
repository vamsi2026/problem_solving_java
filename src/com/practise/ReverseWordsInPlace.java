package com.practise;

public class ReverseWordsInPlace {

	public static String reverseWords(String s) {
		char[] chars = s.toCharArray();
		int start = 0;

		for (int i = 0; i <= chars.length; i++) {
			// If we reach a space or end of string, reverse the current word
			if (i == chars.length || chars[i] == ' ') {
				reverse(chars, start, i - 1);
				start = i + 1;
			}
		}

		return new String(chars);
	}

	private static void reverse(char[] chars, int left, int right) {
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		String s = "vamsi krishna";
		System.out.println("Output: " + reverseWords(s));

	}

}
