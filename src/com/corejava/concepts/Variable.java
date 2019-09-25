package com.corejava.concepts;

public class Variable {
	int a; //instance variable
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable obj = new Variable();
		System.out.println(obj.a);
		System.out.println(b);
	}
	void add(){
		System.out.println(a);//directly access in non-static
		System.out.println(b);
		mul();
	}
	static void mul(){
		System.out.println("fff");
	}
}
