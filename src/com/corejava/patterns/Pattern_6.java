package com.corejava.patterns;

public class Pattern_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=5;i++){
			for(int k=2;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=5;j>=count;j--){
				System.out.print("*");
			}
			count++;
			System.out.println();
		}
	}

}
