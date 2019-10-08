package com.corejava.programs;

public class ReverseEachWordInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to RAVsoft.";
		String name[]=s.split(" ");
		
		for(int i=0;i<name.length;i++){
			String x=name[i];
			for(int j=x.length()-1;j>=0;j--){
				System.out.print(x.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
