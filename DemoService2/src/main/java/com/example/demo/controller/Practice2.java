package com.example.demo.controller;

public class Practice2 {
	static String data="data";
	static String dataaa="data";
	static  String datata="ere";
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else {
			if(obj instanceof Practice2) {
				Practice2 dataa =(Practice2)obj;
				return this.data.equals(dataa.data);
			}
			else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		//Practice2 p = new Practice2();
		System.out.println(data.equals(datata));	
	}
}
