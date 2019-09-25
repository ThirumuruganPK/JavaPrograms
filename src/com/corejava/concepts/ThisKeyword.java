package com.corejava.concepts;

public class ThisKeyword {
	int a=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		obj.a(66);
	}
	void a(int a){
		System.out.println(a);
		System.out.println(this.a);
		this.b();
		this.b(44);
	}
	void b(){
		System.out.println(" LLL");
	}
	void b(int a){
		
	}
}

