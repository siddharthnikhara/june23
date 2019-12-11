package com.example.demo.controller;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("My Runnable");

	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		// Thread th = new Thread(mr);
		Thread mt = new MyThread(mr);
		mt.start();
		mt.start();
		
	}
}
