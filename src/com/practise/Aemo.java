package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aemo {

	private int id;
	private double balnace;

	public Aemo(int id, double balnace) {
		super();
		this.id = id;
		this.balnace = balnace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalnace() {
		return balnace;
	}

	public void setBalnace(double balnace) {
		this.balnace = balnace;
	}

	@Override
	public String toString() {
		return "Aemo [id=" + id + ", balnace=" + balnace + "]";
	}

	public static void main(String[] args) {

		List<Aemo> list = Arrays.asList(new Aemo(1, 1000), new Aemo(2, 1500), new Aemo(3, 800), new Aemo(4, 1200));

		List<Aemo> collect = list.stream().filter(n -> n.getBalnace() > 1000)
				.peek(n -> n.setBalnace(n.getBalnace() + 500)).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}
}
