package com.example.demo.controller;

public class Test {

	public static void main(String[] args) {
		int n = 5;
		int px = 5, py = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j >= px && j <= py) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			px--;
			py++;
			System.out.println();
		}
	}
}
