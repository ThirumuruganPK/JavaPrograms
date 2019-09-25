package com.corejava.inheritance;

public class Hierarical_Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.d();
		obj.a();
		
		B b = new B();
		b.b();
	}
}
class A extends B{
	void a(){
		System.out.println("A");
	}
}

class B{
	void b(){
		System.out.println("B");
	}
}

class C extends A{
	void c(){
		System.out.println("C");
	}
}
class D extends A{
	void d(){
		System.out.println("D");
	}
}
