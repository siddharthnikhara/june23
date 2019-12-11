package com.example.demo.controller;

public class ReverseString1 {

	// Iterative and Recursive String Reverse Example.

	public static void main(String[] args) {
		String s = "GeeksForGeeks";
//		String st = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			st = st + s.charAt(i);
//		}

		String st = reverseString(s);
		System.out.println(st);
	}

	public static String reverseString(String s) {
		if (s.isEmpty())
			return s;
		return s.substring(1) + s.charAt(0);
	}
}
