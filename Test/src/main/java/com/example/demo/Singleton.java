package com.example.demo;

public class Singleton{

	private static Singleton obj;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
	}
}
