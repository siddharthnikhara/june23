package com.example.demo.controller;

public class EqualsOverride {

	public String name;
	public int id;

	public EqualsOverride(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		EqualsOverride e = new EqualsOverride("string", 1);
		EqualsOverride e1 = new EqualsOverride("string", 2);
		System.out.println(e.equals(e1));
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("aaa");
			return true;
		} else {
			System.out.println("adae");
			if (obj instanceof EqualsOverride) {
				EqualsOverride s = (EqualsOverride) obj;
				return this.name.equals(s.name) && this.id == s.id;
			} else {
				return false;
			}

		}
	}

}
