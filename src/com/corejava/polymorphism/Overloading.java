package com.corejava.polymorphism;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		obj.add(4, 7);
		obj.add(3, 6, 88);
	}
	
	public void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,int b,int c){
		int d = a+c+b;
		System.out.println(d);
	}
}
