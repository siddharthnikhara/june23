package com.example.demo;

public class Practice1 {

	public static void main(String[] args) {
		int n = 5, x = n, y = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {

				if (j >= x && j <= y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			x--;
			y++;
			System.out.println();
		}

	}

}
