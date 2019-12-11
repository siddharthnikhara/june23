package com.example.demo;

public class Practice9 {

	public static void main(String[] args) {
//		int n=10;
//		for(int i =0;i<=n;i++) {
//			for(int j=n;j>=0;j--) {
//				if(i>j) {
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
		
		
//		int n=5,x=n,y=n;
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=n*2;j++) {
//				if(j>=x&&j<=y) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}x--;
//			y++;
//			
//			System.out.println();
//		}
		
		
		int n=6;
		for(int i=n;i>=-n;i--) {
			for(int j=1;j<=Math.abs(i);j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=Math.abs(i);k--) {
				System.out.print("* ");
			}System.out.println();
		}
		
		
		
	}
}
