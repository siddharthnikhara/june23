package com.example.demo;

public class Practice1 {
	protected String dummy= "sid";
	public static void main(String[] args) {
	
		int data[] = { 1, 2, 3, 4, 6 };
		int N = 6;
		int idealSum = (N * (N + 1)) / 2;

		int sum = sum(data);
		int missingNumber = idealSum - sum;
		System.out.println(missingNumber);
	}

	public static int sum(int data[]) {
		int sum = 0;
		for (int n : data) {
			sum += n;
		}
		return sum;
	}
}
