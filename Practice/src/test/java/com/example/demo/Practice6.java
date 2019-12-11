package com.example.demo;

public class Practice6 {

	public static void main(String[] args) {
		String s = "SIDDHARTH";
		StringBuffer stringBuffer = new StringBuffer(s);
		String reverse = stringBuffer.reverse().toString();
		System.out.println(reverse);
	}
}
