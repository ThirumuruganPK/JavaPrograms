package com.corejava.programs;

public class ReverseMirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dinesh is a very good boy";
		
		char c[]=new char[s.length()];
		
		for(int i=0;i<s.length();i++){
			c[i]=s.charAt(i);
		}
		
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
	}

}
//output:
//yob doog yrew a si hseniD