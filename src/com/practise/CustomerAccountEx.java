package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This program demonstrates filtering and updating customer account balances using Java 8 Streams.
 * 
 * - It filters customers whose balance is greater than 1000.
 * - It increases the balance of these customers by 500 using `peek()`.
 * - The modified list is collected and printed.
 * 
 * Time Complexity: O(N) - The stream processes each customer once.
 * Space Complexity: O(N) - A new list is created to store the filtered and updated customers.
 */
public class CustomerAccountEx {
	private int id;
	private String name;
	private double balance;

	public CustomerAccountEx(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerAccount{" + "id=" + id + ", name='" + name + '\'' + ", balance=" + balance + '}';
	}

	public static void main(String[] args) {

		List<CustomerAccountEx> list = Arrays.asList(new CustomerAccountEx(1, "Alice", 900),
				new CustomerAccountEx(2, "Bob", 1500), new CustomerAccountEx(3, "Charlie", 1200),
				new CustomerAccountEx(4, "David", 800), new CustomerAccountEx(5, "Eve", 2000));

		List<CustomerAccountEx> collect = list.stream().filter(n -> n.getBalance() > 1000)
				.peek(n -> n.setBalance(n.getBalance() + 500)).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
