package com.corejava.patterns;

public class Pattern_7 {
	public static void main(String[] args){
		Pattern_7 obj = new Pattern_7();
		obj.pattern(15, 14);
	}
	void pattern(int n,int space){
		for(int i=1;i<=n;i++){
			for(int j=space;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int m=2;m<=i;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
