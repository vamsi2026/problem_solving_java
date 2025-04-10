package com.practise;

//s = "vamsi krishna"
//op = "ismav anhsirk
public class Demo {

	public static void main(String[] args) {

		String name = "vamsi krishna";

		String[] nam = name.split(" ");
		StringBuilder sb = new StringBuilder();
//
//		for (String n : nam) {
//			char[] charArray = n.toCharArray();
//
//			for (int i = charArray.length-1; i >= 0; i--) {
//				sb.append(charArray[i]);
//			}
//			sb.append(" ");
//		}
		
		
		for(String n : nam) {
			StringBuilder rev = new StringBuilder(n).reverse().append(" ");
			sb.append(rev);
			
		}

		System.out.println(sb.toString().trim());

	}

}
