package com.corejava.programs;

import java.util.*;

public class StrPrint{
	int a;
	String s="manaikandan"; //one way but use SCP
	String ss= new String("thirumurugan"); //another way but no SCP
	char c[] = new char[s.length()];
	Scanner sc = new Scanner(System.in);
	
	//class1 obj------
	//class2 obj------both is called grouping or has a relationship
	
	//System sys= new System();
	void add(){
		StrPrint a= new StrPrint();
	//a.sc.next();
		sc.next();
		//Scanner sc=null;
	}
	public static void main(String[] args) {
		
		StrPrint a= new StrPrint();
		System.out.println(a.sc.hashCode());
		// TODO Auto-generated method stub
		StrPrint obj = new StrPrint();
		System.out.println(obj.s.length()); //predefined method to get length a string
		System.out.println(obj.s);
		System.out.println(obj.ss);
		//convertion logic from string to char[]
		for(int i=0;i<obj.c.length;i++){
			obj.c[i]=obj.s.charAt(i);
		}
		
		//normal way of printing
		for(int i=0;i<obj.c.length;i++){
			System.out.print(obj.c[i]);
		}
		System.out.println();
		//reverse printing
		for(int i=obj.c.length-1;i>=0;i--){
			System.out.print(obj.c[i]);
		}
	}

}
