package com.corejava.polymorphism;

public class Overriding extends child {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
		obj.add(4, 5);
		obj.add(44, 55);		
		
		Overriding obj1 = new Overriding();
		obj1.add(222, 1111);
	}
	
	void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
}

class parent{	
	void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
}

class child extends parent{
	void add(int a,int b){
		int d = a+b;
		System.out.println(d);
	}
}

