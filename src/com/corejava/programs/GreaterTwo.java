package com.corejava.programs;

public class GreaterTwo {
		int a,b,c;
	GreaterTwo(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterTwo obj=new GreaterTwo(44,2,3);
		obj.greaterThree(obj.a, obj.b, obj.c);
		obj.greater(4, 8);
		obj.greaterThree(120, 343, 2112);
		obj.greaterThree(333, 777, 444);
		System.out.println();
		System.out.println(obj.hashCode());//to get a hashcode of object
		GreaterTwo obj1=obj;
		System.out.println(obj1.hashCode());
		GreaterTwo obj2=new GreaterTwo(1,2,3);
		System.out.println(obj2.hashCode());
	}
	void greater(int a,int b){
		if(a>b){
			System.out.println(a+" a is greater");
		}else{
			System.out.println(b+" b is greater");
		}
	}
	void greaterThree(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("a is greater");
		}else if(b>c){
			System.out.println("b is greater");
		}else{
			System.out.println("c is greater");
		}
	}
}
/* so conclusion is: you don't know the constructor topic very well.
 * */
 