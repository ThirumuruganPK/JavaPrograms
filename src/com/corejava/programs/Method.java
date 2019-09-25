package com.corejava.programs;


 public class Method {
	 int c;
	
	public static void main(String[] args){
		//object creation
		Method obj=new Method();
		obj.add();
		obj.percentage();
	}
	int add(){
		 int a=5,b=6;
		 c=a+b;
		 System.out.println("The addition value is"+ " "+c);
		 return c;
	 }
	void percentage(){
		double p;
		p=(double)c/100;
		System.out.println(p);
	}
}