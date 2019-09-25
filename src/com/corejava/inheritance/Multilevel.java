package com.corejava.inheritance;

public class Multilevel{
	public static void main(String[] args){
		Cat obj = new Cat();
		int obje=obj.initial;
		System.out.println(obje);
		obj.study_ug();
	}
}

class Ant{
	char initial='M';
	void study(){
		System.out.println("10th");
	}
}

class Bear extends Ant{
	char initial='K';
	void study_pg(){
		System.out.println("Msc");
	}
}

class Cat extends Bear {
	int initial=3;
	void study_ug(){
		System.out.println("BE");
	}
}