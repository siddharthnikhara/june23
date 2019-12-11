package com.example.demo.controller;

public class MyThread extends Thread {
	public MyThread(Runnable r) {
		super(r);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread Class");
	}

}
