package com.corejava.programs;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dinesh is a very good boy";
	
		String name[]=s.split(" "); //string[]
		for(int i=name.length-1;i>=0;i--){
			System.out.print(name[i]+ " ");//reverse string[]
		}
	}

}
//output:
//boy good very a is Dinesh
//String --> String[] -->reverse string[]