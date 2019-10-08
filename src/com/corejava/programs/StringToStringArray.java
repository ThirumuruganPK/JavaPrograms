package com.corejava.programs;

public class StringToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Welcome to RAVsoft.";
		
		//using split method we can convert 
		String s[] = name.split(" ");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		for(int i=s.length-1;i>=0;i--){
			System.out.println(s[i]);
		}
	}

}
/** reverse the string in the following order:
Welcome
to
RAVsoft.
*/
