package com.example.demo;

public class Practice10 {
	public static void main(String[] args) {
		
		int n=5;
		for(int i=n;i>=-n;i--) {
			for(int j=1;j<=Math.abs(i);j++) {
				System.out.print(" ");
			}for(int k=n;k>=Math.abs(i);k--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
