package com.corejava.programs;

public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,2,5,6,1,77,6};
		int b[]={5,6,4,3,2};
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		int k=0;
		for(int i=a.length;i<c.length;i++){
			c[i]=b[k];
			k++;
		}
		
		//printing logic
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
	}

}
