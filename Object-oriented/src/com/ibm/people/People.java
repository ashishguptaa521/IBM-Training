package com.ibm.people;

public class People {
	public String name;

	public People() {
		name = "Anonymous";
	}

	public People(String name) {
		this.name = name;
	}

	public String toString() {
		return "People [name = " + name + "]";
	}

	private void print() {
		System.out.println("Name : " + name);
	}

}
