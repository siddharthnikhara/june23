package com.example.demo.controller;

public class IterativeString {

	public static void main(String[] args) {
		String str = "ApA";
		String st = reverse(str);
		if (st.equals(str))
			System.out.println(st);
		else
			System.out.println("data not found");
	}

	public static String reverse(String str) {
		if (str.isEmpty())
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
