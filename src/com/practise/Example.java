package com.practise;

//Input: prices = [7,1,5,3,6,4] Output: 7
//* Explanation: The optimal transactions are as follows:
//* Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 4.
//* Buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 3. Total profit = 4 + 3 = 7.
public class Example {

	public static int maxProfit(int[] prices) {
		int maxprofit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxprofit += prices[i] - prices[i - 1];
			}
		}
		return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum Profit: " + maxProfit(prices));

	}

}
