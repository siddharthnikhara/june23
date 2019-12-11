package com.example.demo;

public class Main {
	
	public static void main(String[] args) {
		Singleton cls = Singleton.getInstance();
		Singleton clsa= Singleton.getInstance();
		System.out.println(cls+"  "+clsa);
		
	}

}
