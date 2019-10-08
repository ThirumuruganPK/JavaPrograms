package com.corejava.programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Thirumurugan";
		char c[]=new char[name.length()];
		for(int i=0;i<name.length();i++){
			c[i]=name.charAt(i);
		}
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
	}

}
