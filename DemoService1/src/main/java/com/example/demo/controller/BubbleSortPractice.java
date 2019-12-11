package com.example.demo.controller;

public class BubbleSortPractice {

	public static void main(String[] args) {
		int[] arr = { 66, 454, 4, 2, 47 };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int count = 0;
		for (int i : arr) {
			count++;
			if (arr.length == count) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + ", ");
			}
		}
	}

}
