package com.example.demo;

public class Practice5 {
	

	public static void main(String[] args) {
		boolean reverseTrue = reverseNo(1221);
		System.out.println(reverseTrue);

	}

	public static boolean reverseNo(int no) {
		 int reverse = 0;
		 int palindrome=no;
		
		while (palindrome != 0) {
		int	remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (no == reverse) {
			return true;
		} else
			return false;

	}
}
