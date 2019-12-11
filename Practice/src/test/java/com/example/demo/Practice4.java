package com.example.demo;

public class Practice4 {

	String name = null;

	public Practice4(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else {
			if (obj instanceof Practice4) {
				Practice4 p4 = (Practice4) obj;
				return this.name.equals(p4.name);
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		Practice4 p = new Practice4("sid");
		Practice4 p2 = new Practice4("sidd");
		Practice4 p3 = p;
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
	}

}
