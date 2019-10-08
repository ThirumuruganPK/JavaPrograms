package com.corejava.programs;

public class SwapNumber {
	public int aa;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumber obj = new SwapNumber();
		obj.swapUsingWithoutThirdVariable(10, 20);
		obj.swapUsingThirdVariable(22, 99);
	}
	void swapUsingThirdVariable(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is " +a);
		System.out.println("b is "+b);
	}
	void swapUsingWithoutThirdVariable(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is " +a);
		System.out.println("b is "+b);
	}
}
